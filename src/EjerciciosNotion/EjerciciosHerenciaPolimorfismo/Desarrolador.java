package EjerciciosNotion.EjerciciosHerenciaPolimorfismo;

/*
   2. **Subclases `Gerente` y `Desarrollador`:
   -Crea una subclase `Desarrollador` que herede de `Empleado`.
    Añade un atributo privado para el lenguaje de programación y déjalo sin cambios en el método `calcularSalarioAnual`.
*/

public class Desarrolador extends Empleado {

    //Atributos
    private String LenguajeProgramacion;

    //Constructor
    public Desarrolador(String nombre, double salario, String LenguajeProgramacion){
        super(nombre, salario);
        this.LenguajeProgramacion = LenguajeProgramacion;
    }

    //Metodo
    @Override
    public double calcularSalarioAnual (){
        return super.calcularSalarioAnual();
    }

}
