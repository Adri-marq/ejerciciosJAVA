package Ud2;
import java.util.Scanner;
public class Actividad9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero, cifras;
		// le preguntamos el numero
		System.out.println("Escribe aqui un numero entre 0 y 99.999: ");
		numero = sc.nextInt();
		if (numero < 0 && numero > 99999) {
			System.out.println("Error: no has puesto un numero entre los valores que se te indica");
		} else if (numero <= 9){
			cifras = 1;
			System.out.println("El numero " + numero + " tiene " + cifras + " cifras");
		}
		 else if (numero <= 99){
				cifras = 2;
				System.out.println("El numero " + numero + " tiene " + cifras + " cifras");
			} else if (numero <= 999){
				cifras = 3;
				System.out.println("El numero " + numero + " tiene " + cifras + " cifras");
			} else if (numero <= 9999){
				cifras = 4;
				System.out.println("El numero " + numero + " tiene " + cifras + " cifras");
			} else if (numero <= 99999){
				cifras = 5;
				System.out.println("El numero " + numero + " tiene " + cifras + " cifras");
			}
		
	}

}
