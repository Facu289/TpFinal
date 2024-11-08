public class Usuario {

    private String usuario;
    private String clave;
    private Persona propietario;
    
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public Persona getPropietario() {
        return propietario;
    }
    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

}
