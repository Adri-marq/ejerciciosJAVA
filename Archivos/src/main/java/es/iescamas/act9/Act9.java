package es.iescamas.act9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Act9 {

	public static void main(String[] args) {
		char[] alf = null;
		char[] cod = null;
		try(BufferedReader reader = new BufferedReader(new FileReader("codec.txt"))){
			int cont =0;
			String linea;
			while ((linea = reader.readLine()) != null) {
		       if(cont==0) {
		    	   alf = linea.replace(" ", "").toCharArray();
		       }else {
		    	   cod = linea.replace(" ", "").toCharArray();
		       }
		       cont++;
		    }
		
		}catch(Exception e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());
		}

		try(BufferedReader reader = new BufferedReader(new FileReader("original.txt")); BufferedWriter writer = new BufferedWriter(new FileWriter("codificado.txt"))){
			String linea;
			while ((linea = reader.readLine()) != null) {
				 for(int i=0; i<linea.length();i++) {
					 boolean encontrado = false;
					 for(int j=0; j<alf.length;j++) {
			    		   if(linea.charAt(i)==alf[j]) {
			    			   encontrado= true;
			    			   writer.write(cod[j]);
			    		   }
			    		   
			    	   }
					 if (!encontrado) {
	                        writer.write(linea.charAt(i));
	                    }  
				 }
				 writer.newLine();	
			}
			
		}catch(Exception e) {
			System.out.println("Error al leer o escribir el archivo: " + e.getMessage());
		}
	
	}

}
