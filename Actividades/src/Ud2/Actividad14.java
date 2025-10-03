package Ud2;
import java.util.Scanner;
public class Actividad14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int dia,mes,año;
		System.out.println("Escribeme una fecha");
		System.out.println("dia:");
		dia = sc.nextInt();
		System.out.println("mes:");
		mes = sc.nextInt();
		System.out.println("año:");
		año = sc.nextInt();
		if (mes <1 || mes > 12 || dia < 1 || dia > 31|| año <0) {
			System.out.println("La fecha no es correcta");
		}
		else if (mes ==2 && dia > 28 || (mes==4||mes==6||mes==9||mes==11)&& dia>30) {
					System.out.println("La fecha no es correcta"); 
		}else {
			dia++;
			if ((mes==4||mes==6||mes==9||mes==11)&& dia == 31) {
				dia = 1;
				mes++;
				if (mes == 13) {
					mes=1;
					año++;
					
				}
			} else if ((mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)&& dia == 32) {
				dia = 1;
				mes++;
				if (mes == 13) {
					mes=1;
					año++;
				}
			}  else if ((mes==2)&& dia == 29) {
				dia = 1;
				mes++;
				if (mes == 13) {
					mes=1;
					año++;
				}
			}
			System.out.println("La fecha es " + dia + "/" + mes + "/" + año);
		
		}
			
	}
}
