package EjerciciosNotion.EjerciciosHerenciaPolimorfismo;

/*
* 1. **Clase `Empleado`:**
    -Crea una clase **`Empleado`** con atributos privados para el nombre y el salario mensual.
    -Implementa un método **`calcularSalarioAnual`** que devuelva el salario anual multiplicando el salario mensual por 12.
* */

//____________________________________________________________________________________________________________________//
public class Empleado {

    //Atributos
    private String nombre;
    private double salario;

    //Constructor
    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    //Metodo
    public double getSalario() {
        return salario;
    }

    //Metodo para el salario anual
    public double calcularSalarioAnual (){
        return salario * 12;
    }
}




