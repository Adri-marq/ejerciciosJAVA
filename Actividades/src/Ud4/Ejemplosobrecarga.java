package Ud4;

public class Ejemplosobrecarga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mostrar("hola");
		mostrar(4);
		mostrar("hola otra vez", 3);
		int n = factorial(5);
		System.out.println(n);
	}
	public static void mostrar(String mensaje) {
		System.out.println(mensaje);
	}
	public static void mostrar(int numero) {
		System.out.print(numero);
		if (numero%2 == 0) {
			System.out.println(" es par");
		}else {
			System.out.println(" es impar");
		}
	}
	public static void mostrar(String texto, int veces) {
		do {
			System.out.println(texto);
			veces--;
		}while(veces !=0);
	}
	public static int factorial(int n ) {
		if (n == 0 ) {
			return 1;
		}else {
			return n * factorial (n -1);
		}
	
	}
}
