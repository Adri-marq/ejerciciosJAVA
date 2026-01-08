package Ud7;

import java.util.Scanner;

public class CuentaCorriente {
//atributos
private int saldo;
private int limitedesc;
public String nombre;
protected String DNI;
public  static String banco="bankinter";
//contructor
public CuentaCorriente(String nombre, String DNI) {
this.nombre=nombre;
this.DNI=DNI;
saldo=0;
limitedesc=50;

}

public CuentaCorriente(int saldoini) {
this.nombre="";
this.DNI="";
saldo=saldoini;
limitedesc=0;
}
public CuentaCorriente(String DNI,int saldoini,int limit) {
this.nombre="";
this.DNI=DNI;
saldo=saldoini;
limitedesc=limit;
}
//metodos
public void sacardinero(int dinero) {
	if(dinero>0) {
	if(dinero<=(saldo+limitedesc)) {
	if(dinero<=saldo) {
		saldo=saldo-dinero;
	}else {
		limitedesc= saldo+limitedesc-dinero;
		System.out.println("listo, gracias por esperar");
	}
	}else {
		System.out.println("no ha sido posible sacar dinero");
	}
	}else {
	System.out.println("salir");
	}
}

public void ingresardinero(int dinero) {
	saldo=saldo+dinero;
}
public void mostrarinfo() {
System.out.println("nombre: "+ nombre);
System.out.println("DNI: "+ DNI);
System.out.println("saldo: "+ saldo);
System.out.println("limite de descubierto: "+ limitedesc);
System.out.println("banco: "+ banco);
}

public void nombrebanco() {
	Scanner sc=new Scanner(System.in);
	System.out.println("¿a cual banco quieres cambiar?");
	String banco=sc.nextLine();
	setBanco(banco);
}
//getters and setters
public int getSaldo() {
	return saldo;
}
public void setSaldo(int saldo) {
	this.saldo = saldo;
}
public int getLimitedesc() {
	return limitedesc;
}
public void setLimitedesc(int limitedesc) {
	this.limitedesc = limitedesc;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDNI() {
	return DNI;
}
public void setDNI(String dNI) {
	DNI = dNI;
}

public static String getBanco() {
	return banco;
}

public static void setBanco(String banco) {
	CuentaCorriente.banco = banco;
}


}


