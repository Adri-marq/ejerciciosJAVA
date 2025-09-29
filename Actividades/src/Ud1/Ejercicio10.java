package Ud1;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean lluvia,tarea,biblio,salir;
		System.out.println("¿Esta lloviendo?");
		lluvia = sc.nextBoolean();
		System.out.println("¿Has terminado la tarea?");
		tarea = sc.nextBoolean();
		System.out.println("¿Necesitas ir a la biblioteca?");
		biblio = sc.nextBoolean();
		salir = (!lluvia && tarea )|| biblio;
		System.out.println("¿Puedes salir?"+ salir);
	}

}
