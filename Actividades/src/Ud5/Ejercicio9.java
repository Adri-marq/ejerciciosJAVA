package Ud5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] notas = new int[5][3];
		int not,alum;
		for(int i =0;i<notas[0].length;i++) {
		for(int j=0;j<notas.length;j++) {
			System.out.println("dime las notas del alumno "+(j+1)+" del "+(i+1)+" trimestre");
			not = sc.nextInt();
			notas[j][i]=not;
		}
	}
		for (int[] fila : notas) {
		    System.out.println(Arrays.toString(fila));
		}

	mediaTrimestres(notas);
	System.out.println("de que alumno quieres saber la media");
	alum=sc.nextInt();
	mediaAlumno(notas,alum);
	}
	public static void mediaTrimestres(int[][] media) {
		//hago el calculo
		double suma,acum,trim;
		for(int j=0;j<media[0].length;j++) {
			suma=0;
			trim=0;
			acum=0;
			for(int i=0;i<media.length;i++) {
				suma= suma + media[i][j];
				acum++;
				trim =suma/acum;
		}
		System.out.println((j+1)+ "trimestre su nota media es:"+trim);
		}
	
	}
	public static void mediaAlumno(int[][] media,int alum) {
		//hago el calculo
		double suma,acum,result;
		suma=0;
		acum=0;
		result=0;
		
		for(int i=0;i<media.length;i++) {
				suma= suma + media[i][alum];
				acum++;
				result =suma/acum;
		}
		System.out.println("la nota media del alumno "+alum+" es "+result);
		}
	}


