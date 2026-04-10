package es.iescamas.programacion.ej3;

public class MatrizDatos implements OperableMatriz {
private int[][] datos;

public MatrizDatos(int[][] datos) {
	this.datos=datos;
}


public int[][] getDatos() {
return datos;
}

public void setDatos(int[][] datos) {
this.datos = datos;
}

@Override
public int[][] sumar(int[][] otra) {
	if(otra == null || otra.length!=datos.length)
		throw new IllegalArgumentException();
	
	for(int i =0;i<otra.length;i++) {
		for(int j =0;j<otra[i].length;j++) {
			otra[i][j]+=datos[i][j];
		}
	
}
	return otra;
}


@Override
public void mostrarResultados() {
	for(int i =0;i<getDatos().length;i++) {
		for(int j =0;j<getDatos()[i].length;j++) {
			System.out.print(getDatos()[i][j]+"\t");
		}
		System.out.println();
}
System.out.println("---------------------------------------");
}
}
