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
		//hago un bucle en el cual añado un numero a la tabal y hasta que no ponga -1 la longitud de la tabla aumenta
		for(int i = 0;i<repes.length | num != -1;i++) {
		System.out.println("Escribe un numero para la tabla");
		num= sc.nextInt();
		if(num!=-1) {
		repes[i]=num;
		repes=Arrays.copyOf(repes, repes.length+1);
		}
		}
		//muestra la tabla ordenada
	System.out.println(Arrays.toString(sinRepetidos(repes)));
	}
//he creado una funcion para que se eliminen los numeros repetidos
public static int[] sinRepetidos(int t[] ) {
//el primer bucle es para decir que indice estas comprobando
for (int i = 0; i < t.length; i++) {
	//este bucle es para comprobar los numeros si son repetidos
    for (int j = i + 1; j < t.length; j++) {
    	//si son repetidos entonces elimina un numero de los repetidos
        if (t[i] == t[j]) {
            // comprueba si hay mas de un numero repetido y lo repite hasta que no quede nunguno 
            for (int k = j; k < t.length - 1; k++) {
                t[k] = t[k + 1];
            }
            t = Arrays.copyOf(t, t.length - 1);
            j--; // volvemos a comprobar el nuevo elemento en la posición j
        }
    }
}
//de vuelve la tabla con un indice menos
return t=Arrays.copyOf(t, t.length-1);
}
}
