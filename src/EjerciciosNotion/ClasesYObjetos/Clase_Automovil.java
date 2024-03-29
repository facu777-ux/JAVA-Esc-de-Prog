package EjerciciosNotion.ClasesYObjetos;

import java.util.Scanner;

public class Clase_Automovil {

    //CLASE
    static class Automovil{

        //Atributos
        private String marca, modelo;
        private double velocidadAct;
        private double combustible = 100, bateria = 100;

        //constructor
        public Automovil(String marca, String modelo){
            this.marca = marca;
            this.modelo = modelo;
            this.velocidadAct = 0;
        }

        //Métodos
        public void acelerar(double incremento){

            if (incremento < 0 || incremento >320) System.out.println("Ingresa un valor válido y " +
                    "ten en cuenta que límite es 320 km/h");
            if (incremento > 0 && incremento <= 320 && combustible > 0 && bateria > 0) {
                velocidadAct += incremento;
                combustible -= 5; //consumo de combustible
                bateria -= 1; //consumo de bateria al acelerar
                System.out.println("Incremento de velocidad aplicado.");
                System.out.println("Ahora la velocidad actual del vehículo es:" + velocidadAct);
            }else if (incremento > 0 && (combustible < 0 || bateria < 0)) {
                System.out.println("No se puede acelerar. Verifica que la bateria y el combustible sean suficientes.");
            }
        }

        public void frenar (double decremento){

            while (velocidadAct > 0){
                if (decremento > 0){
                    velocidadAct -= decremento;
                    System.out.println(velocidadAct + "\n");
                }
            }
            System.out.println("el auto ha frenado por completo");
        }

        public void mostrarInformcion(){
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Velocidad Actual: " + velocidadAct);
            System.out.println("Nivel de combustible: " + combustible);
            System.out.println("Nivel de bateria: " + bateria);
        }
    }

//____________________________________________________________________________________________________________________//

    //PRINCIPAL
    public static void main (String[] args){
        //Creo la instancia auto para Automovil
        Automovil auto = new Automovil("Mercedez", "2024"); //Auto de ejemplo
        Scanner leer = new Scanner(System.in);
        int opcion;

        //MENU
        do {
            System.out.println("Elija una opción:\n1- Acelerar Auto\n2- Frenar auto\n3- Mostrar Información\n4- Salir");
            opcion = leer.nextInt();

            switch (opcion){
                case 1:
                    double incremento;

                    //Verificación de un valor válido
                    do {
                        System.out.println("Espcifique el incremento de velocidad:");
                        incremento= leer.nextDouble();
                        if (incremento < 0) {
                            System.out.println("Especifique un valor válido.");
                        }
                    }while (incremento < 0);

                    //llamo al método de la clase y le mando el valor especificado por el usuario
                    auto.acelerar(incremento);
                    break;
                case 2:
                    double decremento;

                    //Verificación de un valor válido
                    do {
                        System.out.println("Especifique el decremento de velocidad:");
                        decremento = leer.nextDouble();
                        if (decremento < 0) {
                            System.out.println("Especifique un valor válido.");
                        }
                    }while(decremento < 0);

                    //llamo al método de la clase y le mando el valor especificado por el usuario.
                    auto.frenar(decremento);
                    break;
                case 3:
                    auto.mostrarInformcion();
                    break;
                case 4:
                    System.out.println("Adios...");
                    break;
                default:
                    System.out.println("Ingrese una opcion válida");
            }
        }while (opcion != 4);

        leer.close();
    }
}
