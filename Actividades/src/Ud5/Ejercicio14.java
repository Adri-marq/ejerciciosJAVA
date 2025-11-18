package Ud5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int[] apuesta = new int[6],ganadora= new int[6];
		int aciertos=0;
		//creo una tabla con valores ramdom
	for(int i =0;i<ganadora.length;i++) {
		ganadora[i]= (int)(Math.random()*10);
	}
	System.out.println(Arrays.toString(ganadora));
	//hago un bucle donde en otra tabla pongo mis valores y lo comparo con la otra tabla
		do {	
		for(int i =0;i<apuesta.length;i++) {
			System.out.println("cual es tu numero de la primitiva:");
			apuesta[i]=sc.nextInt();
		}
	System.out.println(Arrays.equals(apuesta, ganadora));
	if(Arrays.equals(apuesta, ganadora)== false) {
		aciertos++;
	}
	System.out.println("Fallos:"+aciertos);
	}while(Arrays.equals(apuesta, ganadora)== false);
	System.out.println("Has ganado");
	}

}
