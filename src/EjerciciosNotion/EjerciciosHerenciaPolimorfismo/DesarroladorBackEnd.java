package EjerciciosNotion.EjerciciosHerenciaPolimorfismo;

//Subclase de Desarrollador
public class DesarroladorBackEnd extends Desarrolador{

    public DesarroladorBackEnd(String nombre, double salario, String LenguajeProgramacion) {
        super(nombre, salario, LenguajeProgramacion);
    }

    @Override
    public double calcularSalarioAnual() {
        return super.calcularSalarioAnual() * 3;
    }
}
