package EjerciciosPSeInt;

import java.util.Scanner;

//EJERCICIOS DE PSEINT


public class Ejercicios {

    //EJERCICIO DE BIENVENIDA
    public class Bienvenida {

        public static void main (String[] args){

            // Ejercicio 1 - Pedir al usuario nombre y apellido, darle la bienvenida al curso de JAVA.

            Scanner Leer = new Scanner(System.in);

            System.out.println("Ingresa tu Nombre: ");
            String Nombre = Leer.next();

            System.out.println("Ingresa tu apellido: ");
            String Apellido = Leer.next();

            System.out.println("Bienvenido " + Nombre + " " +  Apellido + " al curso de JAVA");
        }
    }

//______________________________________________________________________________________________________________________//

    //EJERCICIO DE PROMEDIO

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

//______________________________________________________________________________________________________________________//

    //EJERCICIO DE CONVERSOR DE TEMPERATURA

    public class ConversorTemperatura {

        public static void main (String[] args){

            Scanner Leer = new Scanner(System.in);

            System.out.println("Ingrese la temperatura en grados Celsius: ");
            float Temperatura = Leer.nextFloat();

            float Temp_Farenheit = (Temperatura * 9/5) + 32;

            System.out.println("Su equivalente en Farenheit es: " + Temp_Farenheit);

        }
    }

//______________________________________________________________________________________________________________________//

    //EJERCICIO DE FACTORIAL

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

//______________________________________________________________________________________________________________________//

    //EJERCICIO DE NUMERO PRIMO

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

//______________________________________________________________________________________________________________________//

    //EJERCICIO DE MOSTRAR LOS NUMEROS PRIMOS HASTA EL NUMERO QUE INGRESE EL USUARIO

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

//______________________________________________________________________________________________________________________//

    //EJERCICIO PARA DETERMINAR SI UN NUMERO ES PAR O IMPAR

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

//______________________________________________________________________________________________________________________//

    //EJERCICIO DE PRECIO CON DESCUENTO

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

//______________________________________________________________________________________________________________________//

    //EJERCICIO DE PASAJE DE METROS A PULGADAS

    public class Pulgadas {
        public static void main (String[] args){

            Scanner Leer = new Scanner(System.in);

            System.out.println("Ingrese en metros la distancia a convertir en pulgadas: ");
            float metros = Leer.nextFloat();

            float pulgadas = (float) (metros * 39.3701);

            System.out.println("La distancia en pulgadas es: " + pulgadas + " pulgadas");
        }
    }



}
