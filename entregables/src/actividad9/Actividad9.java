import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Actividad9 class provides a menu-driven program to manage a list of
 * cities.
 * Users can add, display, search, and delete cities from the list.
 * The program runs in a loop until the user chooses to exit.
 * 
 * Methods:
 * - Menu(): Displays the menu and handles user input to perform various
 * operations.
 * - agregarCiudades(): Adds a city to the list if it does not already exist.
 * - mostrarCiudades(): Displays all cities in the list or a message if the list
 * is empty.
 * - buscarCiudades(): Searches for a city in the list and displays whether it
 * exists.
 * - eliminarCiudades(): Removes a city from the list if it exists.
 * - main(String[] args): Entry point of the program, starts the menu.
 * 
 * Static Fields:
 * - cities: An ArrayList that stores the list of cities.
 * - scanner: A Scanner object for reading user input.
 */
public class Actividad9 {

    static ArrayList<String> cities = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    /**
     * Displays a menu for managing cities and handles user input to perform various
     * operations.
     * The menu provides the following options:
     * 1. Add a city
     * 2. Show all cities
     * 3. Search for a city
     * 4. Delete a city
     * 5. Exit the menu
     *
     * The method runs in a loop until the user chooses to exit by selecting option
     * 5.
     * It uses a switch statement to call the appropriate method based on the user's
     * choice.
     * If an invalid option is entered, the user is prompted to try again.
     *
     * Note: This method assumes the existence of the following methods:
     * - agregarCiudades(): Adds a city to the list.
     * - mostrarCiudades(): Displays all cities in the list.
     * - buscarCiudades(): Searches for a city in the list.
     * - eliminarCiudades(): Deletes a city from the list.
     *
     * Additionally, it assumes the presence of a `scanner` object for reading user
     * input.
     */
    public static void Menu() {

        while (true) {
            System.out.println("Gestion de Ciudades");
            System.out.println("--------------------");
            System.out.println("1. Agregar ciudad");
            System.out.println("2. Mostrar ciudades");
            System.out.println("3. Buscar ciudad");
            System.out.println("4. Eliminar ciudad");
            System.out.println("5. Salir");
            System.out.println("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiando buffer

            switch (opcion) {
                case 1:
                    agregarCiudades();
                    break;
                case 2:
                    mostrarCiudades();
                    break;
                case 3:
                    buscarCiudades();
                    break;
                case 4:
                    eliminarCiudades();
                    break;
                case 5:
                    System.out.println("Saliendo del Menu. Gracias!");
                    return;

                default:
                    System.out.println("Opcion invalida, intentelo de nuevo por favor!");
            }
        }
    }

    /**
     * Adds a city to the list of cities if it does not already exist.
     * Prompts the user to input the name of the city to be added.
     * If the city is already in the list, a message is displayed indicating
     * that the city exists. Otherwise, the city is added to the list and
     * a confirmation message is displayed.
     */
    public static void agregarCiudades() {

        System.out.print("\nIngrese nombre de la ciudad a agregar: ");
        String city = scanner.next();

        if (cities.contains(city) == true) {
            System.out.println("La ciudad ya existe en el listado.\n");
        } else {
            cities.add(city);
            System.out.println("Ciudad agregada correctamente.\n");
        }

    }

    /**
     * Displays the list of registered cities.
     * If the list of cities is empty, a message indicating that the list is empty
     * will be printed. Otherwise, it prints the list of cities with a header.
     *
     * The method assumes that there is a collection named 'cities' of type
     * List<String> or similar that contains the city names.
     */
    public static void mostrarCiudades() {

        if (cities.isEmpty() == true) {
            System.out.println("\nEl listado de ciudades se encuentra vacio.\n");
        } else {
            System.out.println("\nCiudades Registradas");
            System.out.println("--------------------");
            for (String c : cities) {
                System.out.println(c);
            }
            System.out.println();
        }

    }

    /**
     * This method allows the user to search for a city in the list of cities.
     * It prompts the user to input the name of the city they want to search for.
     * If the city is found in the list, a message is displayed indicating that
     * the city is present. Otherwise, a message is displayed indicating that
     * the city is not in the list.
     *
     * Note: This method assumes the existence of a `scanner` object for user input
     * and a `cities` collection that contains the list of cities to search.
     */
    public static void buscarCiudades() {
        System.out.println("\nBúsqueda de ciudades");
        System.out.println("--------------------");
        System.out.print("Ingrese ciudad a buscar: ");
        String search = scanner.next();

        if (cities.contains(search) == true) {
            System.out.println("La ciudad " + search + " se encuentra en la lista.\n");
        } else
            System.out.println("La ciudad ingresada no se encuentra en la lista.\n");
    }

    /**
     * This method allows the user to remove a city from the list of cities.
     * It prompts the user to input the name of the city to be removed.
     * If the city exists in the list, it removes the last occurrence of the city
     * and displays a confirmation message. If the city does not exist in the list,
     * it informs the user that the city cannot be removed.
     *
     * Preconditions:
     * - The `cities` list must be initialized and populated with city names.
     * - The `scanner` object must be initialized for user input.
     *
     * Postconditions:
     * - If the specified city exists in the list, it will be removed.
     * - If the specified city does not exist, the list remains unchanged.
     *
     * Note:
     * - The method uses `scanner.next()` to read the city name, which means it
     * only reads the next token (up to a space). Ensure the input matches the
     * exact city name in the list.
     */
    public static void eliminarCiudades() {
        System.out.println("\nEliminar ciudad de la lista");
        System.out.println("---------------------------");
        System.out.print("Ingrese ciudad a eliminar: ");
        String erase = scanner.next();

        if (cities.contains(erase) == true) {
            cities.remove(cities.lastIndexOf(erase));
            System.out.println("Se ha eliminado " + erase + " de la lista de ciudades.\n");
        } else
            System.out.println("No se puede eliminar la ciudad porque no se encuentra en el listado.\n");
    }

    /**
     * The main method serves as the entry point for the program execution.
     * It initializes the program by displaying a menu and ensures that
     * resources such as the scanner are properly closed after use.
     *
     * @param args Command-line arguments passed to the program (not used in this
     *             implementation).
     */
    public static void main(String[] args) {

        Menu();
        scanner.close(); // Cerrar el scanner al finalizar el programa
    }
}
