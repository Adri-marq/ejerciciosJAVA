package Ud3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int edad, alum, mediaedad, mayoredad, sumaedad;
		alum = 0;
		mayoredad = 0;
		sumaedad = 0;
		mediaedad = 0;
		do {
			System.out.println("que edad tiene el alumno");
			edad = sc.nextInt();
			if (edad >= 0) {
				alum++;
				sumaedad = sumaedad + edad;
				mediaedad = sumaedad / alum;
			
			}
			if (edad > 18) {
				mayoredad++;
			}

		} while (edad >= 0);

		System.out.println("la suma de todas las edades es " + sumaedad);
		System.out.println("la media de todas las edades es " + mediaedad);
		System.out.println("el numero de alumnos es " + alum);
		System.out.println("los alumnos de mayor de edad son " + mayoredad);

	}

}
