package Ud5;

import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		   // Crear los arreglos t1 y t2 con 6 elementos cada uno
        int[] tabla1 = new int[6];
        int[] tabla2 = new int[6];
        
        // Leer 6 números para t1
        System.out.println("Introduce 6 números para la primera serie (t1):");
        for (int i = 0; i < 6; i++) {
            tabla1[i] = sc.nextInt();
        }
        
        // Leer 6 números para t2
        System.out.println("Introduce 6 números para la segunda serie (t2):");
        for (int i = 0; i < 6; i++) {
            tabla2[i] = sc.nextInt();
        }
        
        // Ordenar ambos arreglos
        Arrays.sort(tabla1);
        Arrays.sort(tabla2);
        
        // Crear el arreglo t3 con el tamaño adecuado
        int[] tablacom = new int[tabla1.length + tabla2.length];
        
        // Usar índices i1, i2, i3 para intercalar elementos
        int i1 = 0, i2 = 0, i3 = 0;
        
        // Fusionar ambos arreglos en t3 sin ordenar
        while (i3 < tablacom.length) {
            if (i1 < tabla1.length && (i2 >= tabla2.length || tabla1[i1] <= tabla2[i2])) {
                tablacom[i3++] = tabla1[i1++];
            } else {
                tablacom[i3++] = tabla2[i2++];
            }
        }
        
        // Mostrar el resultado de t3
        System.out.println("La serie fusionada y ordenada es:");
        for (int i = 0; i < tablacom.length; i++) {
            System.out.print(tablacom[i] + " ");
        }
	}
}

