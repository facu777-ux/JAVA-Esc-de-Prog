import java.util.Scanner;

public class ConversorTemperatura {

    public static void main (String[] args){

        Scanner Leer = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en grados Celsius: ");
        float Temperatura = Leer.nextFloat();

        float Temp_Farenheit = (Temperatura * 9/5) + 32;

        System.out.println("Su equivalente en Farenheit es: " + Temp_Farenheit);

    }
}
