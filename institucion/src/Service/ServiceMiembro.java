package Service;

import Interface.OperacionesService;
import models.Docente;
import models.Estudiante;
import models.Miembro;

import java.util.HashMap;
import java.util.Scanner;

public class ServiceMiembro {
    private OperacionesService operacionesService;

    Scanner sc;


    public ServiceMiembro() {
        sc = new Scanner(System.in);
    }
    public void menu(){
        char opcion;
        do {
            System.out.println("1. Agregar Estudiante: ");
            System.out.println("2. Agregar Docente : ");
            System.out.println("3. Salir: ");
            opcion = sc.next().charAt(0);
            switch (opcion) {
                case '1' -> {
                    operacionesService = new EstudianteService();
                    operacionesService.menu();
                }
                case '2' ->{
                    operacionesService = new DocenteService();
                    operacionesService.menu();
                }
                default -> System.out.println("Opcion invalida");
            }
        }while (opcion!='3');
    }





}
