package Ud2;
import java.util.Scanner;
public class Actividad12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dia,mes,año;
		System.out.println("Dame una fecha:");
		System.out.println("Día:");
		dia = sc.nextInt();
		System.out.println("Mes:");
		mes = sc.nextInt();
		System.out.println("Año:");
		año = sc.nextInt();
		
		if (mes <1 || mes > 12 || dia < 1 || dia > 31|| año <0) {
			System.out.println("La fecha es incorrecta");
		}
		else if (mes ==2 && dia > 28 || (mes==4||mes==6||mes==9||mes==11)&& dia>30) {
					System.out.println("La fecha es incorrecta"); 
		}else {
			System.out.println("La fecha es correcta");
		}
		
	}

}
