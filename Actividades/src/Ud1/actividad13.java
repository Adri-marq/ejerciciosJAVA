package Ud1;
import java.util.Scanner;
public class actividad13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribeme las notas del primer trimestre");
		int  primer = sc.nextInt();
		System.out.println("Escribeme las notas del segudno trimestre");
		int  segundo = sc.nextInt();
		System.out.println("Escribeme las notas del tercer trimestre");
		int  tercer = sc.nextInt();
		int mediabole = (primer + segundo + tercer) / 3;
		double mediaexp = (primer + segundo + tercer) / 3.0;
		System.out.println("La nota media en el boletin es " + mediabole + " la nota media en el expediente es " + mediaexp );	
	}

}
