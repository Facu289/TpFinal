package Base;

public enum Sexo {
    MASCULINO, FEMENINO, OTROS;

    public String obtenerSexo(){
        return this.name();
    }
}
