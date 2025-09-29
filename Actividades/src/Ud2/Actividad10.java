package Ud2;
import java.util.Scanner;
public class Actividad10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero;
		String numerooriginal, numeroinvert;
		System.out.println("Escribe un número entre 0 y 9.999:");
		numero =sc.nextInt();
		//convertir el numero en un string llamdo numerooriginal
		 numerooriginal = String.valueOf(numero);
		 // invertimos numerooriginal
	    numeroinvert  = new StringBuilder(numerooriginal).reverse().toString();

        // Comparar
        if (numerooriginal.equals(numeroinvert)) {
            System.out.println("El número es capicúa.");
        }else if (numero < 0) {
        	System.out.println("Error: el numero no esta entre los numeros dichos");
        }
        else {
            System.out.println("El número no es capicúa.");
        }
	}

}
