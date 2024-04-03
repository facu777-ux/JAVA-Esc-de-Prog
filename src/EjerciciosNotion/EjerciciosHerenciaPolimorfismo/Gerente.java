package EjerciciosNotion.EjerciciosHerenciaPolimorfismo;

import java.util.Set;

/*
* 2. **Subclases `Gerente` y `Desarrollador`:
    -Crea una subclase `Gerente` que herede de `Empleado`.
     Añade un atributo privado para el bono anual y sobrescribe el método `calcularSalarioAnual` para incluir el bono.
*/
public class Gerente extends Empleado {
    //Atributos
    private double BonoAnual;

    //Constructor
    public Gerente(String nombre, double salario, double bonoAnual) {
        super(nombre, salario);
        this.BonoAnual = bonoAnual;
    }

    public void setBonoAnual(double bonoAnual) {
        BonoAnual = bonoAnual;
    }

    //Metodo con Bono Anual
    @Override
    public double calcularSalarioAnual (){
        return super.calcularSalarioAnual() + BonoAnual;
    }

}
