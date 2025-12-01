package Ud5;

import java.util.Scanner;

public class TresEnRaya {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cro las variables opcion y turno
		int opcion=0,turno=0;
		//creo una matriz tablero que este rellenado por espacios en blanco
		char [][] tablero = new char [3][3];
		for(int i=0; i<tablero.length;i++) {
			for(int j=0;j<tablero[i].length;j++) {
				tablero [i][j]=' ';
			}
		}
		//creo un bucle que termine cuando pulses 3
		do {
			//muestro la funcion mostrartablero y mostrarmenu
			mostrarTablero(tablero);
		mostrarMenu(); 
		//le doy un valor a la variable opcion
		opcion = sc.nextInt(); 
		//depende de el valor definido en la variable opcion se haran funciones diferentes
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
	//creo una funcion mostrarmenu donde muestre las opciones que puedo hacer
	public static void mostrarMenu() {
		System.out.println("que quieres hacer:");
		System.out.println("1) jugar" );
		System.out.println("2) ver instrucciones");
		System.out.println("3) salir");
	}
	//creo una funcion para decir que se puede hacer en el juego
	public static void mostrarInstrucciones() {
		System.out.println("\nInstrucciones del juego:");
        System.out.println("1. El juego consiste en un tablero de 3x3.");
        System.out.println("2. Los jugadores se turnan para colocar su símbolo (X o O) en un espacio vacío.");
        System.out.println("3. El primer jugador en alinear 3 símbolos de forma horizontal, vertical o diagonal gana.");
        System.out.println("4. ¡Buena suerte!");
	}
	//creo una funcion jugar para que funcione el juego
	public static void jugar(char[][] tablero,int turno) {
		//creo unas variables
		char jugador=' ';
		int Py,Px;
		//si turno entre dos es 0 entoces la variable jugador pasa a ser x y si no pasa a se O
		if (turno % 2 == 0) {
            jugador='X';
            System.out.println("Turno del jugador X:");
        }else {
        	jugador='O';
            System.out.println("Turno del jugador O:");
        
        }
		//creo un bucle que mientras sea verdadero entonces hace estas operaciones
		   while (true) {
			   //les doy un valor a las variables Py y px
	            System.out.println("Dime la fila (0-2):");
	            Py = sc.nextInt();
	            System.out.println("Dime la columna (0-2):");
	            Px = sc.nextInt();

	            // si la celda esta vacia entonces se le añade el caracter de jugador
	            if (tablero[Py][Px] == ' ') {
	                tablero[Py][Px] = jugador;
	                break;
	            } else {
	            	//si no no hace nada y se repite
	                System.out.println("¡La celda ya está ocupada! Intenta otra vez.");
	            }
	        }
		   // cuando se termine el bulce utilizo las funciones hay ganador y tablero lleno
		hayGanador(tablero,jugador);
		tableroLleno(tablero);
	}
	// creo una funcion mostrartablero donde muestro el la consola un tablero que se modifica mientras se juega
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
	//creo una funcion hayganador para que compruebe cada celda y si hay en la matriz tres celdas juntas con el mismo valor entonces ha ganado
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
	//creo una funcion tablerolleno donde si las celdas estan todas llenas y no hay un ganador entonces hay in empate y se termina el juego
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

