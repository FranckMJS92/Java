import java.util.ArrayList;
import java.util.Scanner;

public class Simulacro {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("----- AGREGANDO NOMBRES -----");
        while (true) {
            System.out.print("Introduce un nombre: ");
            String name = sc.nextLine().trim().toUpperCase();

            if (name.equalsIgnoreCase("fin")) {
                break;
            }

            if (!name.isEmpty() && !names.contains(name)) {
                names.add(name);
            }
        }

        System.out.println("----- MOSTRANDO NOMBRES -----");
        for (String n : names) {
            System.out.println("- " + n);
        }
        sc.close();
    }
}
