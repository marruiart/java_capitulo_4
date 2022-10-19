import java.util.Scanner;

/**
 * Este programa dice cuál es la primera cifra de un número entero introducido
 * por teclado. Se permiten números de hasta 5 cifras.
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio18 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduce un número: ");
        int num = s.nextInt();
        int tmp = num;
        int length = 0;
        s.close();

        while (tmp > 0) {
            tmp /= 10;
            length++;
        }

        int firstDigit = num / (int) Math.pow(10, length - 1);
        System.out.print("La primera cifra del número introducido es " + firstDigit);
    }
}
