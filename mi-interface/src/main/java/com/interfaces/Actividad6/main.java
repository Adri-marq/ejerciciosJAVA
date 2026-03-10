package com.interfaces.Actividad6;
import java.lang.reflect.Array;
import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Valorable[] valorable = new Valorable[3];
		
		Valorable p1 = new Producto("camion",12,"1");
		Valorable p2 = new Producto("coche",7,"2");
		Valorable p3 = new Producto("avion",7,"3");
		valorable[0]=p1;
		valorable[1]=p2;
		valorable[2]=p3;
		Producto.ordenarPorPrecioAscYNombre(valorable);
		/*for (int i = 0; i < valorable.length - 1; i++) {
			  for (int j = 0; j < valorable.length - 1 - i; j++) {
				  if(valorable[j].getPrecio() > valorable[j+1].getPrecio()) {
					  Valorable va=valorable[j];
					  valorable[j]=valorable[j+1];
					  valorable[j+1]=va;
				  }else if(valorable[j].getPrecio() == valorable[j+1].getPrecio()) {
					  if (valorable[j].getNombre().compareToIgnoreCase(valorable[j+1].getNombre()) > 0) {
			                Valorable num = valorable[j];
			                valorable[j] = valorable[j+1];
			                valorable[j+1] = num;
			            }
				  }
				  
			  }
	}
		 */
		System.out.println(Arrays.toString(valorable));
}
}
