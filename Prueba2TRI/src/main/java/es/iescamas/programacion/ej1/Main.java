package es.iescamas.programacion.ej1;

public class Main {

	public static void main(String[] args) {
		Libro l1 = new Libro("Libro1","autor1",2000,25.5);
		Libro l2 = new Libro("Libro2","autor2",2012,17.0);

		//mostrar la ficha
		if (l1.getAnyo() > l2.getAnyo()) {
			System.out.println(l1.mostrarFicha());
		} else if (l1.getAnyo() == l2.getAnyo()) {
			System.out.println("Misma edicion");
		}else {
			System.out.println(l2.mostrarFicha());
		}
		
		//mostrar el precio con descuentos
		double result = 0;
		for(int i=1;i<=20;i++) {
		if(i%5==0) {
		result= l1.getPrecio() * (1 - i / 100.0);
		System.out.println("El precio con descuento "+ i+"% es de "+result);
		}
		}
		}

}
