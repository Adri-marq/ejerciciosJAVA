package es.iescamas.act1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Act1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el nombre del fichero");
		String nombre=sc.nextLine();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(nombre))) {
			String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
		} catch (IOException e) {
			 System.out.println("Error al leer el archivo: " + e.getMessage());
		}
	
	
	}
}
