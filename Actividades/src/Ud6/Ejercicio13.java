package Ud6;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//escribimos las variables y le damos un valor
		String frase,repe="";
		System.out.println("Escribe una frase");
		frase=sc.nextLine();
		//ponemos en minuscula toda la frase
		frase=frase.toLowerCase();
		//hacemos un bucle en el cual se cuente todas las veces que se ha repetido una letra
		for(int i=0;i<frase.length();i++) {
			int contador=0;
			for(int j=0;j<frase.length();j++) {
				if(frase.charAt(i)==frase.charAt(j)) {
					contador++;
				}
			}
			//solo muestro una vez las letras de la frase y no muestro los espacios
			if(repe.indexOf(frase.charAt(i))==-1 && frase.charAt(i)!=' ') {
				System.out.println(frase.charAt(i)+": "+contador);
			}
			repe += frase.charAt(i);
		}
		
	}

}
