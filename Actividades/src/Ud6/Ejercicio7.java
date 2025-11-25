package Ud6;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//creamos las variables que vamos a utilizar
		String frase,palabra,ult=".,;:?!=+*-><_})ºª^/]", pr="¿(/[{-+*¡_><";
		int contador=0;
		//preguntamos los valores
		System.out.println("Dime una frase");
		frase=sc.nextLine();
		//separamos la frase en cachos
		String[] fpartida=frase.split(" ");
		//preguntamos la palabra
		System.out.println("dime la palabra de la frase");
		palabra=sc.nextLine();
		//comprobamos cuantas veces tiene la palabra y le sumanos un contador
		for(int i=0;i<fpartida.length;i++) {
			if (fpartida[i].equalsIgnoreCase(palabra)){
				contador++;
			}
			for(int j=0;j<ult.length();j++) {
				if (fpartida[i].equalsIgnoreCase(palabra+ult.charAt(j))){
					contador++;
				}
			}
			for(int j=0;j<pr.length();j++) {
				if (fpartida[i].equalsIgnoreCase(pr.charAt(j)+palabra)){
					contador++;
				}
			}
			for(int j=0;j<ult.length();j++) {
				for(int l=0;l<pr.length();l++) {
					if (fpartida[i].equalsIgnoreCase(pr.charAt(l)+palabra+ult.charAt(j))){
						contador++;
					}
				}
			}
			
		}
		//lo mostramos 
		System.out.println("en la frase "+frase+" tiene "+contador+" "+palabra);
	}

}
