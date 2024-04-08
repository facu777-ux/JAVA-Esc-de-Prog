package EjerciciosNotion.MascotaVirtual;
import java.util.Scanner;

public class Mascota {

    //atributos
    private String Nombre;
    private double Energia, peso;
    private int humor;
    private int cantComer;
    private boolean dormido;

    private final double maxEnergia = 100;
    private final double minEnergia = 0;

    //Constructor
    public Mascota(String nombre, int energia, int humor, int cantComer, double peso, boolean dormido) {
        Nombre = nombre;
        Energia = energia;
        this.humor = humor;
        this.cantComer = cantComer;
        this.peso = peso;
        this.dormido = false;
    }

    //Métodos

    public void comer() {
        if (!dormido) {
            Energia += 20;
            peso += 0.5;
            humor++;
            cantComer++;
            if (Energia > maxEnergia) {
                Energia = (int) maxEnergia;
            }
        }
        System.out.println("Que riiiiicoooooo :))))))");
    }

    public void dormir() {
        dormido = true;
        System.out.println("No me molestés, estoy dormido...zzzz");
    }

    public void despertar() {
        dormido = false;
        System.out.println("Estoy despierto!!!");
    }

    public void caminar() {
        if (!dormido) {
            Energia -= 10;
            peso -= 0.2;
            humor++;
            if (Energia < minEnergia) {
                Energia = 0;
            }
        }
        System.out.println("Caminar me gusta mucho más que correr");
    }

    public void correr() {
        if (!dormido) {
            Energia -= 30;
            peso -= 0.5;
            humor++;
            if (Energia < minEnergia) {
                Energia = minEnergia;
            }
        }
        System.out.println("Estoy cansado jefe, no me haga correr :((((");
    }

    public void obtenerEnergia() {
        Energia += 10;
        if (Energia > maxEnergia) {
            Energia = maxEnergia;
        }
        System.out.println("La energía de la mascota se ha incrementado.");
    }

    public boolean estaVivo() {
        return Energia > minEnergia;
    }

    public int getHumor() {
        return humor;
    }

    public double getPeso() {
        return peso;
    }

    public double getEnergia() {
        return Energia;
    }
}
