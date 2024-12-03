package Service;

import Interface.OperacionesService;
import models.Docente;
import models.Estudiante;

import java.util.HashMap;
import java.util.Scanner;

public class EstudianteService implements OperacionesService {
    public Estudiante estudiante;
    Scanner sc;
    private HashMap<String, Estudiante> listEstudiante;

    public EstudianteService() {
        sc = new Scanner(System.in);
        listEstudiante = new HashMap<>();
    }

    @Override
    public void agregar() {

        boolean correcto = true;
        String documentoDeIdentidad = "";
        String codigo = "";
        String nombre = "";
        String correo = "";
        double promedio = 0.0;
        String carrera = "";
        boolean presencial = false;

        do {
            try {
                System.out.println("Ingrese documento");
                documentoDeIdentidad = sc.nextLine();
                System.out.println("Ingrese Codigo ");
                codigo = sc.nextLine();
                System.out.println("Ingrese nombre");
                nombre = sc.nextLine();
                System.out.println("Ingrese Correo");
                correo = sc.nextLine();
                System.out.println("Ingrese promedio");
                promedio = sc.nextDouble();
                System.out.println("Ingrese la carrera");
                carrera = sc.nextLine();
                System.out.println("Ingrese 1 si es presencial" +
                                   "Ingrese 2 si es virtual");

                char opcion = sc.next().charAt(0);
                switch (opcion) {
                    case '1' -> presencial = true;
                    case '2' -> presencial = false;
                    default -> throw new IllegalAccessException("Opcion no valida");
                }
                correcto = false;
            } catch (Exception e) {
                System.out.println("Error de ingreso de datos " + e.getMessage());
                System.out.println("Ingrese nuevamente Porfavor.");
                correcto = true;
            }

        } while (correcto);
        Estudiante estudiante = new Estudiante(documentoDeIdentidad, codigo, nombre, correo, promedio, carrera, presencial);
        listEstudiante.put(estudiante.getDocumentoDeIdentidad(), estudiante);
    }


    @Override
    public void modificar() {
        System.out.println(" Ingresa el documento que quieres modificar: ");
        String documentoDeIdentidad = sc.nextLine();
        for (Estudiante estudiante : listEstudiante.values()) {
            if (documentoDeIdentidad.equalsIgnoreCase(estudiante.getDocumentoDeIdentidad())) {
                boolean correcto = true;
                boolean presencial = true;
                do {
                    try {
                        System.out.println("Ingrese Codigo ");
                        estudiante.setCodigo(sc.nextLine());
                        System.out.println("Ingrese nombre");
                        estudiante.setNombre(sc.nextLine());
                        System.out.println("Ingrese Correo");
                        estudiante.setCorreo(sc.nextLine());
                        System.out.println("Ingrese promedio");
                        estudiante.setPromedio(sc.nextDouble());
                        System.out.println("Ingrese carrera");
                        estudiante.setCarrera(sc.nextLine());
                        System.out.println("Ingrese 1. presencial o 2. virtual");
                        char opcion = sc.next().charAt(0);
                        switch (opcion) {
                            case '1' -> presencial = true;
                            case '2' -> presencial = false;
                            default -> throw new IllegalAccessException("Opcion no valida");
                        }
                        correcto = false;
                    } catch (Exception e) {
                        System.out.println("Error de ingreso de datos " + e.getMessage());
                        System.out.println("Ingrese nuevamente Porfavor.");
                        correcto = true;

                    }


                } while (correcto);
            }
        }


    }

    @Override
    public void eliminar() {
        for (Estudiante estudiante : listEstudiante.values()){
            System.out.println("Ingrese el numero de identidad que quiere eliminar");
            String numeroDocumentoDeIdentidad = sc.nextLine();
            if (numeroDocumentoDeIdentidad.equalsIgnoreCase(estudiante.getDocumentoDeIdentidad())){
                listEstudiante.remove(estudiante.getDocumentoDeIdentidad());
            }else{
                System.out.println("No existe Crack! ");
            }

        }
    }

    @Override
    public void listar() {
        for (Estudiante estudiante : listEstudiante.values()){
            System.out.println("Docentes : " + estudiante);
        }
    }

    @Override
    public void menu() {
        char opcion;
        do {
            System.out.println(" 1. Agregar Estudiante ");
            System.out.println(" 2. Modificar ");
            System.out.println(" 3. Eliminar ");
            System.out.println(" 4. Listar ");
            System.out.println(" 5. Salir");
            opcion =sc.nextLine().charAt(0);
            switch (opcion){
                case '1' -> agregar();
                case '2' -> modificar();
                case '3' -> eliminar();
                case '4' -> listar();
                default -> System.out.println("Volviste al principio =) ");
            }
        }while (opcion!='5');
    }
    }

