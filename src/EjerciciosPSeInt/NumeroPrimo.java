package EjerciciosPSeInt;

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args){

        Scanner Leer = new Scanner(System.in);
        int Num_positivo;

        do {
            System.out.println("Porfavor ingrese un numero entero positivo: ");
            Num_positivo = Leer.nextInt();
        }while(Num_positivo < 0);

        boolean esPrimo = true;

        if (Num_positivo < 2 ) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(Num_positivo); i++) {
                if (Num_positivo % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }


    }

}
