import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import Excepciones.PersonaNoEncontradaException;

public class Persona {

    private int dni;
    private boolean activo;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String localidad;
    private Provincia provincia;
    private LocalDate fechaNacimiento;
    private Sexo sexo; 

    private  static List<Persona> listaPersonas = new ArrayList<>();
    
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public boolean isActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getLocalidad() {
        return localidad;
    }
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public Provincia getProvincia() {
        return provincia;
    }
    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public Sexo getSexo() {
        return sexo;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    public Persona(int dni, String nombre, String apellido, String telefono, String direccion, Provincia provincia, String localidad, LocalDate fechaNacimiento, Sexo sexo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.provincia = provincia;
        this.localidad = localidad;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.activo = true;
    }

public void valNombre(String nombre) throws Excepciones.DatosInvalidosExecepciones{
    if (!Pattern.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+", nombre)){
        throw new Excepciones.DatosInvalidosExecepciones ("El Nombre Solo Puede Tener Letras");
    }
    this.nombre = nombre;
} 
public void valApellido(String apellido) throws Excepciones.DatosInvalidosExecepciones{
    if (!Pattern.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+", apellido)){
        throw new Excepciones.DatosInvalidosExecepciones("El Apellido Solo Puede Tener Letras");
    }
    this.apellido = apellido;
} 
public void valTelefono(String telefono) throws Excepciones.DatosInvalidosExecepciones{
    if (!Pattern.matches("\\d{7,15}", telefono)){
        throw new Excepciones.DatosInvalidosExecepciones ("El Numero de Telefono Debe Contene Entre 7 y 15 Digitos y Solo Numeros");
    }
    this.telefono = telefono;
} 
public void valProvincia(Provincia provincia) throws Excepciones.DatosInvalidosExecepciones{
    if (provincia == null){
        throw new Excepciones.DatosInvalidosExecepciones("La Provincia No Es Valida");
    }
    this.provincia = provincia;
} 
public void valSexo(Sexo sexo) throws Excepciones.DatosInvalidosExecepciones{
    if (sexo == null){
        throw new Excepciones.DatosInvalidosExecepciones ("El Sexo No Es Valido");
    }
    this.sexo = sexo;
} 
public void valDNI(int dni) throws Excepciones.DatosInvalidosExecepciones{
    if (dni < 1000000 || dni > 99999999){
        throw new Excepciones.DatosInvalidosExecepciones ("El DNI debe contener entre 7 y 8 digitos");
    }
    this.dni = dni;
}

public void mostrarDatos(){
    System.out.println("=====================================");
    System.out.println("           DATOS PERSONALES          ");
    System.out.println("=====================================");
    System.out.printf("%-15s: %d%n", "DNI", dni);
    System.out.printf("%-15s: %s %s%n", "Nombre", nombre, apellido);
    System.out.printf("%-15s: %s%n", "Teléfono", (telefono != null ? telefono : "No registrado"));
    System.out.printf("%-15s: %s%n", "Dirección", (direccion != null ? direccion : "No registrada"));
    System.out.printf("%-15s: %s%n", "Localidad", (localidad != null ? localidad : "No registrada"));
    System.out.printf("%-15s: %s%n", "Provincia", (provincia != null ? provincia.obtenerProvincia() : "No registrada"));
    System.out.printf("%-15s: %s%n", "Fecha Nac.", fechaNacimiento);
    System.out.printf("%-15s: %s%n", "Sexo", sexo.obtenerSexo());
    System.out.printf("%-15s: %s%n", "Estado", (activo ? "Activo" : "Inactivo"));
    System.out.println("=====================================");
}

public static Persona buscarPersona(int dni) throws Excepciones.PersonaNoEncontradaException {
    for(Persona p : listaPersonas){
        if (p.getDni() == dni){
            return p;
        }
    }
    throw new Excepciones.PersonaNoEncontradaException("No Existe Una Persona Con Ese Dni");
}

public static void listarPersonas(){
    if(listaPersonas.isEmpty()){
        System.out.println("No Hay Registro");
        return;
    }
    for(Persona p : listaPersonas){
        System.out.println(p.datosPersonal());
        System.out.println("----------------------");
    }
}








}



public void altaPersona() throws Excepciones.DatosInvalidosExecepciones {
    if(buscarPersona(dni).isPresent()){
        throw new Excepciones.DatosInvalidosExecepciones("Ya Existe Una Persona Con Ese DNI:"+ dni);
    }
}
public static Persona buscarPersona(String dni) throws Excepciones.DatosInvalidosExecepciones{
    if (!dni.matches("\\d{7,8}")){
        throw new Excepciones.DatosInvalidosExecepciones("El DNI debe contener entre 7 y 8 digitos y solo numeros");
    }
}

int dniNumero = Integer.parseInt(dni);  

for (Persona p : listaPersonas){
    if (p.getDni() == dniNumero){
        return p;
    }
}
throw new DatosInvalidosExecepciones("No se Encontro una Perosna con ese DNI");







