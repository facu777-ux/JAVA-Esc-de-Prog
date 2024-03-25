import java.util.Scanner;

public class NumPrimo2 {
    public static void main (String[] args){

        Scanner Leer = new Scanner(System.in);

        int numero;
        boolean esPrimo;

        System.out.println("Ingrese un numero: ");
        numero = Leer.nextInt();

        System.out.println("Numeros primos hasta " + numero + ":");
        for (int i = 2; i <= numero; i++) {
            esPrimo = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println(i);
            }
        }
    }
}
