import java.util.Scanner;

/**
 * Este programa says "¡Buenos días!", "¡Buenas tardes!" or "¡Buenas noches!"
 * depending of the hour given
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio15 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce el caracter para pintar la pirámide: ");
        char c = s.next().charAt(0);
        System.out.print("Introduce la altura de la pirámide: ");
        int height = s.nextInt();
        System.out.print(
                "Introduce la posición del vértice de la pirámide (1 (arriba), 2 (abajo), 3 (derecha), 4 (izquierda): ");
        int apex = s.nextInt();
        s.close();
        switch (apex) {
            case 1:
                for (int i = 1; i <= height; i++) {
                    for (int j = height - i; j > 0; j--)
                        System.out.print(" ");
                    for (int j = i * 2 - 1; j > 0; j--)
                        System.out.print(c);
                    System.out.println();
                }
                break;
            case 2:
                for (int i = height; i > 0; i--) {
                    for (int j = height - i; j > 0; j--)
                        System.out.print(" ");
                    for (int j = i * 2 - 1; j > 0; j--)
                        System.out.print(c);
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 1; i <= height; i++) {
                    for (int j = i; j > 0; j--)
                        System.out.print(c);
                    System.out.println();
                }
                for (int i = height - 1; i >= 1; i--) {
                    for (int j = i; j > 0; j--)
                        System.out.print(c);
                    System.out.println();
                }
                break;
            case 4:
                for (int i = 1; i <= height; i++) {
                    for (int j = height - i; j > 0; j--)
                        System.out.print(" ");
                    for (int j = i; j > 0; j--)
                        System.out.print(c);
                    System.out.println();
                }
                for (int i = height - 1; i >= 1; i--) {
                    for (int j = height - i; j > 0; j--)
                        System.out.print(" ");
                    for (int j = i; j > 0; j--)
                        System.out.print(c);
                    System.out.println();
                }
                break;
            default:
                System.out.print("No existe esa posición para el vértice");
        }
    }
}