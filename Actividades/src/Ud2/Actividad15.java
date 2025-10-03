package Ud2;
import java.util.Scanner;
public class Actividad15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dia;
		System.out.println("escribe un numero del 1 al 7 y te dire que dia de la semana es:");
		dia = sc.nextInt();
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		 default:
			 System.out.println("no existe  este dia");
		}
	}

}
