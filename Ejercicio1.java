import java.util.Scanner;

/**
 * Este programa pide por teclado un día de la semana y dice qué asignatura toca
 * a primera hora ese día.
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un día de la semana (1-7) ");
        int day = s.nextInt();
        s.close();
        switch (day) {
            case 1:
                System.out.print("A primera hora el LUNES toca 'Programación'");
                break;
            case 2:
                System.out.print("A primera hora el MARTES toca 'Programación'");
                break;
            case 3:
                System.out.print("A primera hora el MIÉRCOLES toca 'Entornos de Desarrollo'");
                break;
            case 4:
                System.out.print("A primera hora el JUEVES toca 'Programación'");
                break;
            case 5:
                System.out.print("A primera hora el VIERNES toca 'Formación y Orientación Laboral'");
                break;
            default:
                System.out.print("ES FIN DE SEMANA!");
        }
    }
}
