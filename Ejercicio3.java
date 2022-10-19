import java.util.Scanner;

/**
 * Este programa dado un número del 1 a 7 escribe el correspondiente nombre del día de la semana.
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio3 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número del 1 al 7: ");
        int day = s.nextInt();
        s.close();
        if (day < 0) {
            System.out.print("Ese número es negativo!");
            return;
        }
        switch (day) {
            case 1:
                System.out.print("Es LUNES");
                break;
            case 2:
                System.out.print("Es MARTES");
                break;
            case 3:
                System.out.print("Es MIÉRCOLES");
                break;
            case 4:
                System.out.print("Es JUEVES");
                break;
            case 5:
                System.out.print("Es VIERNES");
                break;
            case 6:
                System.out.print("Es SÁBADO");
                break;
            case 7:
                System.out.print("Es DOMINGO");
                break;
            default:
                System.out.print("La semana no tiene tantos días!");
        }
    }
}
