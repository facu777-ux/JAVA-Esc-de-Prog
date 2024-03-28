package EjerciciosNotion.IntroJava;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;

public class CalculadoraIMC {

    /*
     * Crea un programa que solicite al usuario ingresar su peso (en kilogramos) y su altura (en metros).
     * Luego, calcula el IMC (peso / altura^2) y muestra un mensaje indicando si la persona tiene un peso bajo,
     * normal, sobrepeso o obesidad, según los valores típicos del IMC.
     */
    //_____________________________________________________________________________________________________________/

    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        leer.useLocale(Locale.US);

        double peso, altura;

        //Le pido su peso y verifico que sea un valor válido
        do {
            System.out.println("Porfavor, ingrese su peso (en kilogramos): ");
            peso = leer.nextDouble();
        }while(peso <= 0);

        /*Le pido su altura y verifico que sea un valor válido
        (es importante utilizar un punto y no una coma para especificarla)*/
        do {
            System.out.println("Porfavor, ingrese su altura (en metros): ");
            altura = leer.nextDouble();
        }while(altura <= 0);

        //Calculo el IMC
        double IMC = (peso / Math.pow(altura, 2));

        //Muestro el valor del IMC con solo dos decimales
        DecimalFormat df = new DecimalFormat("#.##");
        String IMCFormateado = df.format(IMC);

        //Muestro un mensaje calificando el peso de la persona según los estandares del IMC

        String mensaje = "tu IMC es igual a: " + IMCFormateado;

        if (IMC < 18.5){
            System.out.println("Tienes un peso bajo," + " " + mensaje);
        } else if (IMC <= 24.9) {
            System.out.println("Tu peso es normal," + " " + mensaje);
        } else if (IMC <= 29.9) {
            System.out.println("Tienes sobrepeso," + " " + mensaje);
        } else {
            System.out.println("Tienes obesidad," + " " + mensaje);
        }
    }
}
