package Ud2;
import java.util.Scanner;
public class Actividad11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Que nota has sacado?");
		double nota = sc.nextDouble();
		if (nota >= 0 && nota <5) {
			System.out.println(" Tu nota es Insuficiente");
		} else if (nota >= 5 && nota <6) {
			System.out.println(" Tu nota es Suficiente");
			} else if (nota >=6 && nota<7) {
				System.out.println(" Tu nota es Bien");
				} else if (nota >= 7 && nota <= 8) {
					System.out.println(" Tu nota es Notable");
				} else if (nota >= 9 && nota <= 10) {
					System.out.println(" Tu nota es Sobresaliente");
				} else {
					System.out.println("No puedes tener esa nota");
				}
	}

}
