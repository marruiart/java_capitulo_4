import java.util.Scanner;

/**
 * Este programa dada una hora determinada (horas y minutos), calcula los
 * segundos que faltan para llegar a la medianoche
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio11 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la hora (0 to 23): ");
        int hours = s.nextInt();
        System.out.print("Introduce los minutos (0 to 59): ");
        int minutes = s.nextInt();
        if (hours > 23 || minutes > 59 || hours * minutes < 0) {
            System.out.print("Por favor, introduce los números correctos");
            return;
        }
        int secondsOfDay = 24 * 60 * 60;
        int timeInSeconds = hours * 60 * 60 + minutes * 60;
        if (hours == 0 && minutes == 0)
            System.out.printf("Es medianoche!");
        else
            System.out.printf("Al día le quedan %d segundos", secondsOfDay - timeInSeconds);
    }
}
