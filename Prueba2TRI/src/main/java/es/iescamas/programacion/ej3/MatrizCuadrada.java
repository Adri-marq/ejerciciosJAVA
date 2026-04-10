package es.iescamas.programacion.ej3;

public class MatrizCuadrada extends MatrizDatos{

	public MatrizCuadrada(int[][] datos) {
		super(datos);
	}

	@Override
	public void mostrarResultados() {
		for(int i =0;i<getDatos().length;i++) {
			for(int j =0;j<getDatos()[i].length;j++) {
				System.out.print(getDatos()[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Matriz cuadrada: "+ getDatos().length + " x "+ getDatos()[0].length);
		System.out.println("---------------------------------------");
	}
}
