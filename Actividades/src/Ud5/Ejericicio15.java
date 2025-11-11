package Ud5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejericicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] tabla;
		int num,n,impares=0;
		System.out.println("como de larga quieres que sea tu tabla");
		num=sc.nextInt();
		tabla= new int[num];
	for(int i=0;i<tabla.length;i++) {
		System.out.println("dime un numero para la tabla");
		n=sc.nextInt();
		if(n %2!=0) {
			impares++;
			}else {
			tabla[i]=n;
			}	
	}
	System.out.println(Arrays.toString(tabla));
	System.out.println("Impares desechados:"+impares);
	}

}
