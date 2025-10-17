package Ud4;

import java.util.Scanner;

public class Ejercicio6 {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	char letra;
	System.out.println("escribe me una letra");
	letra = sc.next().charAt(0);
	vocal(letra);
}
public static void vocal(char letra) {
	boolean caracter;
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

