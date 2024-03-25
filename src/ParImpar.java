import java.util.Scanner;

public class ParImpar {
    public static void main (String[] args){
        //Ejercicio 2 - Pedirle al usuario que igrese un numero, y el programa determine si es par o impar
        Scanner Leer = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int Num = Leer.nextInt();

        if (Num % 2 == 0) {
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }
    }
}
