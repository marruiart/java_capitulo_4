import java.util.Scanner;

/**
 * This program receives a number representing the day of the week and prints
 * the subject you have at the first hour that day
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please introduce the day of the week (1. mo, 2. tu, 3. we, 4. th, 5. fr): ");
        int day = s.nextInt();
        switch (day) {
            case 1:
                System.out.print("The first hour on monday you have 'Programación'");
                break;
            case 2:
                System.out.print("The first hour on tuesday you have 'Programación'");
                break;
            case 3:
                System.out.print("The first hour on wednesday you have 'Entornos de Desarrollo'");
                break;
            case 4:
                System.out.print("The first hour on thursday you have 'Programación'");
                break;
            case 5:
                System.out.print("The first hour on friday you have 'Formación y Orientación Laboral'");
                break;
            default:
                System.out.print("You don't go to school that day!");
        }
    }
}
