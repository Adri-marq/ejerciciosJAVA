package Ud4;

import java.util.Scanner;

public class Ejercicio6 {
public static void main(String [] args) {
	//HACEMOS LAS VARIABLES Y PEIDMOS SU VALOR
	Scanner sc = new Scanner(System.in);
	char letra;
	System.out.println("escribe me una letra");
	letra = sc.next().charAt(0);
	vocal(letra);
}
//HACEMOS UNA FUNCION
public static void vocal(char letra) {
	boolean caracter;
	//HACEMOS UN IF DICIENDO QUE SI TIENE ALGUNA VOCAL ENTONCES ES UNA VOCAL
	if (letra == 'a'||letra=='e'||letra== 'i'||letra == 'o'||letra=='u') {
		caracter = true;
	} else {
		caracter = false;
	}
	if (caracter == true) {
		System.out.println("es una vocal");
	}else {
		System.out.println("no es una vocal");
	}
}
}

