package Ud1;
import java.util.Scanner;
public class actividad14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribeme un numero decimal");
		double numerodec = sc.nextDouble();
		double numerored = Math.round(numerodec);
		System.out.println("El numero mas proximo es " + numerored);
	}

}
