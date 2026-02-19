package es.iescamas.estructura;

public class ConjuntoArray extends ListaArray {

public ConjuntoArray() {
	super();
}

public boolean add(Integer n) {
if (contains(n)==false) {
	addFinal(n);
	return true;
}
	
	return false;
}

public boolean removeValue(Integer n) {
	if(indexOf(n)!=-1) {
		int index = indexOf(n);
		remove(index);
	return true;
	}
	return false;
}

public boolean contains (Integer n ) {
	return indexOf(n)!=-1;
}


}
