package Service;

import Interface.OperacionesService;
import Interface.OperacionesSueldo;
import models.Docente;


import java.util.HashMap;
import java.util.Scanner;

public class DocenteService implements OperacionesService, OperacionesSueldo {
    public Docente docente;
    Scanner sc;
    private HashMap<String,Docente> listDocente;
    public DocenteService() {
    sc = new Scanner(System.in);
    listDocente = new HashMap<>();
    }


    @Override
    public void agregar() {

            boolean correcto = true;

            String documentoDeIdentidad = "";
            String codigo = "";
            String nombre = "";
            String correo = "";
            double salario = 0.0;
            String titulo = "";
            String asignatura = "";

            do {
                try{
                    System.out.println("Ingrese documento");
                    documentoDeIdentidad = sc.nextLine();
                    System.out.println("Ingrese Codigo ");
                    codigo = sc.nextLine();
                    System.out.println("Ingrese nombre");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese Correo");
                    correo = sc.nextLine();
                    System.out.println("Ingrese titulo");
                    titulo = sc.nextLine();
                    System.out.println("Ingrese asignatura");
                    asignatura = sc.nextLine();
                    System.out.println("Ingrese el salario");
                    salario = sc.nextDouble();
                }catch (Exception e){
                    System.out.println("Error al ingresar los datos " + e.getMessage());
                    System.out.println("Ingresa los datos nuevamente");
                }
            }while (correcto);
            Docente docente = new Docente(documentoDeIdentidad,codigo,nombre,correo,titulo,asignatura,salario);
            listDocente.put(docente.getDocumentoDeIdentidad(), docente);

        }


    @Override
    public void modificar() {
        System.out.println(" Ingresa el documento que quieres modificar: ");
        String documentoDeIdentidad = sc.nextLine();
        for (Docente docente : listDocente.values()){
            if (documentoDeIdentidad.equalsIgnoreCase(docente.getDocumentoDeIdentidad())){
                boolean correcto = true;
                do {
                    try {
                        System.out.println("Ingrese Codigo ");
                        docente.setCodigo(sc.nextLine());
                        System.out.println("Ingrese nombre");
                        docente.setNombre(sc.nextLine());
                        System.out.println("Ingrese Correo");
                       docente.setCorreo(sc.nextLine());
                        System.out.println("Ingrese titulo");
                        docente.setTitulo(sc.nextLine());
                        System.out.println("Ingrese asignatura");
                        docente.setAsignatura(sc.nextLine());
                        System.out.println("Ingrese el salario");
                        docente.getSueldo(sc.nextDouble());
                    }catch (Exception e){
                        System.out.println("Ingrese nuevamente los datos please =) ");
                    }
                }while (correcto);


            }
        }
    }

    @Override
    public void eliminar() {
    for (Docente docente : listDocente.values()){
        System.out.println("Ingrese el numero de identidad que quiere eliminar");
        String numeroDocumentoDeIdentidad = sc.nextLine();
        if (numeroDocumentoDeIdentidad.equalsIgnoreCase(docente.getDocumentoDeIdentidad())){
            listDocente.remove(docente.getDocumentoDeIdentidad());
        }else{
            System.out.println("No existe Crack! ");
        }

    }
    }

    @Override
    public void listar() {
    for (Docente docente : listDocente.values()){
        System.out.println("Docentes : " + docente);
    }
    }

    @Override
    public void menu() {
    char opcion;
    do {
        System.out.println(" 1. Agregar docente ");
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

    @Override
    public void calcularSueldo() {

    }
}
