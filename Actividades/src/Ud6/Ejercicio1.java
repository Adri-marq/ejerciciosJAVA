package Ud6;

import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String palabra1, palabra2;
	System.out.println("Dime la primera palabra:");
	palabra1=sc.nextLine();
	System.out.println("Dime la segunda palabra:");
	palabra2=sc.nextLine();
	if(palabra1.length()>palabra2.length()) {
		System.out.println("la palabra "+ palabra2+" es mas corta que la palabra "+palabra1);
	}else if(palabra1.length()==palabra2.length()) {
		System.out.println("Son igual de cortas");
	}else {
		System.out.println("la palabra "+ palabra1+" es mas corta que la palabra "+ palabra2);
	}

}
}
