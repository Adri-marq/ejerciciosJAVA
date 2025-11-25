package Ud6;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String dialecto1, dialecto2,frase;
		//decimos cual es el dialecto de javalin
		dialecto1="Javalín, javalón \t\t\t\t";
		dialecto2="\t\t\t\t javalén, len, len";
		//preguntamos la frase 
		System.out.println("Escribe la frase a traducir:");
		frase=sc.nextLine();
		//si contiene la muletilla entonces se le quita y decimos que es de javalin si no nada
		if(frase.startsWith(dialecto1)) {
			frase=frase.replaceAll(dialecto1, "");
		System.out.println("la frase esta en javalin traducido es:");
		System.out.println(frase);
		}if(frase.endsWith(dialecto2) ) {
			frase=frase.replaceAll(dialecto2, "");
			System.out.println("la frase esta en javalin traducido es:");
			System.out.println(frase);
		}else {
			System.out.println("No es un dialecto de javalin");
			System.out.println(frase);
		}
	}

}
