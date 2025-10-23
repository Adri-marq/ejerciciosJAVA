package Ud4;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("dime un numero");
		n = sc.nextInt();
		System.out.println(fibonacci(n));
	}
	//se crea una funcion la cual se devuelve a si mismo
public static int fibonacci(int n) {
//si n es 0 entonces es o si es 1 es 1 pero si no es ninguno de los anteriores la funcion -1 + funcion -2
	if (n==0) {
	return 0;
}else if (n==1)	{
	return 1;
}else {
	return fibonacci(n-1)+fibonacci(n-2);
}
}
}
