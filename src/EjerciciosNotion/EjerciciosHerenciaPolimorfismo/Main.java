package EjerciciosNotion.EjerciciosHerenciaPolimorfismo;

/*
* 3. Clase Principal (`Main`):
    - En la clase principal, crea instancias de `Empleado`, `Gerente` y `Desarrollador`.
    - Calcula y muestra el salario anual de cada empleado utilizando el método `calcularSalarioAnual`.
    - Observa cómo el polimorfismo permite tratar a todas las instancias como objetos de la clase base `Empleado`.
* */

//____________________________________________________________________________________________________________________//

public class Main {

    public static void main(String[] args) {

        //Instancias
        Empleado empleadito= new Empleado("Facundo", 500000);
        Gerente Gerente1 = new Gerente("FacundoB", 225000, 12500);
        Desarrolador Desarrollador1 = new Desarrolador("Ezequiel Nievas", 50000,"Python");
        DesarroladorBackEnd Backensito = new DesarroladorBackEnd("Manuel", 750000, "Java");
        DesarroladorFrontEnd Frontensito = new DesarroladorFrontEnd("Luciano", 350000, "CSS");


        //Calculo los salarios y los imprimo por consola:
        System.out.println(empleadito.calcularSalarioAnual());
        System.out.println(Gerente1.calcularSalarioAnual());
        System.out.println(Desarrollador1.calcularSalarioAnual());

        //Ampliación:
        /*
            Amplía el sistema de cálculo de salarios para incluir subclases adicionales de la clase Desarrollador.
            Introduce nuevas características específicas para cada subclase y utiliza el polimorfismo para calcular los
            salarios anuales de manera adecuada.

            1. Subclases Adicionales de `Desarrollador`:
            - Crea dos subclases adicionales de `Desarrollador`, por ejemplo, `DesarrolladorFrontend` y `DesarrolladorBackend`.
            - Agrega atributos específicos para cada subclase, como `tecnologiasFrontend` y `tecnologiasBackend`.
            - Modifica el método `calcularSalarioAnual` para cada subclase, teniendo en cuenta las características adicionales.

            2. Clase Principal (`Main`):
            - En la clase principal, crea instancias de `DesarrolladorFrontend` y `DesarrolladorBackend`.
            - Calcula y muestra el salario anual de cada desarrollador, incluyendo las características específicas de sus subclases.
            - Aprovecha el polimorfismo para tratar a todas las instancias como objetos de la clase base **`Desarrollador`.
        */

        //Resultados de las dos subclases de Desarrollador:

        System.out.println(Backensito.calcularSalarioAnual());
        System.out.println(Frontensito.calcularSalarioAnual());
    }

}
