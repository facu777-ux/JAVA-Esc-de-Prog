package EjerciciosPSeInt;

import java.util.Scanner;

public class PrecioDescuento {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int precioart;
        float porDescuento;
        float precioDescuento;


        System.out.println("Porfavor ingrese el precio del artículo");
        precioart = Leer.nextInt();

        System.out.println("Ingrese un porcentaje de descuento: ");
        porDescuento = Leer.nextFloat();

        float descuento = precioart * (porDescuento / 100);
        precioDescuento = precioart - descuento;

        System.out.println("El precio final, una vez aplicado el descuento es: " + precioDescuento);

        Leer.close();


    }
}