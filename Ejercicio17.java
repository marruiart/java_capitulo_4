import java.util.Scanner;

/**
 * Este programa dice cuál es la última cifra de un número entero introducido
 * por teclado.
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio17 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduce un número: ");
        long num = s.nextLong();
        s.close();
        long lastDigit = num % 10;
        System.out.print("La última cifra del número introducido es " + lastDigit);
    }
}
