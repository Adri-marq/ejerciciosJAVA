package Ud6;

import java.util.Scanner;

public class Ejercicio2 {
public static Scanner sc =new Scanner(System.in);
public static void main(String[] args) {
	
	int version;
	
	do {
	System.out.println("Que version quieres jugar");
	System.out.println("1) version 1 | 2) version 2 ");
	version=sc.nextInt();
	switch(version){
	case 1:
		version1();
		break;
	case 2:
		version2();
		break;
	case 3: 
		System.out.println("saliendo......");
		break;
	default:
		System.out.println("Error elige de nuevo");
		
	}
	
	}while(version!=3);
}
public static void version1() {
	String contraseña,palabra;
	System.out.println("Que contraseña quieres que acierte el otro usuario:");
	contraseña=sc.next();
	System.out.println("Pistas:");
	System.out.println("La longitud de la contraseña es "+contraseña.length());
	System.out.println("la primera letra es "+contraseña.charAt(0)+ " y ultima letra es "+contraseña.charAt(contraseña.length()-1));
 do {
	 System.out.println("¿Que palabra crees que es? ");
	 palabra=sc.nextLine();
 }while(contraseña!=palabra);
}
public static void version2() {
	String contraseña,palabra;
	System.out.println("Que contraseña quieres que acierte el otro usuario:");
	contraseña=sc.next();
	 do {
		 System.out.println("¿Que palabra crees que es? ");
		 palabra=sc.next();
		 
			 if(palabra.compareTo(contraseña)<0) {
				 System.out.println("Es menor alfabeticamente");
			 }else if (palabra.compareTo(contraseña)>0){
				 System.out.println("Es mayor alfabeticamente");
			 }
		 
	 }while(palabra.compareTo(contraseña)!=0);
}
}
