import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

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
    public Persona(int dni, boolean activo, String nombre, String apellido, LocalDate fechaNacimiento, Sexo sexo) {
        this.dni = dni;
        this.activo = activo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }
    public Persona(int dni, boolean activo, String nombre, String apellido, String telefono, LocalDate fechaNacimiento,
            Sexo sexo) {
        this.dni = dni;
        this.activo = activo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }
    public Persona(int dni, boolean activo, String nombre, String apellido, String telefono, String direccion,
            LocalDate fechaNacimiento, Sexo sexo) {
        this.dni = dni;
        this.activo = activo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }
    public Persona(int dni, boolean activo, String nombre, String apellido, String telefono, String direccion,
            String localidad, LocalDate fechaNacimiento, Sexo sexo) {
        this.dni = dni;
        this.activo = activo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.localidad = localidad;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }
    public Persona(int dni, boolean activo, String nombre, String apellido, String telefono, String direccion,
            String localidad, Provincia provincia, LocalDate fechaNacimiento, Sexo sexo) {
        this.dni = dni;
        this.activo = activo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.localidad = localidad;
        this.provincia = provincia;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }
    

    public static void crearPersona(){
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Ingrese su Nombre:");
        String nombre = entradaTeclado.nextLine();
        System.out.println("Ingrese su Apellido");
        String apellido = entradaTeclado.nextLine();
        System.out.println("Ingrese su Numero de Telefono");
        String telefono = entradaTeclado.nextLine();
        System.out.println("Ingrese su Direccion");
        String direccion = entradaTeclado.nextLine();
        System.out.println("Ingrese su Localidad");
        String localidad = entradaTeclado.nextLine();

        System.out.println("Seleccione el sexo entre las siguientes opciones:");
        for (Sexo sexo : Sexo.values()) {
            System.out.println("- " + sexo);
        }
        System.out.print("Ingrese el sexo (MASCULINO, FEMENINO, OTROS): ");
        Sexo sexo = null;
        boolean sexoValido = false;

        while (!sexoValido) {
            try {
                String entradaSexo = entradaTeclado.nextLine().toUpperCase();
                sexo = Sexo.valueOf(entradaSexo);
                sexoValido = true;
            } catch (IllegalArgumentException e) {
                System.out.print("Opción no válida. Ingrese el sexo nuevamente (MASCULINO, FEMENINO, OTROS): ");
            }
        }
        
    }
    public ArrayList <Persona> listarPersonas = new ArrayList <Persona>();

    public Persona buscarPersona(int dni){
        //CREAR PRINTF PARA BUSCAR DNI DE PERSONA
        for (Persona persona : listarPersonas) {
            if (persona.getDni() == dni) {
                return persona;
            }
        }
        return null;
        
    }
}
