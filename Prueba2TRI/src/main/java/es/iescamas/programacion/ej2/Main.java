package es.iescamas.programacion.ej2;


public class Main {

	public static void main(String[] args) {
	//creo un array y meto sus valores
		Catalogable l1 = new Libro("Libro1","autor1",2000,25.5);
		Catalogable lD2 = new LibroDigital("Libro2","autor2",2012,17.0,"EPUB");
		Catalogable[] catalogable = new Catalogable[2];
		catalogable[0]=l1;
		catalogable[1]=lD2;
		//lo muestro
		for(Catalogable catalogo : catalogable) { 
			catalogo.mostrarEnCatalogo();
		}
	}

}
