package es.iescamas.estructura;

public class ListaArray {
protected Integer[] tabla;
protected int numElementos;

public ListaArray() {
	tabla = new Integer[1];
	numElementos=0;
}

public int size() {
	return numElementos;
}

public void addFinal(Integer n) {
	   if (numElementos == tabla.length) {
	        Integer[] nuevaTabla = new Integer[tabla.length +1];
	        for (int i = 0; i < tabla.length; i++) {
	            nuevaTabla[i] = tabla[i];
	        }
	        tabla = nuevaTabla;
	    }
	    tabla[numElementos] = n;
	    numElementos++;
}

public Integer get(int index) {
	return tabla[index];
}

public Integer remove(int index) {
	Integer eliminado = tabla[index];
	for (int i = index; i < numElementos - 1; i++) {
        tabla[i] = tabla[i + 1];
    }
	tabla[numElementos-1]=null;
	numElementos--;
	return eliminado;
}

public int indexOf(Integer n) {
    for (int i = 0; i < numElementos; i++) {
    	if (n.equals(tabla[i])) {
            return i;
        }
    }
    return -1;
}

@Override
public String toString() {
    if (numElementos == 0) return "[]";

    StringBuilder resultado = new StringBuilder("[");
    for (int i = 0; i < numElementos; i++) {
        resultado.append(tabla[i]);
        if (i < numElementos - 1) resultado.append(", ");
    }
    resultado.append("]");
    return resultado.toString();
}
}
