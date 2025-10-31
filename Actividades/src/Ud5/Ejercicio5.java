package Ud5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// creamos las variables 
		int longitud,num,fallos,mayor;
		//preguntamos la longitud de las tablas
		System.out.println("como de largo quieres que sea la cadena de numeros(1 al 5)");
		longitud = sc.nextInt();
		if(longitud <1 || longitud>5) {
			System.out.println("solo puede ser del 1 al 5");
		}else {
		//creamos las tablas
		int[] combinacion = new int[longitud];
		int[] tucombinacion = new int[longitud];
		//le damos un valor aleatorio a cada celda de una de las tablas
		for(int i=0; i<combinacion.length;i++) {
			combinacion[i]=(int)(Math.random()*9)+1;
		}
		//hacemos un bucle que termine cuando no halla ningun fallo
		do {
			//ponemos que fallos es 0
			fallos=0;
			//creamos un bucle para comprobar si los numeros son iguales
			for(int i=0; i<combinacion.length;i++) {
				//pedimos los valores de la segunda tabla
				for(int j=0; j<tucombinacion.length;j++) {
				System.out.println("numero");
				num = sc.nextInt();
				tucombinacion[j]=num;
				}
				//hacemos la comprobacion y si no es igual el numero lo teien que volve a escribir la segunda tabla
				for( i=0; i<combinacion.length;i++) {
				if(combinacion[i]>tucombinacion[i]) {
					System.out.print(tucombinacion[i]);
					System.out.print(" mayor/");
					fallos=1;
				}else if(combinacion[i]<tucombinacion[i]) {
					System.out.print(tucombinacion[i]);
					System.out.print(" menor/");
					fallos=1;
				}else {
					System.out.print(tucombinacion[i]);
					System.out.print(" igual/");
				}
				}
			}
			//si hay un fallo o mas sale esta frase
			if (fallos > 0) {
				System.out.println("  intentalo de nuevo");
			}
		}while(fallos!=0);
		//si no hay ningun fallo sale esta frase
		System.out.println("  Felicidades por ganar :)");
		}
		}

}
