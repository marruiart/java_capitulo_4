import java.util.Scanner;

/**
 * This program solves second grade equations (ax^2+bx+c = 0)
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio9 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please, introduce the value of 'a': ");
        double a = s.nextDouble();
        System.out.print("Now introduce the value of 'b': ");
        double b = s.nextDouble();
        System.out.print("Now introduce the value of 'c': ");
        double c = s.nextDouble();
        double noSolution = Math.pow(b, 2) - 4 * a * c;
        if (noSolution < 0) {
            System.out.print("This equation doesn't have a real solution");
            return;
        }
        double xSum = (-b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);
        double xSub = (-b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);
        System.out.printf("x could be %.2f or %.2f", xSum, xSub);
    }
}