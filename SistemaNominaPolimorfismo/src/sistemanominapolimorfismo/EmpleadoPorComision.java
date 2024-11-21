package sistemanominapolimorfismo;
// La clase EmpleadoPorComision extiende a Empleado.
public class EmpleadoPorComision extends Empleado
{
    private double ventasBrutas;// ventas totales por semana
    private double tarifaComision;// porcentaje de comisión
    
// constructor
    public EmpleadoPorComision( String primerNombre, String apellidoPaterno, 
            String numeroSeguroSocial, double ventasBrutas, double tarifaComision )
    {
        super( primerNombre, apellidoPaterno, numeroSeguroSocial );
        setTarifaComision(tarifaComision);
        setVentasBrutas(ventasBrutas);
    }
    
    // establece el monto de ventas brutas
    public void setVentasBrutas(double ventasBrutas){
        if (ventasBrutas < 0.0){
            System.out.println("Las ventas brutas deben ser >= 0.0");
            this.ventasBrutas = 0;
        }
        else
            this.ventasBrutas = ventasBrutas;
    }
    
    // devuelve el monto de ventas brutas
    public double getVentasBrutas(){
        return ventasBrutas;
    }
    
    // establece la tarifa de comisión
    public void setTarifaComision(double tarifaComision){
        if (tarifaComision <= 0.0 || tarifaComision >= 1.0){ // valida
            System.out.println("La tarifa de comision debe ser > 0.0 y < 1.0");
            this.tarifaComision =0;
        }
        else
            this.tarifaComision = tarifaComision;
    }
    
    // devuelve la tarifa de comisión
    public double getTarifaComision()
    {
        return tarifaComision;
    }
    
    // calcula los ingresos; sobrescribe el método abstracto ingresos en Empleado
    @Override
    public double ingresos(){
        return getTarifaComision() * getVentasBrutas();
    }
    
    // devuelve representación String de un objeto EmpleadoPorComision
    @Override
    public String toString()
    {
        return "\nempleado por comision "+ super.toString()+
                "\nventas brutas "+ getVentasBrutas()+
                "\ntarifa de comision "+ getTarifaComision();
}

}
