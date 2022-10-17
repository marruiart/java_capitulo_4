import java.util.Scanner;

/**
 * This program solves first grade equations (ax+b = 0)
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio5 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please, introduce the value of 'a': ");
        float a = s.nextFloat();
        System.out.print("Now introduce the value of 'b': ");
        float b = s.nextFloat();
        if (a == 0) {
            System.out.print("This equation doesn't have a real solution");
            return;
        }
        float x = -b / a;
        System.out.print("x = " + x);
    }
}