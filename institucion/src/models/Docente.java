package models;

public class Docente extends Miembro{
    private String titulo;
    private String asignatura;
    private double sueldo;

    public Docente(String documentoDeIdentidad, String codigo, String nombre, String correo, String titulo, String asignatura, double sueldo) {
        super(documentoDeIdentidad, codigo, nombre, correo);
        this.titulo = titulo;
        this.asignatura = asignatura;
        this.sueldo = sueldo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public double getSueldo(double v) {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "titulo='" + titulo + '\'' +
                ", asignatura='" + asignatura + '\'' +
                ", sueldo=" + sueldo +
                "} " + super.toString();
    }
}
