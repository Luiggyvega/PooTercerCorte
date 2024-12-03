package models;

public class EmpleadoTerminoFijo extends Empleado {

    public EmpleadoTerminoFijo(int numeroId, String nombre, String apellido, double sueldo, int cumplimientoDeProyecto, int proyectosQueParticipa) {
        super(numeroId, nombre, apellido, sueldo, cumplimientoDeProyecto, proyectosQueParticipa);
    }

    @Override
    public double SueldoTotal() {
        double sueldo = 0;
        if (getCumplimientoDeProyecto()>90){
            sueldo = (getSueldo()*0.08)+getSueldo();
        }
        return sueldo;
    }
}
