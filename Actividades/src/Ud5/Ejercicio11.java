package Ud5;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] matrizmagica = new int[4][4];	
		int num;
		for(int i=0; i<matrizmagica.length;i++) {
		for(int j=0;j<matrizmagica[0].length;j++) {
			System.out.println("dime un numero:");
			num=sc.nextInt();
			matrizmagica[i][j]=num;
		}
		  }
		if (esMatrizMagica(matrizmagica)) {
            System.out.println("La matriz es mágica.");
        } else {
            System.out.println("La matriz no es mágica.");
        }
}
	  public static boolean esMatrizMagica(int[][] m) {
	        int sumaReferencia = 0;
	        
	        // Sumar la primera fila como referencia
	        for (int j = 0; j < m[0].length; j++) {
	            sumaReferencia += m[0][j];
	        }

	        // Verificar las filas
	        for (int i = 1; i < m.length; i++) {
	            int sumaFila = 0;
	            for (int j = 0; j < m[i].length; j++) {
	                sumaFila += m[i][j];
	            }
	            if (sumaFila != sumaReferencia) {
	                return false;
	            }
	        }

	        // Verificar las columnas
	        for (int j = 0; j < m[0].length; j++) {
	            int sumaColumna = 0;
	            for (int i = 0; i < m.length; i++) {
	                sumaColumna += m[i][j];
	            }
	            if (sumaColumna != sumaReferencia) {
	                return false;
	            }
	        }
	  return true;
	  }
}
	