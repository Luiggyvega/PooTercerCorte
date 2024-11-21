package sistemanominapolimorfismo;
// Programa de prueba para la jerarquía de Empleado.
public class Principal {

    
    public static void main(String[] args) {
        // crea objetos de las subclases
        Empleado empleadoAsalariado = 
                new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00);
        Empleado empleadoPorHoras =
                new EmpleadoPorHoras("Karen", "Price", "222-22-2222", 16.75, 40);
        Empleado empleadoPorComision =
                new EmpleadoPorComision("Sue", "Jones", "333-33-3333", 5000, 0.06);
        Empleado empleadoBaseMasComision =
                new EmpleadoBaseMasComision("Bob", "Lewis", "444-44-4444", 5000, 0.04, 300);
        /*
        System.out.println("Empleados procesados por separado:");
        System.out.println(empleadoAsalariado+"\ningresos "
                +empleadoAsalariado.ingresos());
        System.out.println(empleadoPorHoras+"\ningresos "
                +empleadoPorHoras.ingresos());
        System.out.println(empleadoPorComision+" ingresos "
                +empleadoPorComision.ingresos());
        System.out.println(empleadoBaseMasComision+"\ningresos "
                +empleadoBaseMasComision.ingresos());
        */
       
        // crea un arreglo Empleado de cuatro elementos
        Empleado[] empleados = new Empleado[4];
        
        // inicializa el arreglo con objetos Empleado
        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoPorHoras;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoBaseMasComision;
        
        System.out.println("\nEmpleados procesados en forma polimorfica:");
        
        // procesa en forma genérica a cada elemento en el arreglo de empleados
        for (Empleado empleadoActual : empleados){
           System.out.println(empleadoActual); // invoca a toString
           
           // determina si el elemento es un EmpleadoBaseMasCo0mision
           if (empleadoActual instanceof EmpleadoBaseMasComision){
               // conversión descendente de la referencia de Empleado
               // a una referencia de EmpleadoBaseMasComision
               EmpleadoBaseMasComision empleado =
                       (EmpleadoBaseMasComision) empleadoActual;
               empleado.setSalarioBase(1.10 * empleado.getSalarioBase());
               System.out.println("el nuevo salario base con 10% de aumento es: "
                       +empleado.getSalarioBase());
           }
           System.out.println("ingresos "+ empleadoActual.ingresos());
        }
         
        // obtiene el nombre del tipo de cada objeto en el arreglo de empleados
        /*for (int j = 0; j < empleados.length; j++){
            System.out.println("El empleado "+j+ " es un "
                    +empleados[j].getClass().getName());
        }*/
                
    }
}
