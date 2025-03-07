import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int vidas = 5;
        int puntos = 0;

        mostrarMenu();

        System.out.println("Vidas: " + vidas + " Puntos: " + puntos);

        while (vidas > 0 && puntos < 11) {
            System.out.println("\nPresiona Enter para lanzar el dado...");
            scanner.nextLine();

            int resultadoDado = random.nextInt(6) + 1;

            System.out.println("Resultado del dado: " + resultadoDado);

            if (resultadoDado == 1) {
                vidas--;
                System.out.println("Pierdes 1 vida");
            } else if (resultadoDado == 6) {
                puntos += 3;
                System.out.println("Ganas 3 puntos");
            } else if (resultadoDado == 2 || resultadoDado == 4) {
                puntos++;
                System.out.println("Ganas 1 punto");
            } else {
                System.out.println("No pasa nada.");
            }

            System.out.println("Vidas: " + vidas + " Puntos: " + puntos);
        }

        if (vidas == 0) {
            System.out.println("\nPerdiste");
        } else {
            System.out.println("\nGanaste");
        }

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("--- Menú del Juego de Dados ---");
        System.out.println("1: Pierdes 1 vida");
        System.out.println("2 o 4: Ganas 1 punto");
        System.out.println("3 o 5: No pasa nada");
        System.out.println("6: Ganas 3 puntos");
        System.out.println("--------------------------------");
    }
}