package es.iescamas.estructura;

public class ColaArray extends ListaArray{

public ColaArray() {
	super();
	tabla = new Integer[0];
}


public void enqueue(Integer n) {
	addFinal(n);
}

public Integer dequeue() {
	Integer eliminado = tabla[0];
	for (int i = 0; i < numElementos - 1; i++) {
        tabla[i] = tabla[i + 1];
    }
	tabla[numElementos-1]=null;
	numElementos--;
	return eliminado;
}

public Integer first() {
	 if (numElementos == 0) {
		 return null;
	 }
	return tabla[0];
}

public boolean IsEmpty() {
	
if(numElementos==0) {
       return true;
        }
    
	return false;
}
}
