package Ud1;
import java.util.Scanner;
public class actividad11 {

	public static void main(String[] args) {
		float Manzanas1,Peras1,Manzanas2,Peras2;
		double Importeperas,Importemanzanas;
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos  kilos de manzanas has vendido el primer semestre");
		 Manzanas1 = sc.nextFloat();
		System.out.println("Cuantos  kilos de peras has vendido el primer semestre");
		 Peras1 = sc.nextFloat();
		System.out.println("Cuantos kilos de manzanas has vendido el segundo semestre");
		 Manzanas2 = sc.nextFloat();
		System.out.println("Cuantos kilos de peras has vendido el segundo semestre");
		 Peras2 = sc.nextFloat() ;
		 Importeperas = (Peras1 + Peras2) * 1.95;
		 Importemanzanas = (Manzanas1 + Manzanas2) * 2.35;
		 System.out.println("El importe total de las manzanas es " + Importemanzanas + " y el importe total de las peras es " + Importeperas );
		 
		

	}

}
