package EjerciciosNotion.EjerciciosHerenciaPolimorfismo;

//Subclase de Desarrollador
public class DesarroladorFrontEnd extends Desarrolador{

    public DesarroladorFrontEnd(String nombre, double salario, String LenguajeProgramacion) {
        super(nombre, salario, LenguajeProgramacion);
    }


    @Override
    public double calcularSalarioAnual() {
        return super.calcularSalarioAnual() * 2 + 12000;
    }
}
