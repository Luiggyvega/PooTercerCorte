package models;

import java.util.Scanner;

public class Estudiante extends Miembro {
    private double promedio;
    private String carrera;
    private boolean presencial;

    public Estudiante(String documentoDeIdentidad, String codigo, String nombre, String correo, double promedio, String carrera, boolean presencial) {
        super(documentoDeIdentidad, codigo, nombre, correo);
        this.promedio = promedio;
        this.carrera = carrera;
        this.presencial = presencial;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public boolean isPresencial() {
        return presencial;
    }

    public void setPresencial(boolean presencial) {
        this.presencial = presencial;
    }




    @Override
    public String toString() {
        return "Estudiante{" +
                "promedio=" + promedio +
                ", carrera='" + carrera + '\'' +
                ", presencial='" + presencial + '\'' +
                "} " + super.toString();
    }
}