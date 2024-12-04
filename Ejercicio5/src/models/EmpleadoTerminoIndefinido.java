package models;

public class EmpleadoTerminoIndefinido extends Empleado {
    public EmpleadoTerminoIndefinido(int numeroId, String nombre, String apellido, double sueldo, int cumplimientoDeProyecto, int proyectosQueParticipa) {
        super(numeroId, nombre, apellido, sueldo, cumplimientoDeProyecto, proyectosQueParticipa);
    }

    @Override
    public double SueldoTotal( ) {
        double sueldo = getSueldo();
        if (getCumplimientoDeProyecto()>90){
            sueldo = (getSueldo()*0.10)+getSueldo();
        }
        return sueldo;
    }

    @Override
    public String toString() {
        return super.toString() +  "EmpleadoTerminoIndefinido{}" + " el sueldo final es= " + SueldoTotal();
    }
}
