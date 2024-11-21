/*
 La clase Empleado proporciona los métodos ingresos y toString, además de los métodos
obtener que manipulan las variables de instancia de Empleado. Es evidente que un método ingresos se
aplica en forma genérica a todos los empleados. Pero cada cálculo de los ingresos depende de la clase específica
del empleado. Por lo tanto, declaramos a ingresos como abstract en la superclase Empleado, ya que
una implementación predeterminada específica no tiene sentido para ese método, puesto que no hay suficiente
información para determinar qué monto debe devolver ingresos.
 */
package sistemanominapolimorfismo;

public abstract class Empleado {
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;
    private final String primerNombre;
    // constructor
    public Empleado(String primerNombre, String apellidoPaterno, 
            String numeroSeguroSocial)
    {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    // devuelve el primer nombre
    public String getPrimerNombre()
    {
        return primerNombre;
    }

    // devuelve el apellido paterno
    public String getApellidoPaterno()
    {
        return apellidoPaterno;
    }

    // devuelve el número de seguro social
    public String getNumeroSeguroSocial()
    {
        return numeroSeguroSocial;
    }
    
    // devuelve representación String de un objeto Empleado    
    public String toString(){
        return "\n"+getPrimerNombre()+" "+getApellidoPaterno()
                +"\nnumero de seguro social: "+getNumeroSeguroSocial();
    }    
    // método abstracto sobrescrito por las subclases concretas
    public abstract double ingresos(); // aquí no hay implementación
  }
