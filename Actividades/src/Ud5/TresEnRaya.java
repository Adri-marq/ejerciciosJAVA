package Ud5;

import java.util.Scanner;

public class TresEnRaya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int opcion=0;
		do { mostrarMenu(); 
		opcion = sc.nextInt(); 
		switch(opcion){
		case 1:
			jugar(sc);
			break;
		case 2:
			mostrarInstrucciones();
			break;
		case 3:
			System.out.println("adios");
			break;
		} 
		} while(opcion != 3);
	}
	
	public static void mostrarMenu() {
		System.out.println("que quieres hacer:");
		System.out.println("1) jugar" );
		System.out.println("2) ver instrucciones");
		System.out.println("salir");
	}
	public static void mostrarInstrucciones() {
		System.out.println("\nInstrucciones del juego:");
        System.out.println("1. El juego consiste en un tablero de 3x3.");
        System.out.println("2. Los jugadores se turnan para colocar su símbolo (X o O) en un espacio vacío.");
        System.out.println("3. El primer jugador en alinear 3 símbolos de forma horizontal, vertical o diagonal gana.");
        System.out.println("4. ¡Buena suerte!");
	}
	public static void jugar() {
		char jugador ='x';
	}
	public static void inicializarTablero() {
		char [][] tablero= new char[3][3];
		for(int i=0;i<tablero.length;i++) {
			for(int j=0;j<tablero[i].length;j++) {
				tablero[i][j]=' ';
			}	
		}
	}
	public static void mostrarTablero() {
		char [][] tablero= new char[3][3];
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]); 
                if (j < 2) System.out.print(" | "); 
            }
            System.out.println();
            if (i < 2) System.out.println("  ---+---+---"); // 
        }
	}
	public static void hayGanador() {
	
	}
	public static void tableroLleno() {
	
	}
}
