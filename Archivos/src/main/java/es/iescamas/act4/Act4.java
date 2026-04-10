package es.iescamas.act4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Act4 {
	public static void main(String[] args) {
		int contador_caracter=0;
		int contador_lineas=0;
		int contador_palabras=0;
		try(BufferedReader reader = new BufferedReader(new FileReader("cartas.txt"))) {
			String linea;
            while ((linea = reader.readLine()) != null) {
            	contador_caracter+=linea.length();
            	contador_lineas++;
            	contador_palabras+=linea.split(" ").length;
            }
			System.out.println("caracteres: " +contador_caracter+ ", lineas: "+contador_lineas+ ", palabras: " + contador_palabras);
		}catch(IOException e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());
		}
	}

}
