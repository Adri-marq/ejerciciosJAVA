package es.iescamas.act7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Act7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contadorLineas=0;
		try(BufferedReader reader = new BufferedReader(new FileReader("more.txt"))){
			String linea;
			while ((linea = reader.readLine()) != null) {
				contadorLineas++;
				System.out.println(linea);
				if(contadorLineas==24) {
				contadorLineas=0;
				System.out.println("¿Quieres seguir leyendo? si/no");
				String opt= sc.next();
				if(opt.equals("no")) {
					break;
				}else if (!opt.equals("si")) {
					System.out.println("Error");
					break;
				}
				}
			}
			}catch(Exception x) {
				System.out.println("Error al leer el archivo: " + x.getMessage());
			}

	}

}
