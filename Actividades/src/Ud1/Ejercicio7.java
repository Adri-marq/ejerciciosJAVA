package Ud1;
import java.util.Scanner;
public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double PI = 3.141592;
		System.out.println("cual es el radio:");
		double rad = sc.nextDouble();
		double longitud = PI * 2.0 * rad;
		double area = PI * rad * rad;
		System.out.println("La longitud es " + longitud + " y el área es " + area);

	}
}
