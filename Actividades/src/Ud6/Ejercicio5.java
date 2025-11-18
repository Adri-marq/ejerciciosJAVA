package Ud6;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String nombre,vocales="aeiouAEIOUáéíóúÁÉÍÓÚàèìòùÀÈÌÒÙäëïöüÄËÏÖÜ";
		//escribo un nombre
		System.out.println("Escribeme tu nombre y apellidos:");
		nombre=sc.nextLine();
		//creo un bucle en el cual compares cada letra con la variable vocal y si no esta entonces lo muestra
	for(int i=0;i<nombre.length();i++) {
		char vocal= nombre.charAt(i);
		if(vocales.indexOf(vocal)==-1) {
			System.out.print(nombre.charAt(i));
		}
	}
	
	
	}
}
