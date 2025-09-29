package Ud2;
import java.util.Scanner;
public class Actividad5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// pedimos el numero
		System.out.println("Escribe aqui tu numero decimal");
		double numero = sc.nextDouble();
		// hacemos que los numeros que sean mas o igual a 1, menos o igual a -1 y igual a 0 no sean casi´cero
		if (numero == 0.0 || numero >= 1.0 || numero <= -1.0) {
			System.out.println("El numero " + numero + " no es casi-cero");
		} else {
			System.out.println("El numero " + numero + " es casi-cero");
		}

}
}