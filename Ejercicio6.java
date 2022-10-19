import java.util.Scanner;

/**
 * Este programa Realiza un programa que calcule el tiempo que tardará en caer
 * un objeto desde una altura h. Aplica la fórmula t = √(2h/g) siendo
 * g = 9.81m/s^2
 * 
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio6 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la altura de caída (m): ");
        double height = s.nextDouble();
        s.close();
        if (height < 0) {
            System.out.print("La altura no puede ser negativa!");
            return;
        }
        double g = 9.81;
        double time = Math.sqrt(2 * height / g);
        System.out.printf("El objeto cae en %.2f segundos", time);
    }
}
