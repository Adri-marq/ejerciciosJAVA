package Ud5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] repes= new int[1];
		int	num;
		num = 0;
		for(int i = 0;i<repes.length;i++) {
		while(num != -1) {
		System.out.println("Escribe un numero para la tabla");
		num= sc.nextInt();
		if(num!=-1) {
		repes[i]=num;
		return Arrays.copyOf(repes, repes.length+1);
		}
		}
		}
	System.out.println(Arrays.toString(sinRepetidos(repes)));
	}
public static int[] sinRepetidos(int t[] ) {
for(int i=0;i<t.length;i++) {
	for (int j = 0; j < t.length; j++) {
		if(t[i]==t[j]) {
			t[i]=t[i+1];
			return Arrays.copyOf(t, t.length-1);
		}
		
	}
}
	return t;	
}
}
