import java.util.Scanner;

public class Factorial {
    public static void main (String[] args){

        Scanner Leer = new Scanner(System.in);
        int Num_positivo;

        do {
            System.out.println("Ingrese un numero entero no negativo");
            Num_positivo = Leer.nextInt();
        }while(Num_positivo < 0);

        int Factorial = 1;
        int originalNum = Num_positivo;
        while (Num_positivo > 0){
            Factorial = Factorial * Num_positivo;
            Num_positivo--;
        }

        System.out.println("El factorial del numero " + originalNum + " es : " + Factorial);
    }
}
