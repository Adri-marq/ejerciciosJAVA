package es.iescamas.Ejemplos3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GuardarTareas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tareas t1= new Tareas(1,"crear formulario", "Programacion","pendiente");
		Tareas t2= new Tareas(2,"leer archivo", "Entornos","hecha");
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("Tareas.txt"))) {
			  writer.write(t1.toLinea());
	            writer.newLine();
	            writer.write(t2.toLinea());
	            writer.newLine();
	            
	            System.out.println("Tareas guardadas correctamente.");  
		} catch (IOException e) {
		    System.out.println("Error al guardar tareas: " + e.getMessage());
		}
	}

}
