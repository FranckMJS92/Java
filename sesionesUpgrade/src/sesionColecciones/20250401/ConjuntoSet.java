

/*
 * Date: 01/04/2025
 */

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Iterator;

public class ConjuntoSet {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();
        set.add("Uno");
        set.add("Dos");
        set.add("Tres");
        set.add("Uno"); // No se repetirá porque los sets no permiten duplicados
        set.add("Cuatro");

        // Comprobar si se inserta correctamente
        if (!set.add("Tres")) {
            System.out.println("Error al insertar!");
        }

        // Imprime: Uno Dos Tres Cuatro
        Iterator<String> j = set.iterator();
        while (j.hasNext()) {
            System.out.print(j.next() + " ");
        }
    }

}
