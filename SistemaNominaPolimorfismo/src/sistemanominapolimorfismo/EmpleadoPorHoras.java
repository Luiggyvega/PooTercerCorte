/*
La clase EmpleadoPorHoras también extiende a Empleado . La clase incluye un
constructor que recibe un primer nombre, un apellido paterno, un número de seguro
social, un sueldo por horas y el número de horas trabajadas.
 */
package sistemanominapolimorfismo;

public class EmpleadoPorHoras extends Empleado
{
    private double sueldo; // sueldo por hora
    private double horas; // horas trabajadas por semana

    // constructor
    public EmpleadoPorHoras(String primerNombre, String apellidoPaterno,
            String numeroSeguroSocial, double sueldo, double horas)
    {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        setSueldo(sueldo);
        setHoras(horas);
    }

    // establece el sueldo
    public void setSueldo(double sueldo)
    {
        if (sueldo < 0.0){ // valida sueldo
            System.out.println("El sueldo por horas debe ser >= 0.0");
            this.sueldo =0;
        }
        else
            this.sueldo = sueldo;
    }

    // devuelve el sueldo
    public double getSueldo()
    {
        return sueldo;
    }

    // establece las horas trabajadas
    public void setHoras(double horas)
    {
        if ((horas < 0.0) || (horas > 168.0)){ // valida horas
            System.out.println("Las horas trabajadas deben ser >= 0.0 y <= 168.0");
            this.horas = 0;
        }
        else
            this.horas = horas;
    }

    // devuelve las horas trabajadas
    public double getHoras()
    {
        return horas;
    }

    // calcula los ingresos; sobrescribe el método abstracto ingresos en Empleado
    @Override
    public double ingresos()
    {
        if (getHoras() <= 40) // no hay tiempo extra
            return getSueldo() * getHoras();
        else
            return 40 * getSueldo() + (getHoras() - 40) * getSueldo() * 1.5;
    }
    @Override
    public String toString()
    {
        return "\nempleado por horas: "+super.toString()
                +"\nsueldo por hora "+getSueldo()
                +"\nhoras trabajadas "+getHoras();
    }
}
