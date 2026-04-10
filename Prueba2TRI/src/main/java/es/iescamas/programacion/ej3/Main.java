package es.iescamas.programacion.ej3;


public class Main {

	public static void main(String[] args) {
		//creo dos matrices y las añado a un array
		int[][]datos={
				{1,2,3},
				{4,1,2},
				{5,2,1}
		};
		int[][]datos2={
			    {1, 2, 3},
			    {4, 1, 2}, 
			    {5, 2, 1}  
			};
		OperableMatriz M1 = new MatrizDatos(datos);
		OperableMatriz MC1 = new MatrizCuadrada(datos2);
		OperableMatriz[] operable = new OperableMatriz[2];
		operable[0]=M1;
		operable[1]=MC1;
		//muestro el array
		for(OperableMatriz oper : operable) { 
			oper.mostrarResultados();
		}
	}

}
