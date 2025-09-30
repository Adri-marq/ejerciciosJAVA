package Ud2;
import java.util.Scanner;
public class Actividad10corregido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero,unidades,decenas,centenas,millares;
		System.out.println("Escribe un número entre 0 y 9.999:");
		numero = sc.nextInt();
		if (numero < 10) {
			System.out.println("Error: no un numero de un solo digito no puede ser capicua");
		}else {
			if (numero < 100) {
				unidades = numero % 10;
				decenas = numero/10;
				if (unidades == decenas) {
					  System.out.println("El número es capicúa.");
				} else {
					  System.out.println("El número no es capicúa.");
				}
			}else if (numero < 1000) {
				unidades = numero % 10;
				centenas = numero/100;
				if (unidades == centenas) {
					  System.out.println("El número es capicúa.");
				} else {
					  System.out.println("El número no es capicúa.");
				}
			
			}else if (numero < 10000) {
				unidades = numero % 10;
				decenas = numero/10;
				centenas = (numero/100)%10;
				millares= (numero/1000)%10;
				if (unidades == millares && decenas == centenas) {
					  System.out.println("El número es capicúa.");
				} else {
					  System.out.println("El número no es capicúa.");
				}
			}else {
				System.out.println("Error: El numero no esta entre los valores designados");
			}
		}	
	}
}
