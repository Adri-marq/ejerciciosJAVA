package es.iescamas.Ejemplos4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import es.iescamas.Ejemplos3.Tareas;



public class LeerTareas {

	public static void main(String[] args) {
		 try (BufferedReader reader = new BufferedReader(new FileReader("Tareas.txt"))) {
			String linea;
			while ((linea = reader.readLine()) != null) {
			 String[] partes = linea.split(";");
			int id = Integer.parseInt(partes[0]);
			String titulo = partes[1];
			String modulo = partes[2];
			String estado = partes[3];
			
			Tareas t1= new Tareas(id,titulo, modulo,estado);
			 System.out.println("ID: " + t1.getId());
             System.out.println("Título: " + t1.getTitulo());
             System.out.println("Módulo: " + t1.getModulo());
             System.out.println("Estado: " + t1.getEstado());
             System.out.println("--------------------------");
         
			}
			 
		 } catch (IOException e) {
			 System.out.println("Error al leer tareas: " + e.getMessage()); 
		 }

	}

}
