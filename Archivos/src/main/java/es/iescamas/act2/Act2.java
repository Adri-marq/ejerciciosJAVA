package es.iescamas.act2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Act2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime tu nombre:");
		String nombre=sc.nextLine();
		System.out.println("dime tu edad:");
		int edad= sc.nextInt();
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("datos.txt"))) {
			writer.write("nombre: "+nombre+" edad: "+edad);
		}catch(IOException e) {
			System.out.println("Error al guardar el archivo: " + e.getMessage());
		}

	}

}
