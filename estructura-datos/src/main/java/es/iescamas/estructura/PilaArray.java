package es.iescamas.estructura;

public class PilaArray extends ListaArray {

public PilaArray() {
		super();
	}
	
public void push(Integer n) {
		addFinal(n);
}

public Integer pop() {
	Integer ult=tabla[numElementos-1];
	Integer[] copia = new Integer[numElementos-1];
	for (int i = 0; i < copia.length; i++) {
        copia[i] = tabla[i];
    }
	tabla=copia;
	numElementos--;
	return ult;
}
public Integer peak() {
	return tabla[numElementos-1];
}

public boolean IsEmpty() {
	
if(numElementos==0) {
       return true;
        }
    
	return false;
}
	
}

