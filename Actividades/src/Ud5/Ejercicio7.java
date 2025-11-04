package Ud5;

import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		   // Crear los arreglos t1 y t2 con 6 elementos cada uno
        int[] t1 = new int[6];
        int[] t2 = new int[6];
        
        // Leer 6 números para t1
        System.out.println("Introduce 6 números para la primera serie (t1):");
        for (int i = 0; i < 6; i++) {
            t1[i] = sc.nextInt();
        }
        
        // Leer 6 números para t2
        System.out.println("Introduce 6 números para la segunda serie (t2):");
        for (int i = 0; i < 6; i++) {
            t2[i] = sc.nextInt();
        }
        
        // Ordenar ambos arreglos
        Arrays.sort(t1);
        Arrays.sort(t2);
        
        // Crear el arreglo t3 con el tamaño adecuado
        int[] t3 = new int[t1.length + t2.length];
        
        // Usar índices i1, i2, i3 para intercalar elementos
        int i1 = 0, i2 = 0, i3 = 0;
        
        // Fusionar ambos arreglos en t3 sin ordenar
        while (i3 < t3.length) {
            if (i1 < t1.length && (i2 >= t2.length || t1[i1] <= t2[i2])) {
                t3[i3++] = t1[i1++];
            } else {
                t3[i3++] = t2[i2++];
            }
        }
        
        // Mostrar el resultado de t3
        System.out.println("La serie fusionada y ordenada es:");
        for (int i = 0; i < t3.length; i++) {
            System.out.print(t3[i] + " ");
        }
	}
}

