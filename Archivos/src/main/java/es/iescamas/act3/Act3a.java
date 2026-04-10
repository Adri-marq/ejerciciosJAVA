package es.iescamas.act3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Act3a {

	public static void main(String[] args) {
		try(FileReader original = new FileReader("original.txt"); FileWriter copia = new FileWriter("copia.txt");) 
		{
		int linea;
		while((linea = original.read()) != -1) {
			copia.write(linea);
		}	
		}catch(IOException e) {
			System.out.println("Error al duplicar el archivo: " + e.getMessage());
		}

	}

}
