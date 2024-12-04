package service;

import interfaces.OperacionesService;
import models.Empleado;
import models.EmpleadoTerminoFijo;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpleadoPrestacionServicios implements OperacionesService {
    Scanner sc;
    ArrayList<Empleado> empleados;
    public EmpleadoPrestacionServicios() {
        sc = new Scanner(System.in);
        empleados = new ArrayList<>();
    }
    @Override
    public void mostrarEmpleados() {
        System.out.println("los empleados con contrato de prestacion de servicio son:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }

    }

    @Override
    public void crearEmpleado() {
        System.out.println("ingrese numero de Id");
        int numeroId = sc.nextInt();
        System.out.println("ingrese nombre");
        String nombre = sc.next();
        System.out.println("ingrese apellido");
        String apellido = sc.next();
        System.out.println("ingrese sueldo");
        double sueldo = sc.nextDouble();
        System.out.println("ingrese del 1 al 100 el cumplimiento del proyecto, el % se le agrega automaticamente");
        int cumplimiento = sc.nextInt();
        System.out.println("ingrese la cantidad de proyectos en la que participa");
        int proyectos = sc.nextInt();
        Empleado empleado = new EmpleadoTerminoFijo(numeroId, nombre, apellido, sueldo, cumplimiento, proyectos);
        empleados.add(empleado);
    }

    @Override
    public void modificarEmpleado() {

    }

    @Override
    public void eliminarEmpleado() {
        System.out.println("vas a eliminar un empleado");
        System.out.println("ingrese numero de Id");
        int numeroId = sc.nextInt();
        for (Empleado empleado : empleados) {
            if (empleado.getNumeroId() == numeroId) {
                empleados.remove(empleado);
                System.out.println("el empleado se ha eliminado");
                break;
            }
        }

    }

    @Override
    public void menu() {
        char opcion;
        do {
            System.out.println("1. para crear un empleado con prestacion de servicios");
            System.out.println("2. para modificar los empleados");
            System.out.println("3. para eliminar algun empleado");
            System.out.println("4 para mostrar empleados");
            System.out.println("s. para salir");
            opcion = sc.next().charAt(0);
            switch (opcion) {
                case '1'-> crearEmpleado();
                case '2' -> modificarEmpleado();
                case '3' -> eliminarEmpleado();
                case '4' -> mostrarEmpleados();
                default -> System.out.println("Opcion no valida");
            }

        }while (opcion!='s');

    }
    }

