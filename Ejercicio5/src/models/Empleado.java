package models;

public abstract class Empleado {
    private int NumeroId;
    private String Nombre;
    private String Apellido;
    private double sueldo;
    private int cumplimientoDeProyecto;
    private int proyectosQueParticipa;

    public Empleado(int numeroId, String nombre, String apellido, double sueldo, int cumplimientoDeProyecto, int proyectosQueParticipa) {
        NumeroId = numeroId;
        Nombre = nombre;
        Apellido = apellido;
        this.sueldo = sueldo;
        this.cumplimientoDeProyecto = cumplimientoDeProyecto;
        this.proyectosQueParticipa = proyectosQueParticipa;
    }
    public abstract double SueldoTotal();

    @Override
    public String toString() {
        return "Empleado{" +
                "NumeroId=" + NumeroId +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", sueldo=" + sueldo +
                ", cumplimientoDeProyecto=" + cumplimientoDeProyecto +
                ", proyectosQueParticipa=" + proyectosQueParticipa +
                '}';
    }

    public int getNumeroId() {
        return NumeroId;
    }

    public void setNumeroId(int numeroId) {
        NumeroId = numeroId;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getCumplimientoDeProyecto() {
        return cumplimientoDeProyecto;
    }

    public void setCumplimientoDeProyecto(int cumplimientoDeProyecto) {
        this.cumplimientoDeProyecto = cumplimientoDeProyecto;
    }

    public int getProyectosQueParticipa() {
        return proyectosQueParticipa;
    }

    public void setProyectosQueParticipa(int proyectosQueParticipa) {
        this.proyectosQueParticipa = proyectosQueParticipa;
    }
}
