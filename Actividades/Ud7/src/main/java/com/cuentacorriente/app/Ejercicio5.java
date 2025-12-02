package com.cuentacorriente.app;

import java.util.Scanner;

public class Ejercicio5 {
public static void main (String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("¿a cual banco quieres cambiar?");
String banco=sc.nextLine();
CuentaCorriente.setBanco(banco);
CuentaCorriente cuenta = new CuentaCorriente("david","122213434A");
cuenta.mostrarinfo();

}
}
