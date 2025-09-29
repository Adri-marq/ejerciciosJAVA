package Ud2;

import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Pedimos los coeficientes
		double coeA, coeB, coeC, dentroraiz, raiz, solucion1, solucion2,solucion3;
		System.out.println("Queremos hacer una ecuacion de 2º grado indicame los datos: ");
		System.out.println("Escribe aqui A");
		 coeA = sc.nextDouble();
		System.out.println("Escribe aqui B");
		 coeB = sc.nextDouble();
		System.out.println("Escribe aqui C");
		 coeC = sc.nextDouble();
		 //creaqmos la raiz de segundo grado
		 dentroraiz = ((coeB * coeB) - 4 * coeA * coeC);
		 raiz = Math.sqrt(dentroraiz);
		 solucion1 = -coeB + raiz / 2*coeA;
		 solucion2 = -coeB - raiz / 2*coeA;
	if (dentroraiz <= 0) {
		System.out.println("No existe");
	}
	else if (coeA == 0 ) {
		solucion3 = -coeC /coeB;
		System.out.println("No es una ecuacion de segundo grado pero si una de primer grado");
		System.out.println("el resultado seria este:" + solucion3);
	}
	else if (coeB == 0) {
		System.out.println("cualquier numero es una solucion valida");
	}
	else {
		System.out.println(" Estas serian sus soluciones " + solucion1 + ", " + solucion2);
		
	}
	
	
	}
}