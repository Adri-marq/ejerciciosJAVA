package es.iescamas.act5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Act5 {

	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		try(BufferedReader reader = new BufferedReader(new FileReader("numeros.txt"))) {
			String linea;
            while ((linea = reader.readLine()) != null) {
            	int num = Integer.parseInt(linea);
            	if(max<=num) {
            		max=num;
            	}
            	if(min>=num) {
            		min=num;
            	}
            }
			System.out.println("numero mas alto: " + max);
			System.out.println("numero mas pequeño: " + min);
		}catch(IOException e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());
		}

	}

}
