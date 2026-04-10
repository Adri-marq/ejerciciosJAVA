package es.iescamas.act6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Act6 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
				int opc;
				do {
				System.out.println("1. mostrar firmas | 2. insertar firma | 3. salir");
				opc = sc.nextInt();
			switch(opc){
			case 1:
				try(BufferedReader reader = new BufferedReader(new FileReader("firmas.txt"))){
				String linea;
				while ((linea = reader.readLine()) != null) {
					System.out.println(linea);
				}
				}catch(Exception x) {
					System.out.println("Error al escribir en el archivo: " + x.getMessage());
				}
				break;
			case 2:
				try( BufferedWriter writer = new BufferedWriter(new FileWriter("firmas.txt", true));
					BufferedReader reader = new BufferedReader(new FileReader("firmas.txt"))){
				System.out.println("nueva firma:");
				String firma= sc.next();
				String linea;
				boolean esta;
				while ((linea = reader.readLine()) != null) {
					if(firma.equals(linea)) {
						esta=true;
					}
				}
				if(esta = false) {
				writer.newLine();
				writer.write(firma);
				}else {
					System.out.println("no se ha podido añadir por que ya existe");
				}
				}catch(Exception x) {
					System.out.println("Error al escribir en el archivo: " + x.getMessage());
				}
				break;
			case 3:
				System.out.println("saliendo ....");
				break;
			default:
				System.out.println("error no existe la opcion " + opc);
			break;
			}
			 }while (opc != 3);
			sc.close();
		}
	}
	
