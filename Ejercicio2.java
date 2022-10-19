import java.util.Scanner;

/**
 * Este programa pide una hora por teclado y muestra luego buenos días, buenas
 * tardes o buenas noches según la hora. Se utilizan los tramos de 6 a 12, de 13
 * a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las horas, los
 * minutos no se deben introducir por teclado.
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("¿Qué hora es? (0-23): ");
        int hour = s.nextInt();
        s.close();
        if (hour < 0 || hour > 23)
            System.out.print("¡El día no tiene tantas horas!");
        else if (hour > 5 && hour <= 12)
            System.out.print("¡Buenos días!");
        else if (hour > 12 && hour <= 20)
            System.out.print("¡Buenas tardes!");
        else
            System.out.print("¡Buenas noches!");
    }
}
