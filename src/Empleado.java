import java.time.LocalDate;

public class Empleado {

    private LocalDate FechaIngreso;
    private LocalDate FechaEgreso;
    private int legajo;
    private double salario;
    
    public LocalDate getFechaIngreso() {
        return FechaIngreso;
    }
    public void setFechaIngreso(LocalDate fechaIngreso) {
        FechaIngreso = fechaIngreso;
    }
    public LocalDate getFechaEgreso() {
        return FechaEgreso;
    }
    public void setFechaEgreso(LocalDate fechaEgreso) {
        FechaEgreso = fechaEgreso;
    }
    public int getLegajo() {
        return legajo;
    }
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
