package Ud6;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//escribimos las variables y le damos un valor
		String conjunto1,conjunto2, palabra;
		char codificar;
		
		conjunto1=" e i k m p q r s t u v";
		conjunto2=" p v i u m t e r k q s";
		
		System.out.println("dime una palabra");
		palabra=sc.nextLine();
		palabra=palabra.toLowerCase();
		//usamos la funcion codificar
		for(int i =0;i<palabra.length();i++) {
				System.out.print(codificar(conjunto1,conjunto2,palabra.charAt(i)));
			}
	}
	//en la funcion codificar comprobamos si son iguales c y conjunto1 y muestro conjunto2 si no son iguales entonces muestro c
	public static char codificar(String conjunto1, String conjunto2, char c) {
        for (int i = 0; i < conjunto1.length(); i++) {
            if (c == conjunto1.charAt(i)) {
                return conjunto2.charAt(i);
            }
        }
        return c; 
    }


}
