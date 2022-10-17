import java.util.Scanner;

/**
 * This program calculates the time that takes to a falling object to hit the
 * ground given the height it drops from
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio6 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please introduce the height of fall (m): ");
        double height = s.nextDouble();
        if (height < 0) {
            System.out.print("Height can't be a negative number");
            return;
        }
        double g = 9.81;
        double time = Math.sqrt(2 * height / g);
        System.out.printf("The objects falls in %.2f seconds", time);
    }
}
