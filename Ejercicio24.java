
/**
 * Este programa genera la nómina (bien desglosada) de un empleado según las 
 * siguientes condiciones: 
 * • Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 
 *      3 - Jefe de proyecto), los días que ha estado de viaje visitando clientes 
 *      durante el mes y su estado civil (1 - Soltero, 2 - Casado). 
 * 
 * • El sueldo base según el cargo es de 950, 1200 y 1600 euros según si se 
 *      trata de un prog. junior, un prog. senior o un jefe de proyecto respectivamente. 
 * 
 * • Por cada día de viaje visitando clientes se pagan 30 euros extra en concepto 
 *      de dietas. Al sueldo neto hay que restarle el IRPF, que será de un 25% en caso 
 *      de estar soltero y un 20% en caso de estar casado.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el cargo del empleado (1 - 3): ");
        System.out.println("1 - Programador junior");
        System.out.println("2 - Programador senior");
        System.out.println("3 - Jefe de proyecto");
        int employeePosition = s.nextInt();
        System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
        int travelDays = s.nextInt();
        System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        int maritalStatus = s.nextInt();
        s.close();

        float baseSalary = 950;
        float extraTravel = 30 * travelDays;
        int IRPF = 25;
        if (employeePosition == 2)
            baseSalary = 1200;
        else if (employeePosition == 3)
            baseSalary = 1600;
        else if (employeePosition != 1) {
            System.out.print("El cargo introducido no existe");
            return;
        }
        if (maritalStatus == 2)
            IRPF = 20;

        float grossSalary = (baseSalary + extraTravel);
        float taxes = grossSalary * IRPF / 100;
        float netSalary = grossSalary - taxes;

        System.out.printf("------------------------------\n");
        System.out.printf("| Sueldo base         %7.2f|\n", baseSalary);
        System.out.printf("| Dietas (%2d viajes)  %7.2f|\n", travelDays, extraTravel);
        System.out.printf("|----------------------------|\n");
        System.out.printf("| Sueldo bruto        %7.2f|\n", grossSalary);
        System.out.printf("| IRPF (%2d%%)          %7.2f|\n", IRPF, taxes);
        System.out.printf("|----------------------------|\n");
        System.out.printf("| Sueldo neto         %7.2f|\n", netSalary);
        System.out.printf("------------------------------\n");

    }
}