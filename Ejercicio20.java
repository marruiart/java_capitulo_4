
/**
 * Este programa dice si un número entero positivo introducido por teclado es
 * capicúa. Se permiten números de hasta 5 cifras.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio20 {
    public static int rotateNum(int num) {
        int rotatedNum = 0;
        int lastDigit;
        while (num / 10 > 0) {
            rotatedNum *= 10;
            lastDigit = num % 10;
            rotatedNum += lastDigit;
            num /= 10;
        }
        rotatedNum = rotatedNum * 10 + num;
        return rotatedNum;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = s.nextInt();
        s.close();
        int rotatedNum = rotateNum(num);
        if (rotatedNum == num)
            System.out.print("El número es capicúa");
        else
            System.out.print("El número NO es capicúa");

    }
}
