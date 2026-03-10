package com.interfaces.Actividad7;

import java.util.Comparator;


public class ComparadorProducto {
	static Comparator<Producto> PRECIO_DESC =
	        (a, b) -> Double.compare(b.getPrecio(), a.getPrecio());
		    
	        static Comparator<Producto> CODIGO_AZ =
	                (a, b) -> a.getCodigo().compareTo(b.getCodigo());
		
}
