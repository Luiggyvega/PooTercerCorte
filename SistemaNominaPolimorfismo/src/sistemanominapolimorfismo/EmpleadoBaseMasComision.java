package sistemanominapolimorfismo;

// La clase EmpleadoBaseMasComision extiende a EmpleadoPorComision.
public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    private double salarioBase; // salario base por semana
    
    // constructor
    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno,
            String numeroSeguroSocial, double ventasBrutas,
            double tarifaComision, double salarioBase){
        super(primerNombre, apellidoPaterno, numeroSeguroSocial,ventasBrutas, 
                tarifaComision);
        setSalarioBase(salarioBase);
    }
    
    // establece el salario base
    public void setSalarioBase(double salarioBase){
        if (salarioBase < 0.0){ // valida el salarioBase
            System.out.println("El salario base debe ser >= 0.0");
            this.salarioBase =0;
        }
        else
            this.salarioBase = salarioBase;
    }
    
    // devuelve el salario base
    public double getSalarioBase(){
        return salarioBase;
    }
    // calcula los ingresos; sobrescribe el método ingresos en EmpleadoPorComision
    @Override
    public double ingresos(){
        return getSalarioBase() + super.ingresos();
    }
    
    // devuelve representación String de un objeto EmpleadoBaseMasComision
    @Override
    public String toString(){
        return "\ncon salario base "+super.toString()
        +"\nsalario base "+getSalarioBase();
    }
}
