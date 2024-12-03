package service;

import java.util.Scanner;

public class EmpleadoService {
    Scanner sc;
    public EmpleadoService() {
    sc = new Scanner(System.in);
    }


    public void menu(){
        char opcion;
        do {
            System.out.println("ingrese una opcion");
            System.out.println("1. crear empleado");
            System.out.println("2. Mostrar empleados");
            System.out.println("S. salir");
            opcion = sc.next().charAt(0);
            switch (opcion) {

            }
        }
    }
}
