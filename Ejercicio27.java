
/**
 * Este programa hace presupuestos de tartas de una pastelería. El programa 
 * preguntará primero de qué sabor quiere el usuario la tarta: manzana, fresa 
 * o chocolate. La tarta de manzana vale 18 euros y la de fresa 16. En caso de 
 * seleccionar la tarta de chocolate, el programa debe preguntar además si el 
 * chocolate es negro o blanco; la primera opción vale 14 euros y la segunda 
 * 15. Por último se pregunta si se añade nata y si se personaliza con un nombre; 
 * la nata suma 2.50 y la escritura del nombre 2.75.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        float basePrice = 18; // manzana
        float creamPrice = 0;
        float namePrice = 0;

        System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
        String flavour = s.next();

        if (flavour.equals("fresa"))
            basePrice = 16;
        else if (flavour.equals("chocolate")) {
            System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
            String typeChocolate = s.next();
            flavour += " " + typeChocolate;
            basePrice = typeChocolate.equals("negro") ? 14 : 15;
        } else if (!flavour.equals("manzana")) {
            System.out.print("Lo siento, no tenemos ese sabor");
            s.close();
            return;
        }

        System.out.print("¿Quiere nata? (si o no): ");
        String withCream = s.next();
        if (withCream.equals("si"))
            creamPrice = 2.5f;

        System.out.print("¿Quiere ponerle un nombre? (si o no): ");
        String withName = s.next();
        if (withName.equals("si"))
            namePrice = 2.75f;
        s.close();

        float total = basePrice + creamPrice + namePrice;
        System.out.printf("Tarta de %s: %.2f €\n", flavour, basePrice);
        if (withCream.equals("si"))
            System.out.printf("Con nata: %.2f €\n", creamPrice);
        if (withName.equals("si"))
            System.out.printf("Con nombre: %.2f €\n", namePrice);
        System.out.printf("TOTAL: %.2f €\n", total);

    }
}