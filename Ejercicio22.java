
/**
 * Este programa, dado un día de la semana (de lunes a viernes) y una hora
 * (horas y minutos), calcula cuántos minutos faltan para el fin de semana. Se
 * considerará que el fin de semana comienza el viernes a las 15:00h. Se da por
 * hecho que el usuario introducirá un día y hora correctos, anterior al viernes
 * a las 15:00h.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce el día de la semana en minúsculas: ");
        String day = s.next();
        System.out.print("Introduce la hora: ");
        int hour = s.nextInt();
        System.out.print("Introduce los minutos: ");
        int minutes = s.nextInt();
        s.close();
        int minutesToWeeknd = 0;
        int minutesInADay = 24 * 60;
        int wholeDaysLeft;
        int minutesOfFriday = 15 * 60;
        int minutesLeftToday = minutesInADay - (hour * 60 + minutes);

        switch (day) {
            case "lunes":
                wholeDaysLeft = 3;
                break;
            case "martes":
                wholeDaysLeft = 2;
                break;
            case "miercoles":
                wholeDaysLeft = 1;
                break;
            case "jueves":
                wholeDaysLeft = 0;
                break;
            case "viernes":
                minutesLeftToday = minutesOfFriday - (hour * 60 + minutes);
                minutesOfFriday = 0;
                wholeDaysLeft = 0;
                break;
            case "sabado":
                wholeDaysLeft = 5;
                break;
            case "domingo":
                wholeDaysLeft = 4;
                break;
            default:
                System.out.print("El día no es correcto");
                return;
        }

        minutesToWeeknd += minutesLeftToday + wholeDaysLeft * minutesInADay + minutesOfFriday;
        System.out.printf("Quedan %d minutos para el fin de semana", minutesToWeeknd);

    }
}