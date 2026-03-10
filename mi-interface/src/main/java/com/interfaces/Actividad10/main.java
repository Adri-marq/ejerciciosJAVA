package com.interfaces.Actividad10;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Becario es = new Becario("pablo");
		Becario tr =new Becario("kiwi");
		
		System.out.println(es.mostrar());
		es.estudiar();
		System.out.println(tr.mostrar());
		tr.trabajar();
		
		
	}
}
