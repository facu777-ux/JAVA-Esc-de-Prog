import java.util.Scanner;

public class Calculadora_de_suma_y_Promedio {

    public static void main(String[] args){

        Scanner Leer = new Scanner(System.in);

        int Suma = 0;
        int Contador = 0;

        do {
            System.out.println("Ingrese una serie de números");
            int Num = Leer.nextInt();

            Suma += Num;
            Contador++;

            System.out.println("Desea ingresar otro número?: S / N");
            String respuesta = Leer.next();

            if (!respuesta.equalsIgnoreCase("S")) {
                break;
            }

        }while (true);

        float Promedio = Suma / Contador;

        System.out.println("La suma de los números ingresados es: " + Suma + " y su promedio es: " + Promedio);

    }

}
