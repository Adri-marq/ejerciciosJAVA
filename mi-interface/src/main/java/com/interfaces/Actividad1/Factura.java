package com.interfaces.Actividad1;

public class Factura implements Imprimible{
 private int id;
 private String cliente;
 private int importe;
 
 
 public Factura(int id,String cliente, int importe) {
	 this.id=id;
	 this.cliente=cliente;
	 this.importe=importe;
 }
 
 @Override
 public String imprimir() {
	return "id: "+id+" Cliente: "+cliente+" importe: "+importe;
	 
 }
}
