package es.iescamas.Ejemplos1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo1CrearArchivo {
	public static void main(String[] args) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("datos.txt"))) {
			writer.write("java");
			writer.newLine();
			writer.write("Archibos de texto");
			writer.newLine();
			writer.write("daw y dam");
			
			System.out.println("Archivo creado y datos escritos correctamente");
		} catch (IOException e) {
			System.out.println("Error aal escribir el archivo: "+ e.getMessage());
		}
		
	}
}
