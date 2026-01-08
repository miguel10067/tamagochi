package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int o;
        do {
            o = mostrarMenu(lector);

            System.out.println("Has elegido la opción: " + o);

        } while (o != 0);
    }

    private static int mostrarMenu(Scanner lector) {
        int o;
        do {
            System.out.println("\n--- MENU TAMAGOTCHI ---");
            System.out.println("1. Estado");
            System.out.println("2. Comer");
            System.out.println("3. Jugar");
            System.out.println("4. Dormir");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion del menu: ");

            o = lector.nextInt();

            if (o < 0 || o > 4) {
                System.out.println("La opción no es válida, intentalo de nuevo.");
            }
        } while (o < 0 || o > 4);

        return o;
    }
}

