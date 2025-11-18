package Ud5;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] matriz= new int[5][5];
		//creo una matriz y con un bucle digo que en una celda se sumen el el numero de la fila y su columna
		for(int i =0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				matriz[i][j]=i+j;
			}
		}
		mostrarMatriz(matriz);
		
	}
	//hago una funcion para mostrar la funcion
 public static void mostrarMatriz(int [][] matriz) {
	 for(int i =0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				System.out.print(matriz[i][j]);
			}
	System.out.println("");	
	 }
 }
}
