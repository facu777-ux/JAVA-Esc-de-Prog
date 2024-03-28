package EjerciciosNotion.IntroJava;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;

public class ConversorMonedas {
    /*
    * Desarrolla un programa que permita al usuario convertir una cantidad de pesos argentinos a dolares.
    * El usuario debe ingresar la cantidad en pesos, y el programa debe realizar la conversión y mostrar el resultado.
    * Utiliza una tasa de conversión fija.
    */

    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        leer.useLocale(Locale.US);

        double pesos;

        do {
            System.out.println("Porfavor ingrese la cantidad de pesos que desea cambiar por dolares: ");
            pesos = leer.nextDouble();
        }while (pesos < 0);

        double dolares = pesos * 0.0012;

        DecimalFormat df = new DecimalFormat("#.##");
        String dolarFormat = df.format(dolares);

        System.out.println("La cantidad de pesos especificada equivale a: " + dolarFormat + " dolares.");







    }
}
