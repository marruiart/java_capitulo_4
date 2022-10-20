
/**
 * Este programa implementa el juego piedra, papel y tijera. Primero, el usuario
 * 1 introduce su jugada y luego el usuario 2. Si alguno de los usuarios
 * introduce una opción incorrecta, el programa deberá mostrar un mensaje de
 * error.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String player1 = s.next();
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String player2 = s.next();
        s.close();

        if ((player1.equals("piedra") || player1.equals("papel") || player1.equals("tijeras"))
                && (player2.equals("piedra") || player2.equals("papel") || player2.equals("tijeras"))) {
            if (player1.equals(player2))
                System.out.print("Empate");
            else if (player1.equals("piedra") && player2.equals("papel")
                    || player1.equals("papel") && player2.equals("tijeras")
                    || player1.equals("tijeras") && player2.equals("piedra"))
                System.out.print("Gana el jugador 2");
            else
                System.out.print("Gana el jugador 1");
        } else
            System.out.print("Lo siento, jugada incorrecta");
    }
}