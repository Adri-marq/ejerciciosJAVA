package es.iescamas.act3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Act3b {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Dime el nombre del archivo");
		String nombre=sc.nextLine();
		
		try( BufferedReader reader = new BufferedReader(new FileReader(nombre)); BufferedWriter writer = new BufferedWriter(new FileWriter("copia_de_"+nombre))) {
			String linea;
            while ((linea = reader.readLine()) != null) {
                writer.write(linea);
                writer.newLine();
            }
			
		}catch(IOException e) {
			System.out.println("Error al duplicar el archivo: " + e.getMessage());
		}
	}

}
