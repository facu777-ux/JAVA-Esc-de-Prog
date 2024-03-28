package EjerciciosNotion.IntroJava;

import java.util.Scanner;

public class ValidacionContraseña {
    /*
    * Crea un programa que solicite al usuario ingresar una contraseña.
    * El programa debe validar la contraseña según el criterio de una longitud mínima caracteres.
    * Ingrese nuevamente la contraseña y corroborar que ambas sean iguales.
    */

    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        String password = "";
        String validpassword = "";

        do {
            System.out.println("Ingrese una contraseña: ");
            password = leer.nextLine();

            if (password.length() < 8){
                System.out.print("La contraseña debe contener al menos 8 caracteres. ");
            }
        }while (password.length() < 8);


        do {
            System.out.println("Ingrese la contraseña nuevamente, recuerde que ambas contraseñas deben coincidir: ");
            validpassword = leer.nextLine();

            if (!validpassword.equals(password)) {
                System.out.print("Las contraseñas son distintas. ");
            }else {
                System.out.print("Las contraseñas coinciden.");
                break;
            }

        }while (!password.equals(validpassword));



    }

}
