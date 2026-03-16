package es.iescamas;

import java.nio.file.Files;
import java.nio.file.Path;

public class LeerArchvo {

	public static void main(String[] args) {
		
		        try {
		            Path ruta = Path.of("datos.txt");
		            String contenido = Files.readString(ruta);
		            System.out.println(contenido);
		        } catch (Exception e) {
		            System.out.println("Error al leer el archivo: " + e.getMessage());
		        }
	}
}
