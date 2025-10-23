package Ud4;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		//se pregunta los valores de las variables
		int n;
		System.out.println("dime un numero y te lo factorizo");
		n = sc.nextInt();
		System.out.println(factorial(n));
	}
	//se crea una funcion la cual se devuelve a si mismo
	public static int factorial(int n) {
		//si n es 0 entonces es 1
		if(n == 0) {
			return 1;
		}else {
			//si no entonces el numero se mltiplica por la funcion -1
			return n * factorial(n-1);
		}
	}
}
