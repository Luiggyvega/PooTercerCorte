package service;

import interfaces.OperacionesService;

import java.util.Scanner;

public class EmpleadoService {
    Scanner sc;
    private OperacionesService operacionesService;

    public EmpleadoService() {
    sc = new Scanner(System.in);
    }


    public void menu(){
        char opcion;
        do {
            System.out.println("ingrese una opcion");
            System.out.println("1. crear empleado");
            System.out.println("S. salir");
            opcion = sc.next().charAt(0);
            switch (opcion) {
                case '1' -> {
                    System.out.println("ingrese el tipo de contrato");
                    System.out.println("1. contrato fijo");
                    System.out.println("2. contrato indefinido");
                    System.out.println("3. contrato por prestacion de servicios");
                    int tipo = sc.nextInt();
                    if (tipo == 1) {
                        operacionesService = new EmpleadoFijo();
                        operacionesService.menu();
                    }
                    else if (tipo == 2){
                        operacionesService = new EmpleadoIndefinido();
                        operacionesService.menu();
                    }
                    else if (tipo == 3){
                        operacionesService = new EmpleadoPrestacionServicios();
                        operacionesService.menu();
                    }
                    else System.out.println("no se encuentra en las opciones");
                }
            }
        }while (opcion!='s');
    }
}
