import java.util.Scanner;

/**
 * Este programa ordena tres números enteros introducidos por teclado
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio13 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = s.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = s.nextInt();
        System.out.print("Introduce el tercer número: ");
        int num3 = s.nextInt();

        int tmp;
        if (num1 > num2) {
            tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        if (num2 > num3) {
            tmp = num2;
            num2 = num3;
            num3 = tmp;
        }
        if (num1 > num2) {
            tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        System.out.printf("%d < %d < %d", num1, num2, num3);
    }
}
