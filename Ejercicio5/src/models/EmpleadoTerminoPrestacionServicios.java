package models;

public class EmpleadoTerminoPrestacionServicios extends Empleado {
    public EmpleadoTerminoPrestacionServicios(int numeroId, String nombre, String apellido, double sueldo, int cumplimientoDeProyecto, int proyectosQueParticipa) {
        super(numeroId, nombre, apellido, sueldo, cumplimientoDeProyecto, proyectosQueParticipa);
    }

    @Override
    public double SueldoTotal( ) {
        double sueldo = getSueldo();
        if (getCumplimientoDeProyecto()>90){
            sueldo = ((getSueldo()*0.02)*getProyectosQueParticipa())+getSueldo();
        }
        return sueldo;
    }

    @Override
    public String toString() {
        return super.toString() +  "EmpleadoTerminoPrestacionServicios{}" + " sueldo final=" + SueldoTotal();
    }
}
