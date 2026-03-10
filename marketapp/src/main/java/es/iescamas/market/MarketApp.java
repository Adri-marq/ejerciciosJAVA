package es.iescamas.market;

import java.util.Arrays;
import java.util.Comparator;

/**
 * MarketApp
 * ---------
 * Utilidad “de negocio” para practicar TDD con:
 *  - Interfaces (Descuentable, Enviable)
 *  - Comparable (orden natural en Producto)
 *  - Comparator (criterios alternativos)
 *  - Tablas (arrays) + ordenación manual (burbuja)
 *
 * ⚠️ Importante para la práctica:
 * - NO se usan colecciones (List/ArrayList/Streams).
 * - La mayoría de métodos devuelven una NUEVA tabla para no modificar el original.
 * - Los tests deben guiar la implementación (TDD).
 */
public class MarketApp {

	public double precioFinal(Producto p, double precio) {
		
		return precio-(precio*p.getPorcentajeDescuento());
	}

	public double costeEnvio(Producto p) {
		if(p.getPesoKg()<=0)
			throw new IllegalArgumentException("peso invalido");
		
		 double result = 2.99 + (p.getPesoKg() * 1.20);
		return result;
	}

	public Producto[] copiar(Producto[] original) {
	Producto[] copia = Arrays.copyOf(original, original.length);
		return copia;
	}

	public Producto[] ordenarNatural(Producto[] original) {
		Producto[] copia = copiar(original);
		for (int i = 0; i < copia.length - 1; i++) {
			  for (int j = 0; j < copia.length - 1 - i; j++) {
				  if(copia[j].compareTo(copia[j+1])>0) {
					  Producto p=copia[j];
					  copia[j]=copia[j+1];
					  copia[j+1]=p;
				  }
				  
			  }
	}
	
		return copia;
	}

	public Producto[] ordenar(Producto[] t, Comparator<Producto> comparator) {
		Producto[] copia = copiar(t);
		for (int i = 0; i < copia.length - 1; i++) {
			  for (int j = 0; j < copia.length - 1 - i; j++) {
				  if(comparator.compare(copia[j], copia[j+1])>0) {
					  Producto p=copia[j];
					  copia[j]=copia[j+1];
					  copia[j+1]=p;
				  }
				  
			  }
	}
	
		return copia;
	}

	public Producto[] filtrarPorCategoria(Producto[] t, String string) {
		int max=0;
		Producto[] filtro = new Producto [max];
		for (int i = 0; i < t.length; i++) {
		if(t[i].getCategoria() == string) {
			for (int j = 0; j < filtro.length; j++) {
				
				}
		}
		}
			return filtro;
	}
	


}
