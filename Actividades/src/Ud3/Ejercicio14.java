package Ud3;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//añado una variable
		int numero;
		//pregunto la cantidad de la variable
		System.out.println("Dime un numero");
		numero=sc.nextInt();
		//creo un bucle en el cual tiene que haber las mimas lineas que el numero que he puesto
		//que pare cuando llegue a 0 y cuando reinicie se le resta 1 a linea
		for(int linea =numero;linea!=0;linea--) {
			//se crea otro bucle en el cual halla los mismos asteriscos que le numero de linea
			//en donde este. que se acabe cuando asterisco llegue a 0 y que se reste 1 cuando se reinicie el bucle
			for(int asterisco = linea; asterisco!=0;asterisco--) {
				System.out.print("*");
			}
			//salto de linea sin poner println
			System.out.print("\n");
		}
	}

}
