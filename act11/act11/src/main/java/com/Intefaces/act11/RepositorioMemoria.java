package com.Intefaces.act11;

import java.util.Arrays;

public class RepositorioMemoria <T extends Identificable> implements Repositorio<T>{
private int contador=0;
private Identificable[] Datos = new Identificable[10];

public RepositorioMemoria (Identificable[] datos,int contador) {
	super();
	this.Datos=datos;
	this.contador=contador;
}

@Override
public void add(T item) {
	if (contador == Datos.length) {
		ampliarArray();
	}
	Datos[contador]=item;
	contador++;
}
public void ampliarArray() {
	Identificable[] nuevo = Arrays.copyOf(Datos, Datos.length *2);
	Datos = nuevo;
}

@Override
public T findById(String id) {
	for(int j =0; j<contador;j++) {
		if (id == Datos[j].getId()) {
			return (T)Datos[j];
		}
	}
	return null;
}

@Override
public int size() {
	// TODO Auto-generated method stub
	return contador;
}

@Override
public boolean remove(T item) {
	if (item == null) {
		return false;
	}
	for(int i =0; i<contador;i++) {
		if(Datos[i].getId().equals(item.getId())) {
			for(int j =0; j<contador;j++) {
				Datos[j]=Datos[j+1];
			
			}
			Datos[contador-1]=null;
			contador--;
			}
		}
	
	return true;
}



}
