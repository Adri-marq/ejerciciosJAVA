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
		} while(opcion != 3);
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
		char jugador=' ';
		int Py,Px;
		
		if (turno % 2 == 0) {
            jugador='X';
            System.out.println("Turno del jugador X:");
        }else {
        	jugador='O';
            System.out.println("Turno del jugador O:");
        
        }
		   while (true) {
	            System.out.println("Dime la fila (0-2):");
	            Py = sc.nextInt();
	            System.out.println("Dime la columna (0-2):");
	            Px = sc.nextInt();

	            // Verificar si la celda está vacía
	            if (tablero[Py][Px] == ' ') {
	                tablero[Py][Px] = jugador;
	                break; // Salir del ciclo si la jugada es válida
	            } else {
	                System.out.println("¡La celda ya está ocupada! Intenta otra vez.");
	            }
	        }
		hayGanador(tablero,jugador);
		tableroLleno(tablero);
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
	public static void hayGanador(char [][] tablero ,char jugador) {
	
		for(int i =0;i<tablero.length;i++) {
			if(tablero[0][i]==jugador && tablero[0][i]==tablero[1][i] && tablero[0][i]==tablero[2][i]) {
				System.out.println("Has ganado");	
				System.exit(0);
			}else if(tablero[i][0]==jugador && tablero[i][0]==tablero[i][0] && tablero[i][0]==tablero[i][2]) {
				System.out.println("Has ganado");
				System.exit(0);
			}
		}
			if(tablero[0][0]==jugador && tablero[0][0]==tablero[1][1] && tablero[0][0]==tablero[2][2]) {
				System.out.println("Has ganado");
				System.exit(0);
			}else if(tablero[0][2]== jugador && tablero[0][2]==tablero[1][1] && tablero[0][2]==tablero[2][0]) {
				System.out.println("Has ganado");
				System.exit(0);
			}
		}	
	public static void tableroLleno(char[][] tablero) {
	int contador=0;
		for(int i =0;i<tablero.length;i++) {
		for(int j =0;j<tablero[i].length;j++) {
			if(tablero[i][j]!=' ') {
			contador++;
			}
		}
	}
	if (contador ==9) {
		System.out.println("empate");
		System.exit(0);
	}	
	}

}

