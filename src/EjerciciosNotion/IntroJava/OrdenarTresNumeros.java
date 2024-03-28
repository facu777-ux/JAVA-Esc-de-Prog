package EjerciciosNotion.IntroJava;

import java.util.Scanner;

public class OrdenarTresNumeros {
    /*
    * Escribe un programa que solicite al usuario ingresar tres números.
    * El programa debe utilizar sentencias if-else para determinar y mostrar los números en orden ascendente.
    * */

    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        double num1, num2, num3;

        System.out.println("Ingrese el primer numero:");
        num1 = leer.nextDouble();

        System.out.println("Ingrese el segundo numero:");
        num2 = leer.nextDouble();

        System.out.println("Ingrese el tercer numero:");
        num3 = leer.nextDouble();


        if (num1 == num2 && num1 == num3) {
            System.out.println("Los 3 numeros son iguales.");
        } else if (num1 < num2 && num1 < num3) {
            if (num2 < num3) System.out.println("Los numeros en orden ascendente quedarían: " + num1 + ", " + num2 + ", " + num3);
            if (num2 > num3) System.out.println("Los numeros en orden ascendente quedarían: " + num1 + ", " + num3 + ", " + num2);
        } else if (num2 < num1 && num2 < num3) {
            if (num1 > num3) System.out.println("Los numeros en orden ascendente quedarían: " + num2 + ", " + num3 + ", " + num1);
            if (num1 < num3) System.out.println("Los numeros en orden ascendente quedarían: " + num2 + ", " + num1 + ", " + num3);
        } else if (num3 < num1 && num3 < num2) {
            if (num1 > num2) System.out.println("Los numeros en orden ascendente quedarían: " + num3 + ", " + num2 + ", " + num1);
            if (num1 < num2) System.out.println("Los numeros en orden ascendente quedarían: " + num3 + ", " + num1 + ", " + num2);
        }
    }
}
