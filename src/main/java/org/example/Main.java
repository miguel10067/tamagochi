package org.example;
import java.util.Scanner;
public class Main {
    static int saciedad = 6;
    static int energia = 6;
    static int diversion = 6;

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int o;
        do {
            o = mostrarMenu(lector);

            switch (o) {
                case 5:
                    curar();
                    break;
                case 4:
                    jugar();
                    break;
                case 3:
                    dormir();
                    break;
                case 2:
                    comer();
                    break;
                case 1:
                    mostrarEstado();
                    break;
                case 0:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Esta opcion no existe.");
                    break;
            }
        } while (o != 0);
    }

    private static void mostrarEstado() {
        System.out.println("\n--- ESTADO ACTUAL ---");
        System.out.println("Saciedad: " + saciedad + " | Energía: " + energia + " | Diversión: " + diversion);

        if (saciedad <= 0 || energia <= 0 || diversion <= 0) {
            System.out.println("(x_x) Game Over");
            System.exit(0);
        } else if (diversion <= 4) {
            System.out.println("(-,-) Estoy aburrido");
        } else if (energia <= 4) {
            System.out.println("(-_-) Zzz");
        } else if (saciedad <= 4) {
            System.out.println("(·.·) Tengo hambre!");
        } else {
            System.out.println("(^.^) ¡Estoy feliz!");
        }
    }

    private static int mostrarMenu(Scanner lector) {
        int o;
        do {
            System.out.println("\n--- MENU TAMAGOTCHI ---");
            System.out.println("1. Estado");
            System.out.println("2. Comer");
            System.out.println("3. Jugar");
            System.out.println("4. Dormir");
            System.out.println("5. Curar");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion del menu: ");

            o = lector.nextInt();

            if (o < 0 || o > 45 {
                System.out.println("La opción no es válida, intentalo de nuevo.");
            }
        } while (o < 0 || o > 5);

        return o;
    }

    private static void comer() {
        if (saciedad < 10) {
            saciedad += 3;
            if (saciedad > 10) saciedad = 10;
            diversion -= 1;
            System.out.println("Gracias por la comida.");
            mostrarEstado();
        } else {
            System.out.println("No tengo hambre.");
        }
    }

    private static void jugar() {
        if (diversion < 10) {
            diversion += 3;
            if (diversion > 10) diversion = 10;
            saciedad -= 1;
            energia -= 1;
            System.out.println("Valee");
            mostrarEstado();
        } else {
            System.out.println("Ahora no me apetece jugar.");
        }
    }

    private static void dormir() {
        if (energia < 10) {
            energia += 3;
            if (energia > 10) energia = 10;
            saciedad -= 3;
            diversion -= 2;
            System.out.println("Buenas noches");
            mostrarEstado();
        } else {
            System.out.println("Ahora no tengo sueño.");
        }
    }
    private static void curar(){
        if (saciedad <= 2 || energia <= 2 || diversion <= 2) {
            System.out.println("\nGracias por la medicina, ahora estoy mejor.");
            saciedad = 5;
            energia = 5;
            diversion = 5;
        } else {
            System.out.println("\nNo necesito medicina, estoy bien");
        }
        mostrarEstado();
    }
    }
}

