package Ud5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inicialización del arreglo de números y las variables
        int[] numeros = new int[1];
        int n=0, par = 0, impar = 0;

        // Bucle para ingresar números hasta que se ingrese -1
        for (int i = 0; i<numeros.length||n != -1; i++) {
            System.out.println("Escribe un número para la tabla, -1 para terminar: ");
            n = sc.nextInt();
            
            if (n != -1) {
                // Si el arreglo está lleno, lo ampliamos
                if (i == numeros.length) {
                    numeros = Arrays.copyOf(numeros, numeros.length + 1);
                }

                // Agregar el número al arreglo
                numeros[i] = n;

                // Contar si es par o impar
                if (n % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }
        }

        // Crear los arreglos para los pares e impares
        System.out.println("Números pares: " + Arrays.toString(pares(numeros, par)));
        System.out.println("Números impares: " + Arrays.toString(impares(numeros, impar)));

        sc.close();  // Cerramos el scanner para evitar fugas de recursos
    }

    // Método que devuelve el arreglo de números pares
    public static int[] pares(int[] num, int par) {
        int[] pares = new int[par];
        int p = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                pares[p++] = num[i];
            }
        }
        return pares;
    }

    // Método que devuelve el arreglo de números impares
    public static int[] impares(int[] num, int impar) {
        int[] impares = new int[impar];
        int imp = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                impares[imp++] = num[i];
            }
        }
        return impares;
    }
}