import java.util.Scanner;

/**
 * This program prints the day of the week given its number
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio3 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please introduce a number from 1 to 7: ");
        int day = s.nextInt();
        if (day < 0) {
            System.out.print("That's a negative number!");
            return;
        }
        switch (day) {
            case 1:
                System.out.print("It's Monday");
                break;
            case 2:
                System.out.print("It's Tuesday");
                break;
            case 3:
                System.out.print("It's Wednesday");
                break;
            case 4:
                System.out.print("It's Thursday");
                break;
            case 5:
                System.out.print("It's Friday");
                break;
            case 6:
                System.out.print("It's Saturday");
                break;
            case 7:
                System.out.print("It's Sunday");
                break;
            default:
                System.out.print("The week doesn't have so many days!");
        }
    }
}
