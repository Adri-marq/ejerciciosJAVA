package es.iescamas.act12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Act12 {

	public static void main(String[] args) {
		
		try(BufferedReader reader = new BufferedReader(new FileReader("texto1.txt"));
			BufferedReader reader2 = new BufferedReader(new FileReader("texto2.txt"))){
				
			String linea;
			String linea2;
			int contl=1;
            while ((linea = reader.readLine()) != null && (linea2 = reader2.readLine()) != null) {
            int contc=1;
            	
            for(int i=0; i<linea.length();i++) {
            if(linea.charAt(i)!=linea2.charAt(i)) {
            	System.out.println("diferencia en la linea: "+contl+ " caracter: "+contc);
            	System.exit(0);
            }
            contc++;
            }
            
            contl++;
            }
            System.out.println("son iguales");
		}catch(Exception e) {
		 System.out.println("Error al leer el archivo: " + e.getMessage());
	}

	}

}
