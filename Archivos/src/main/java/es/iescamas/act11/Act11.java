package es.iescamas.act11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Act11 {
	public static void main(String[] args) {
		String[][] matriz= new String[0][0];
		String[] linea_matriz;
		try (BufferedReader reader = new BufferedReader(new FileReader("matriz.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
            	linea_matriz=linea.split(" ");
            	  String[][] nuevaMatriz = new String[matriz.length + 1][linea_matriz.length];

                  for (int i = 0; i < matriz.length; i++) {
                      nuevaMatriz[i] = matriz[i];
                  }

                  nuevaMatriz[matriz.length] = linea_matriz;

                  matriz = nuevaMatriz;
            }
            for (int j = 0; j < matriz.length; j++) {
                for (int i = 0; i < matriz[j].length; i++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        
        }

	}
}
