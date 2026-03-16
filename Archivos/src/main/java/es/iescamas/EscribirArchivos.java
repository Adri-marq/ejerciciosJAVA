package es.iescamas;

import java.nio.file.Files;
import java.nio.file.Path;

public class EscribirArchivos {
	 public static void main(String[] args) {
		 try {
			 Path ruta = Path.of("salida.txt");
			 Files.writeString(ruta, "Hola desde java");
			 System.out.println("archivo guardado correctamente");
		 } catch (Exception e) {
			 System.out.println("Error al escribir:"+ e.getMessage());
		 }
		 
	 }
}
