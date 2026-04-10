package es.iescamas.programacion.ej4;

import java.util.Comparator;

public class ComparadorPorAnyo implements Comparator<Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {
		if(o1.getAnyo()>o2.getAnyo()) {
			return o1.getAnyo();
		}
		return o2.getAnyo();
	}

}
