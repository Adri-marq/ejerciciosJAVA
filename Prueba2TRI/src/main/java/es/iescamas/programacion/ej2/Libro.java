package es.iescamas.programacion.ej2;

public class Libro implements Catalogable{
private String titulo;
private String autor;
private int anyo;
private double precio;
//constructor
public Libro (String titulo, String autor, int anyo, double precio) {
	this.titulo=titulo;
	this.autor=autor;
	this.anyo=anyo;
	this.precio=precio;
}

public String mostrarFicha() {
	return "[" + anyo + "] " + titulo + " - "+ autor + " (" + precio + " €)";
}
//getters y setters
public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getAutor() {
	return autor;
}

public void setAutor(String autor) {
	this.autor = autor;
}

public int getAnyo() {
	return anyo;
}

public void setAnyo(int anyo) {
	this.anyo = anyo;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}
//metodos
@Override
public String getCodigo() {
	return "LIB-"+anyo+"-"+titulo.charAt(0)+titulo.charAt(1)+titulo.charAt(2);
}

@Override
public void mostrarEnCatalogo() {
	System.out.println(mostrarFicha()+" "+getCodigo());
	
}

}
