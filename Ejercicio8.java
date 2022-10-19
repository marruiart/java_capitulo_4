import java.util.Scanner;

/**
 * Este programa calcula la media de tres notas y dice la nota del boletín
 * (insuficiente, suficiente, bien, notable o sobresaliente).
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio8 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce las tres notas (0-10): ");
        float firstMark = s.nextFloat();
        float secondMark = s.nextFloat();
        float thirdMark = s.nextFloat();
        s.close();
        if (firstMark < 0 || firstMark > 10) {
            System.out.print("Número incorrecto. Debe ser de 0 a 10");
            return;
        }
        float average = (firstMark + secondMark + thirdMark) / 3;
        if (average > 9)
            System.out.print("Sobresaliente");
        else if (average > 7)
            System.out.print("Notable");
        else if (average > 6)
            System.out.print("Bien");
        else if (average > 5)
            System.out.print("Suficiente");
        else
            System.out.print("Insuficiente");
    }
}
