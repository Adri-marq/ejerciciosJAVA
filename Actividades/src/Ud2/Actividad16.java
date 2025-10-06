package Ud2;

import java.util.Scanner;

public class Actividad16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero, unidades, decenas;
		String unidad = null;
		System.out.println("escribe un numero entre 1 y 99:");
		numero = sc.nextInt();
		unidades = numero %10;
		decenas =numero/10;
		switch (unidades) {
		case 0:
			unidad = "Cero";
			break;
		case 1:
			unidad = "uno";
			break;
		case 2:
			unidad = "dos";
			break;
		case 3:
			unidad = "tres";
			break;
		case 4:
			unidad = "cuatro";
			break;
		case 5:
			unidad = "cinco";
			break;
		case 6:
			unidad = "seis";
			break;
		case 7:
			unidad = "siete";
			break;
		case 8:
			unidad = "ocho";
			break;
		case 9:
			unidad = "nueve";
			break;	
		}
		
	if (numero <10) {
		System.out.println(unidad);
	}else if (numero == 10 ) {
		System.out.println("diez");
	} else if (numero <= 15) {
		if ( unidades ==1 ) {
			System.out.println("once");
		} else if ( unidades ==2 ) {
			System.out.println("doce");
		} else if ( unidades ==3 ) {
			System.out.println("trece");
		} else if ( unidades ==4 ) {
			System.out.println("catorce");
		} else if ( unidades ==5 ) {
			System.out.println("quince");
		}
	}else if (numero < 20) {
		System.out.println("dieci"+ unidad);
	}else if (numero == 20) {
		System.out.println("veinte");
	}else if (numero < 30) {
		System.out.println("veinti"+unidad);
	}else if (numero == 30) {
		System.out.println("treinta");
	}else if (numero < 40) {
		System.out.println("treinta y "+unidad);
	}else if (numero == 40) {
		System.out.println("cuarenta");
	}else if (numero < 50) {
		System.out.println("cuarenta y "+unidad);
	}else if (numero == 50) {
		System.out.println("cincuenta");
	}else if (numero < 60) {
		System.out.println("cincuenta y "+unidad);
	}else if (numero == 60) {
		System.out.println("sesenta");
	}else if (numero < 70) {
		System.out.println("sesenta y "+unidad);
	}else if (numero == 70) {
		System.out.println("setenta");
	}else if (numero < 80) {
		System.out.println("setenta y "+unidad);
	}else if (numero == 80) {
		System.out.println("ochenta");
	}else if (numero < 90) {
		System.out.println("ochenta y "+unidad);
	}else if (numero == 90) {
		System.out.println("noventa");
	}else if (numero < 100) {
		System.out.println("noventa y "+unidad);
	}
			
	}

}
