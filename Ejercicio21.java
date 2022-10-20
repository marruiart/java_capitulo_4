
/**
 * Este programa calcula la nota de un trimestre de la asignatura Programación.
 * El programa pedirá las dos notas que ha sacado el alumno en los dos primeros
 * controles. Si la media de los dos controles da un número mayor o igual a 5,
 * el alumno está aprobado y se mostrará la media. En caso de que la media sea
 * un número menor que 5, el alumno habrá tenido que hacer el examen de
 * recuperación que se califica como apto o no apto, por tanto se debe preguntar
 * al usuario ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si
 * el resultado de la recuperación es apto, la nota será un 5; en caso
 * contrario, se mantiene la nota media anterior.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nota del primer control: ");
        float grade1 = s.nextFloat();
        System.out.print("Nota del segundo control: ");
        float grade2 = s.nextFloat();
        float average = (grade1 + grade2) / 2;
        if (average >= 5)
            System.out.printf("Tu nota de Programación es %.2f", average);
        else {
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            String result = s.next();
            if (result.equals("apto"))
                System.out.printf("Tu nota de Programación es %d", 5);
            else
                System.out.printf("Tu nota de Programación es %.2f", average);
        }
        s.close();
    }
}