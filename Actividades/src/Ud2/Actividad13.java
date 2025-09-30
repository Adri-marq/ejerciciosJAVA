package Ud2;
import java.util.Scanner;
public class Actividad13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hora,mins,seg;
		System.out.println("Escribeme la hora");
		System.out.println("hora:");
		hora = sc.nextInt();
		System.out.println("minutos:");
		mins = sc.nextInt();
		System.out.println("segundos:");
		seg = sc.nextInt() + 1;
		if (seg == 60) {
			seg = 00;
			mins++;
			if (mins==60) {
				mins = 00;
				hora++;
				if (hora==24) {
					hora = 00;
				}
			}
		}
		if (hora>23||mins>60||seg>60) {
			System.out.println("Error");
		}
		else if(hora<10 && mins<10 && seg<10) {
			System.out.println("La hora es "+0+hora+":"+0+mins+":"+0+seg);
		}
		else if (hora<10 && mins<10 && seg>10) {
			System.out.println("La hora es "+0+hora+":"+0+mins+":"+seg);
			}
		else if (hora<10 && mins>10 && seg<10) {
			System.out.println("La hora es "+0+hora+":"+mins+":"+0+seg);
			}
		else if (hora<10 && mins>10 && seg>10) {
			System.out.println("La hora es "+0+hora+":"+mins+":"+seg);
			}
		else if (hora>10 && mins<10 && seg<10) {
			System.out.println("La hora es "+hora+":"+0+mins+":"+0+seg);
			}
		else if (hora>10 && mins<10 && seg>10) {
			System.out.println("La hora es "+hora+":"+0+mins+":"+seg);
			}
		else if (hora>10 && mins>10 && seg<10) {
			System.out.println("La hora es "+hora+":"+mins+":"+0+seg);
			}
		else if (hora>10 && mins>10 && seg>10) {
			System.out.println("La hora es "+hora+":"+mins+":"+seg);
			}
	}

}
