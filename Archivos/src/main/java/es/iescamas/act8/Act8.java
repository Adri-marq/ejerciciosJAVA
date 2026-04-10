package es.iescamas.act8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Act8 {

	public static void main(String[] args) {
		try(BufferedReader reader = new BufferedReader(new FileReader("perso1.txt"));
			BufferedReader reader2 = new BufferedReader(new FileReader("perso2.txt"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("todos.txt"))){
			 String linea1 = reader.readLine();
	            String linea2 = reader2.readLine();

	            while (linea1 != null || linea2 != null) {
	                if (linea1 == null) {
	                    writer.write(linea2);
	                    writer.newLine();
	                    linea2 = reader2.readLine();
	                } else if (linea2 == null) {
	                    writer.write(linea1);
	                    writer.newLine();
	                    linea1 = reader.readLine();
	                } else {
	                    if (linea1.compareToIgnoreCase(linea2) <= 0) {
	                        writer.write(linea1);
	                        writer.newLine();
	                        linea1 = reader.readLine();
	                    } else {
	                        writer.write(linea2);
	                        writer.newLine();
	                        linea2 = reader2.readLine();
	                    }
	    
	                }
	                }
		}catch(Exception x) {
			System.out.println("Error al leer el archivo: " + x.getMessage());
		}
	}
}
