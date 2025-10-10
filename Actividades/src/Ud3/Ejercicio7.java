package Ud3;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// hacemos unas variables
		int coef,resultado;
		
		// hacemos un booleano para comprobar que el numero es impar
		boolean impar;
		// decimos que la variable resultado sea igual a 1
		resultado=1;
		// hacemos un bucle donde el coef empieze por 0 y termine en un numero antes del 20
		for(coef=0;coef<20;coef++) {
			impar = (coef %2) !=0;
			//hacemos un acumulador
			if (impar == true) {
				resultado = resultado * coef;
			}
			
		}
		System.out.println(resultado);
		
	}

}
