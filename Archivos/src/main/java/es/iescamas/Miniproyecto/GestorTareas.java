package es.iescamas.Miniproyecto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import es.iescamas.Ejemplos3.Tareas;

public class GestorTareas {
	private static final String nombre_archivo = "Tareas.txt";
	private static final int capacidad_maxima = 100;
	private static final Tareas[] tareas = new Tareas[capacidad_maxima];
    private static int totalTareas = 0;
    
	public static void main(String[] args) { 
		  Scanner sc = new Scanner(System.in);
		  cargarTareas();
		  
		  int opcion;
		  do {
			  System.out.println("\n=== MENÚ DE TAREAS ===");
	            System.out.println("1. Añadir tarea");
	            System.out.println("2. Mostrar tareas");
	            System.out.println("3. Guardar tareas");
	            System.out.println("0. Salir");
	            System.out.print("Elige una opción: ");
	            opcion = Integer.parseInt(sc.nextLine());

			switch(opcion) {
			case 1:
				anadirTareas(sc);
				break;
			case 2:
				mostrarTareas();
				break;
			case 3:
				guardarTareas();
				break;
			case 0:
				guardarTareas();
				System.out.println("saliendo");
				break;
			default:
				System.out.println("opcion invalida");
				
			}
			
		  }while (opcion != 0);
		sc.close();
	}
	private static void anadirTareas(Scanner sc) {
		if (totalTareas >= capacidad_maxima) {
			System.out.println("no se pueden agregar mas");
			return;
		}
		
		System.out.println("Id: ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Titulo: ");
		String titulo = sc.nextLine();
		
		System.out.println("Modulo: ");
		String modulo = sc.nextLine();
		
		System.out.println("estado: ");
		String estado = sc.nextLine();
		
		tareas[totalTareas] = new Tareas(id, titulo, modulo, estado);
        totalTareas++;
        System.out.println("Tarea añadida correctamente");
   
	}
	
	private static void mostrarTareas() {
		if (totalTareas ==0) {
			System.out.println("No hay tareas para mostar");
			return;
		}
		for (int i = 0; i < totalTareas; i++) {
            System.out.println(tareas[i].toLinea());
        }
	}
	
	private static void guardarTareas() {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("Tareas.txt"))) {
			for (int i = 0; i < totalTareas; i++) {
	            writer.write(tareas[i].toLinea());
	            writer.newLine();
	        }
			System.out.println("Tareas guardadas");
		} catch (IOException e) {
			System.out.println("Error al guardar: "+ e.getMessage());
		}
		
	}
	 private static void cargarTareas() {
	        File archivo = new File(nombre_archivo);

	        if (!archivo.exists()) {
	            System.out.println("No existe archivo previo. Se iniciará vacío.");
	            return;
	        }

	        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
	            String linea;
	            while ((linea = reader.readLine()) != null && totalTareas < capacidad_maxima) {
	                String[] partes = linea.split(";");
	                int id = Integer.parseInt(partes[0]);
	                String titulo = partes[1];
	                String modulo = partes[2];
	                String estado = partes[3];

	                tareas[totalTareas] = new Tareas(id, titulo, modulo, estado);
	                totalTareas++;
	            }
	        } catch (IOException e) {
	            System.out.println("Error al cargar tareas: " + e.getMessage());
	        }
	    }
	
	
}
