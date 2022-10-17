import java.util.Scanner;

/**
 * This program calculates the average grade of three marks and classifies the
 * final grade into "F - insuficiente", "E - suficiente", "D - bien", "C/B -
 * notable" and "A/A+ - sobresaliente"
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio8 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please, introduce your three marks (0-10): ");
        float firstMark = s.nextFloat();
        float secondMark = s.nextFloat();
        float thirdMark = s.nextFloat();
        if (firstMark < 0 || firstMark > 10) {
            System.out.print("Incorrect number");
            return;
        }
        float average = (firstMark + secondMark + thirdMark) / 3;
        if (average > 9)
            System.out.print("A/A+ - sobresaliente");
        else if (average > 7)
            System.out.print("C/B - notable");
        else if (average > 6)
            System.out.print("D - bien");
        else if (average > 5)
            System.out.print("E - suficiente");
        else
            System.out.print("F - insuficiente");
    }
}
