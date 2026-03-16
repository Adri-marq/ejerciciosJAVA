package com.interfaces.Actividad11;

public class RepositorioMemoria <T extends Identificable> implements Repositorio{
private int contador=0;
private Identificable[] Datos = new Identificable[10];

@Override
public void add(Object item) {
	// TODO Auto-generated method stub
	
}
@Override
public boolean remove(Object item) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public Object findById(String id) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public int size() {
	// TODO Auto-generated method stub
	return Datos.length;
};


}
