import java.util.Scanner;

/**
 * Este programa resuelve una ecuación de primer grado (del tipo ax + b = 0).
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio5 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce el valor de 'a': ");
        float a = s.nextFloat();
        System.out.print("Introduce el valor de 'b': ");
        float b = s.nextFloat();
        s.close();
        if (a == 0) {
            System.out.print("Esta ecuación no tiene solución");
            return;
        }
        float x = -b / a;
        System.out.print("x = " + x);
    }
}