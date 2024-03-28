package EjerciciosNotion.ArraysFunciones;

import java.util.Scanner;

public class RegistroDeContactos {
    // APLICACIÓN DE REGISTRO DE CONTACTOS
    /*
    * Diseña una aplicación que permita a un usuario administrar una lista de contactos.
    * La aplicación deberá ser capaz de agregar nuevos contactos, buscar contactos existentes
    * y mostrar la lista de todos los contactos almacenados.
    * Utiliza dos arrays: uno para los nombres de los contactos y otro para los números de teléfono.
    *
    * La aplicación debe incluir las siguientes funciones:
    * 1 - agregarContacto: Esta función debe permitir al usuario ingresar un nombre y un número de teléfono
    *                      para un nuevo contacto y agregarlos a la lista de contactos.
    *
    * 2 - buscarContacto: Esta función debe permitir al usuario buscar un contacto por nombre
    *                     y mostrar la información del contacto si se encuentra.
    *                     De lo contrario, mostrar un mensaje indicando que el contacto no se encontró.
    *
    * 3 - mostrarContactos: Esta función debe mostrar la lista completa de contactos con sus nombres y números de
    *                       teléfono.
    *
    * El programa principal debe proporcionar un menú interactivo que permita al usuario seleccionar estas opciones y
    * realizar las operaciones deseadas.
    * Asegúrate de gestionar adecuadamente la capacidad de almacenamiento de contactos y proporcionar salidas claras
    * y comprensibles.
    */
//____________________________________________________________________________________________________________________//

    static class Contacto{
        //Atributos de la clase
        private String nombre;
        private long numero;

        //Métodos de la clase

        /*Constructor de la clase:
        * Toma dos parámetros (nombre y numero) y los asigna a los atributos nombre y numero de la clase.
        * */
        public Contacto(String nombre, long numero){
            //Asigno los valores de los parámetros a los atributos de la clase.
            this.nombre = nombre;
            this.numero = numero;
        }

        //Método público que devuelve el nombre del contacto para cuando lo quiera obtener y mostrar al usuario
        public String getNombre() {
            return nombre;
        }

        //Establezco el nombre del contacto
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        //Método público que devuelve el numero del contacto para cuando lo quiera obtener y mostrar al usuario
        public long getNumero() {
            return numero;
        }

        //Establezco el numero del contacto
        public void setNumero(int numero) {
            this.numero = numero;
        }
    }
//____________________________________________________________________________________________________________________//
    public static void AgregarContacto (Contacto[] contactos){
        Scanner leer = new Scanner(System.in);
        long numero;
        String nombre;

        System.out.println("Ingrese el nombre del contacto:");
        nombre = leer.nextLine();

        do {
            System.out.println("Ingrese el número del contacto:");
            numero = Long.parseLong(leer.nextLine());
        }while (numero < 0);


        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) {
                contactos[i] = new Contacto(nombre, numero);
                System.out.println("Contacto agregado correctamente.");
                break;
            }
        }
    }
//____________________________________________________________________________________________________________________//
    public static void BuscarContacto(Contacto[] contactos){
        Scanner leer = new Scanner(System.in);
        String nombreBuscado;

        System.out.println("Porfavor ingrese el nombre del contacto que desea buscar: ");
        nombreBuscado = leer.nextLine();

        boolean encontrado = false;

        for (Contacto contacto : contactos) {
            if (contacto != null && contacto.getNombre().equalsIgnoreCase(nombreBuscado)){
                System.out.println("Contacto encontrado!!!");
                System.out.println(contacto.getNombre() + " " + contacto.getNumero());
                encontrado = true;
                break;
            }else {
                System.out.println("El contacto no se encontró :'( ");
            }
        }

    }
//____________________________________________________________________________________________________________________//
    public static void MostrarContactos(Contacto[] contactos){
        System.out.println("Aquí tienes la lista completa con los datos de todos los contactos: ");
        System.out.println("Nombre\tNumero");
        for (Contacto contacto : contactos) {
            if (contacto != null) {
                System.out.println(contacto.getNombre() + "\t" + contacto.getNumero());
            }
        }
    }
//____________________________________________________________________________________________________________________//
    public static void main (String[] args){
        Contacto[] contactos = new Contacto[50];
        int opcion;
        Scanner leer = new Scanner(System.in);

        //Le pregunto al usuario qué desea realizar
        do {
            System.out.println("¿Qué desea realizar?:\n1- Agregar Contacto\n2- Bucar Contacto\n3- Mostrar Contactos\n4- Salir");
            opcion = leer.nextInt();

            switch (opcion){
                case 1:
                    AgregarContacto(contactos);
                    break;
                case 2:
                    BuscarContacto(contactos);
                    break;
                case 3:
                    MostrarContactos(contactos);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Por favor, ingrese una opción válida.");
                    break;
            }
        }while (opcion != 4);
        //Para que cuando termine de realizar alguna de las otras 3, que tenga la posibilidad de realizar otra acción.



        leer.close();
    }
}
