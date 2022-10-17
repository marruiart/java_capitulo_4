import java.util.Scanner;

/**
 * This program says "¡Buenos días!", "¡Buenas tardes!" or "¡Buenas noches!"
 * depending of the hour given
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("What time is it? (0-23): ");
        int hour = s.nextInt();
        if (hour < 0 || hour > 23)
            System.out.print("The day doesn't have so many hours!");
        else if (hour > 5 && hour <= 12)
            System.out.print("¡Buenos días!");
        else if (hour > 12 && hour <= 20)
            System.out.print("¡Buenas tardes!");
        else
            System.out.print("¡Buenas noches!");
    }
}
