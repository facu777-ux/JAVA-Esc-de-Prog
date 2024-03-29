package EjerciciosNotion.ClasesYObjetos;

import java.util.Scanner;

public class Clase_Estudiante {

    static class Estudiante{
        //Atributos
        private String nombre;
        private int edad;
        private int[] calificaciones;

        //Constructor
        public Estudiante(String nombre, int edad, int[] calificaciones){
            this.nombre = nombre;
            this.edad = edad;
            this.calificaciones = calificaciones;
        }

        //Método para calcular el promedio
        public double calcularPromedio(){
            double promedio = 0;
            int acum = 0;

            for (int i = 0; i < calificaciones.length; i++) {
                acum += calificaciones[i];
            }

            //Saco la cuenta para determinar el promedio y transformo a acum en el mismo tipo de dato que prom
            promedio = (double) acum / calificaciones.length;

            return promedio;
        }

        //Método para obtener el nombre del estudiante
        public String getNombre(){return nombre;}
    }

    public static void CargaDeDatos(Estudiante student){
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = leer.nextLine();

        System.out.println("Ingrese la edad del estudiante: ");
        int edad = leer.nextInt();

        System.out.println("Ingrese la cantidad de calificaciones a ingresar: ");
        int cantidadCalificaciones = leer.nextInt();
        int[] calificaciones = new int[cantidadCalificaciones];

        for (int i = 0; i < cantidadCalificaciones; i++) {
            System.out.println("Ingrese la calificación " + (i + 1) + ": ");
            calificaciones[i] = leer.nextInt();
        }

        student.nombre = nombre;
        student.edad = edad;
        student.calificaciones = calificaciones;
    }

    public static void VerifNom (Estudiante[] students, String nom){
        for (Estudiante student : students) {
            if (student != null && student.getNombre().equalsIgnoreCase(nom)) {
                System.out.println("El promedio del estudiante " + student.getNombre() + " es de: " + student.calcularPromedio());
            }
        }
    }

    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        int opcion, dimension;

        System.out.println("Bienvenido al sistema de alumnos");

        //Para crear la instancia de Estudiantes en base a la cantidad de estudiantes que tenga.
        do {
            System.out.println("Ingrese la cantidad de estudiantes que dispone: ");
            dimension = leer.nextInt();
        }while (dimension <= 0);

        Estudiante[] students = new Estudiante[dimension];

        //MENÚ
        do {
            System.out.println("¿Qué desea realizar?:\n1-Cargar Datos\n2- Calcular promedio\n3- Salir");
            opcion = leer.nextInt();

            switch (opcion){
                case 1:
                    for (int i = 0; i < students.length; i++) {
                        if (students[i] == null){
                            students[i] = new Estudiante("", 0, new int[0]);
                            CargaDeDatos(students[i]);
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del estudiante: ");
                    String nom = leer.next();
                    VerifNom(students, nom);
                    break;
                case 3:
                    System.out.println("Adios...");
                    break;
                default:
                    System.out.println("Ingrese una opción válida.");
            }
        }while (opcion != 3);

        leer.close();
    }
}
