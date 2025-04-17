import java.io.*;

public class LecturaFicheroTexto {
    public static void main(String[] args) throws IOException { // El método main puede lanzar excepciones de E/S
        // Crea un objeto File que representa el archivo llamado "fichero.txt"
        File ficheroLectura = new File("sesionesUpgrade\\src\\sesionFicheros\\20250409\\ficheroEscritura.txt");
        // Crea un FileReader para leer el contenido del archivo carácter por carácter
        FileReader lectorArchivo = new FileReader(ficheroLectura);
        // Envuelve el FileReader en un BufferedReader para leer líneas completas
        // eficientemente
        BufferedReader lectorLineas = new BufferedReader(lectorArchivo);

        String lineaLeida = lectorLineas.readLine();
        System.out.println("Línea leída: " + lineaLeida);
        // Cierra el BufferedReader (y también el FileReader internamente), liberando
        // recursos
        lectorLineas.close();

    }
}