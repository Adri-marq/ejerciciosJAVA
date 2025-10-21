package Ud4;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Escribo los valores y le doy un valor
		int num1,num2;
		System.out.println("Escribeme dos numeros");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		//si la funcion es true entonces son numeros amigos si no no
	if (numerosamigos(num1,num2) == true) {
		System.out.println("Son numeros amigos");
	}else {
		System.out.println("No son numeros amigos");
	}
	}
	//hacemos la funcion
	public static boolean numerosamigos(int numero, int numero2) {
		//creamos las variables y le damos un valor
		boolean amigo=true;
		int suma1,suma2,i,i2;
		suma1=0;
		suma2=0;
		//hacemos un bucle que termine cuando i sea mayor a numero1
		for(i=1;i<numero;i++) {
			if(numero%i==0) {
				suma1 = suma1+i;
			}
		}
		//hacemos otro bucle para el segundo numero
		for(i2=1;i2<numero2;i2++) {
			if(numero2%i2==0) {
				suma2 = suma2+i2;
			}
		}
		//si algunas de los numeros no son iguales entonces no son amigos
		if(suma1 != numero2 || suma2 !=numero) {
			amigo = false;
		}
	return amigo;
	}
}
