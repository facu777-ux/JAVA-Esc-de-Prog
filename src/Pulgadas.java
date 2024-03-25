import java.util.Scanner;

public class Pulgadas {
    public static void main (String[] args){

        Scanner Leer = new Scanner(System.in);

        System.out.println("Ingrese en metros la distancia a convertir en pulgadas: ");
        float metros = Leer.nextFloat();

        float pulgadas = (float) (metros * 39.3701);

        System.out.println("La distancia en pulgadas es: " + pulgadas + " pulgadas");
    }
}
