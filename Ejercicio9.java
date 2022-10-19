import java.util.Scanner;

/**
 * Este programa resuelve una ecuación de segundo grado (del tipo ax^2+bx+c = 0)
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio9 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce el valor de 'a': ");
        double a = s.nextDouble();
        System.out.print("Introduce el valor de 'b': ");
        double b = s.nextDouble();
        System.out.print("Introduce el valor de 'c': ");
        double c = s.nextDouble();
        s.close();
        double root = Math.pow(b, 2) - 4 * a * c;
        if (root < 0 || 2 * a == 0) {
            System.out.print("Esta ecuación no tiene una solución real");
            return;
        }
        double xSum = (-b + (Math.sqrt(root))) / (2 * a);
        double xSub = (-b - (Math.sqrt(root))) / (2 * a);
        System.out.printf("x puede ser %.2f o %.2f", xSum, xSub);
    }
}