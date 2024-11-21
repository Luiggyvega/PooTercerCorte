/*
La clase EmpleadoAsalariado extiende a la clase Empleado y sobrescribe el método
abstracto ingresos, lo cual convierte a EmpleadoAsalariado en una clase concreta
 */
package sistemanominapolimorfismo;

public class EmpleadoAsalariado extends Empleado {
    private double salarioSemanal;
    // constructor
    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno,
    String numeroSeguroSocial, double salarioSemanal)
    {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        
        setSalarioSemanal(salarioSemanal);
    }   
    // establece el salario
    public void setSalarioSemanal(double salarioSemanal)
    {
        if (salarioSemanal < 0.0){
            System.out.println("El salario semanal debe ser >= 0.0");
            this.salarioSemanal =0;
        }
        else
            this.salarioSemanal = salarioSemanal;
    }
    // devuelve el salario
    public double getSalarioSemanal()
    {
        return salarioSemanal;
    }

    // calcula los ingresos; sobrescribe el método abstracto ingresos en Empleado
    @Override
    public double ingresos()
    {
        return getSalarioSemanal();
    }

    // devuelve representación String de un objeto EmpleadoAsalariado
    @Override
    public String toString()
    {
        return "\nempleado asalariado: "+super.toString()
                +"\nsalario semanal: "+getSalarioSemanal();
    }
}
