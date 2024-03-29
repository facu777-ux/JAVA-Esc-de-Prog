package EjerciciosNotion.ClasesYObjetos;

import java.util.Scanner;

public class Cuenta_Bancaria {

    /*
    EJERCICIO 1: CLASE "CUENTA BANCARIA"
    *Diseña una clase "CuentaBancaria" que contenga atributos como el número de cuenta y el saldo.
    *Implementa métodos para depositar, retirar y consultar saldo.
    *En el método main, crea una instancia de "CuentaBancaria", realiza depósitos y retiros, y muestra el saldo actual.
    */

    static class CuentaBancaria{

        //ATRIBUTOS DE LA CLASE
        private String numeroCuenta;
        private double saldo;

        public double getSaldo(){return saldo;}

        public CuentaBancaria(String numeroCuenta, double saldoInicial){
            this.numeroCuenta = numeroCuenta;
            this.saldo = saldoInicial;
        }

        //MÉTODOS DE LA CLASE
        public void depositar(double cantidad){
            saldo += cantidad;
            System.out.println("Depósito de " + cantidad + " realizado. Tu Saldo actual: " + saldo);
        }

        public void retirar(double cantidad){
            //Condición por si se excede el monto de retiro respecto del sueldo disponible.
            if (saldo >= cantidad){
                saldo -= cantidad;
                System.out.println("Retiro de " + cantidad + " realizado. Tu Saldo actual es: " + saldo);
            }else{
                System.out.println("Saldo insuficiente para realizar el retiro");
            }

        }

        public double consultarSaldo(){
            return saldo;
        }

    }
//____________________________________________________________________________________________________________________//
    public static void main(String[] args){

        Scanner leer = new Scanner(System.in);
        int opcion;

        //Le pregunto al usuario el numero de cuenta y el saldo inicial con el que quiera operar.
        System.out.println("Ingresa el número de cuenta: ");
        String numeroCuenta = leer.nextLine();

        System.out.println("Ingresa el saldo inicial: ");
        double saldoInicial = leer.nextDouble();

        //creo la instancia en base a los datos proporcionados por el usuario
        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, saldoInicial);

        //Le doy un menú para que realice alguno de los métodos disponibles para la clase.
        do {
            System.out.println("¿Qué quieres hacer?:\n1- Depositar\n2-Retirar\n3-ConsultarSaldo\n4-Nada");
            opcion = leer.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese la cantidad a depositar");
                    double cantidadDepositada = leer.nextDouble();
                    cuenta.depositar(cantidadDepositada);
                    break;
                case 2:
                    //Primero le aviso cuánto dinero dispone para que tenga una idea de hasta cuánto retirar.
                    System.out.println("Ten en cuenta que tu saldo actual es de: " + cuenta.getSaldo());
                    System.out.println("Ingrese la cantidad que desea retirar: ");
                    double cantidadRetirada = leer.nextDouble();
                    cuenta.retirar(cantidadRetirada);
                    break;
                case 3:
                    System.out.println("Tu saldo actual es de: " + cuenta.consultarSaldo());
                    break;
                case 4:
                    System.out.println("Adiós ...");
                default:
                    System.out.println("Opción no válida.");
            }
        }while (opcion != 4);

        leer.close();
    }
}
