package Ud6;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String frase,palabra,ult=".,;:?!=+*-><_})ºª^/]", pr="¿(/[{-+*¡_><";
		int contador=0;
		
		System.out.println("Dime una frase");
		frase=sc.nextLine();
		String[] fpartida=frase.split(" ");
		System.out.println("dime la palabra de la frase");
		palabra=sc.nextLine();
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
		System.out.println("en la frase "+frase+" tiene "+contador+" "+palabra);
	}

}
