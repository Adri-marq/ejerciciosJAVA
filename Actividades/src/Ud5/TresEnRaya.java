package Ud5;

import java.util.Scanner;

public class TresEnRaya {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion=0,turno=0;
		char [][] tablero = new char [3][3];
		for(int i=0; i<tablero.length;i++) {
			for(int j=0;j<tablero[i].length;j++) {
				tablero [i][j]=' ';
			}
		}
		do {
			mostrarTablero(tablero);
		mostrarMenu(); 
		opcion = sc.nextInt(); 
		switch(opcion){
		case 1:
			jugar(tablero,turno);
			turno++;
			break;
		case 2:
			mostrarInstrucciones();
			break;
		case 3:
			System.out.println("adios");
			break;
		default:
			System.out.println("No hay ninguna opcion con ese numero");
		}
		} while(opcion != 4);
	}
	
	public static void mostrarMenu() {
		System.out.println("que quieres hacer:");
		System.out.println("1) jugar" );
		System.out.println("2) ver instrucciones");
		System.out.println("3) salir");
	}
	public static void mostrarInstrucciones() {
		System.out.println("\nInstrucciones del juego:");
        System.out.println("1. El juego consiste en un tablero de 3x3.");
        System.out.println("2. Los jugadores se turnan para colocar su símbolo (X o O) en un espacio vacío.");
        System.out.println("3. El primer jugador en alinear 3 símbolos de forma horizontal, vertical o diagonal gana.");
        System.out.println("4. ¡Buena suerte!");
	}
	public static void jugar(char[][] tablero,int turno) {
		char celda=' ', jugador;
		int Py,Px;
		if (turno % 2 == 0) {
            jugador='X';
            System.out.println("Turno del jugador X:");
        }else {
        	jugador='O';
            System.out.println("Turno del jugador O:");
        
        }
		System.out.println("dime la celda a la cual quieres escribir");
		System.out.println("fila:");
		Py= sc.nextInt();
		System.out.println("columna:");
		Px= sc.nextInt();
		if(tablero[Py][Px] !=' ') {
			System.out.println("En esa posicion ya has puesto " +tablero[Py][Px]);
		}
		while(tablero[Py][Px] ==' '|(jugador == 'x'|jugador == 'o')) {
		tablero[Py][Px]=jugador;
		}
		if(tablero[Py][Px] ==' ') {
			System.out.println("esa posicion ya esta escrito");
		}
		turno++;
	}
	public static void mostrarTablero(char[][] tablero) {
		 System.out.println("   0   1   2 ");
		 System.out.println("  ---+---+---");
	        for (int i = 0; i < tablero.length; i++) {
	            System.out.print(i + "│");
	            for (int j = 0; j < tablero[i].length; j++) {
	                System.out.print(" " + tablero[i][j] + " │");
	            }
	            System.out.println();
	            if (i < tablero.length - 1) {
	                System.out.println("  ---+---+---");
	            }
	        }
	        System.out.println("  ---+---+---");
	}
	public static void hayGanador() {
	
	}
	public static void tableroLleno() {
	
	}
}
