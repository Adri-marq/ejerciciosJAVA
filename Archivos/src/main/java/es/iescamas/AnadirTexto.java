package es.iescamas;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class AnadirTexto {
    public static void main(String[] args) {
        try {
            Path ruta = Path.of("salida.txt");
            Files.writeString(
                ruta,
                "\nNueva línea añadida",
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
            );
            System.out.println("Texto añadido.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}