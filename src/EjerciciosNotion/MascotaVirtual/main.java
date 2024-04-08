package EjerciciosNotion.MascotaVirtual;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Mascota perrito = new Mascota("Teófilo", 100, 75, 0, 198, true);

        Scanner leer = new Scanner(System.in);
        int op;
            do {
                System.out.println("Eliga opcion 1-Comer, 2-Dormir, 3-Despertar, 4-Caminar, 5-Correr, 6-Energia, 7-Esta vivo?, 8-Ver estado de mascota, 9-Salir");
                System.out.println("ingrese el valor: ");
                op = leer.nextInt();
                switch (op){
                    case 1:
                        perrito.comer();
                        break;
                    case 2:
                        perrito.dormir();
                        break;
                    case 3:
                        perrito.despertar();
                        break;
                    case 4:
                        perrito.caminar();
                        break;
                    case 5:
                        perrito.correr();
                        break;
                    case 6:
                        perrito.obtenerEnergia();
                        break;
                    case 7:
                        perrito.estaVivo();
                        if (perrito.estaVivo()) System.out.println("Está vivo!!");
                        else System.out.println("Está re muerto compadre... :'( ");
                        break;
                    case 8:
                        System.out.println("Energía de la mascota: " + perrito.getEnergia());
                        System.out.println("Peso de la mascota: " + perrito.getPeso());
                        System.out.println("Humor de la mascota: " + perrito.getHumor());
                        System.out.println("¿Está vivo? " + perrito.estaVivo());
                        break;
                    case 9:
                        System.out.println("Adios.....");
                    default:
                        System.out.println("Ingresa una opcion correcta");
                }

            }while (op != 9);

            leer.close();
    }
}
