import java.io.File;

public class CrearDirectorios {
    public static void main(String[] args) {

        // Especificar rutas para crear directorios
        String directorio = "C:\\Users\\HP\\OneDrive - Universidad Tecnologica del Peru\\Cursos\\Upgrade\\Desarrollo Aplicacion Multiplataforma\\Entornos de desarrollo\\Github Repository\\Java\\sesionesUpgrade\\src\\20250430\\miDirectorio";

        String varios = "/directorio1/directorio2/directorio3";

        // Crear un único directorio
        if ((new File(directorio)).mkdir()) {
            System.out.println("Directorio: " + directorio + " creado");
        }

        // Crear varios directorios anidados
        // directorio+varios equivale a la siguiente ruta:
        // "C:\\Users\\Nacho\\FP\\Upgrade\\PRG\\20250430\\miDirectorio\\directorio1\\directorio2\\directorio3";
        if ((new File(directorio + varios)).mkdirs()) {
            System.out.println("Directorios: " + varios + " creados");
        }

    }
}
