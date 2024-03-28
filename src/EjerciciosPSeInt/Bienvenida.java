package EjerciciosPSeInt;

import java.util.Scanner;

public class Bienvenida {

    public static void main (String[] args){

        // Ejercicio 1 - Pedir al usuario nombre y apellido, darle la bienvenida al curso de JAVA.

        Scanner Leer = new Scanner(System.in);

        System.out.println("Ingresa tu Nombre: ");
        String Nombre = Leer.next();

        System.out.println("Ingresa tu apellido: ");
        String Apellido = Leer.next();

        System.out.println("Bienvenido " + Nombre + " " +  Apellido + " al curso de JAVA");
    }
}
