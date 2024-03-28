package EjerciciosNotion.ArraysFunciones;

import java.util.Scanner;

public class AnalisisDeDatos {

    //PROGRAMA DE ANÁLISIS DE DATOS
    /*
    * Diseña un programa en Java que permita a un usuario ingresar una serie de números y realice un análisis de esos datos.
    * El programa debe incluir las siguientes funciones:
    *
    * 1 - encontrarMaximo: Esta función debe tomar un arreglo de números como entrada y encontrar el número máximo en el conjunto.
    *     Devuelve el número máximo encontrado.
    *
    * 2 - encontrarMinimo: Esta función debe tomar un arreglo de números como entrada y encontrar el número mínimo en el conjunto.
    *     Devuelve el número mínimo encontrado.
    *
    * 3 - calcularPromedio: Esta función debe calcular y devolver el promedio de los números en el conjunto.
    *
    * 4 - contarNumerosPares: Esta función debe contar la cantidad de números pares en el conjunto y devolver ese número.
    *
    * El programa principal debe realizar lo siguiente:

    - Solicitar al usuario la cantidad de números que desea ingresar.
    - Pedir al usuario que ingrese los números uno por uno y almacenarlos en un arreglo.
    - Utilizar las funciones mencionadas para calcular y mostrar lo siguiente:
        - El número máximo en el conjunto.
        - El número mínimo en el conjunto.
        - El promedio de los números en el conjunto.
        - La cantidad de números pares en el conjunto.

      El programa debe ser modular y utilizar las funciones mencionadas para llevar a cabo estas tareas.
      Asegúrate de manejar adecuadamente las entradas de usuario y proporcionar salidas claras y comprensibles.
    */

    public static int EncontrarMaximo (int[] nums){
        int max = nums[0];

        //comparo entre elementos
        for (int i = 0; i < nums.length; i++) {
            if (nums [i] > max){
                max = nums[i];
            }
        }

        return max;
    }

    public static int EncontrarMinimo (int[] nums){
        int min = nums[0];

        //comparo entre elementos
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min){
                min = nums[i];
            }
        }

        return min;
    }

    public static double Promedio (int[] nums){
        int acumulador = 0, contador = nums.length;

        //recorro el array sumando los valores y contando la cantidad de notas
        for (int i = 0; i < nums.length; i++) {
            acumulador += nums[i];
        }

        //calculo el promedio y devuelvo el valor
        return (double) acumulador / contador;
    }

    public static int Pares (int[] nums){
        int cont = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                cont++;
            }
        }
        return cont;
    }


    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);

        int numeros, dimension;
        int[] nums;

        //Le pido al usuario que determine la cant de numeros que desa ingresar para determinar el tamaño del array.
        do {
            System.out.println("Ingrese la cantidad de numeros que desea ingresar: ");
            dimension = leer.nextInt();
        }while (dimension <= 0);

        //Dispongo el tamaño del array segun el usuario.
        nums = new int[dimension];

        for (int i = 0; i < dimension; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + ": ");
            nums[i] = leer.nextInt();
        }

        //Encuentro el valor más alto que haya ingresado el usuario
        int maximo = EncontrarMaximo(nums);

        //Encuentro el valor más chico que haya ingresado el usuario
        int minimo = EncontrarMinimo(nums);

        //Calculo el promedio de los numeros ingresados en el array
        double promedio = Promedio(nums);

        //Cuento la cantidad de numeros pares
        int cantPares = Pares(nums);

        System.out.println("El valor más alto en tu conjunto de " + dimension + " elementos es: " + maximo +
                ", el valor mas pequeño: " + minimo + ", entre los elementos calculamos un promedio = " + promedio
                + " y  la cantidad de pares en el conjunto = " + cantPares + ".");

    }


}
