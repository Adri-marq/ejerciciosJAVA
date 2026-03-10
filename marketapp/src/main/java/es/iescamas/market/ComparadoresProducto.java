package es.iescamas.market;

import java.util.Arrays;
import java.util.Comparator;

public class ComparadoresProducto {

	static Comparator<Producto> POR_PRECIO_ASC =
		    (a, b) -> Double.compare(a.getPrecio(),b.getPrecio());

		    static Comparator<Producto> POR_CATEGORIA_Y_RATING =
		            Comparator.comparing(
		                    Producto::getCategoria, 
		                    Comparator.nullsLast(String::compareTo)
		            ).thenComparingDouble(Producto::getRating);
}
