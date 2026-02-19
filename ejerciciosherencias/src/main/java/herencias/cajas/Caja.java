package herencias.cajas;

public class Caja {
protected final int ancho;
protected final int alto;
protected final int fondo;
protected final Unidades u;
protected final String direccion;
protected final String destinatario;
protected final String emisor;
protected final boolean fragil;


public Caja(int ancho,int alto,int fondo,Unidades u,String direccion,String destinatario,String emisor,boolean fragil) {
	this.ancho=ancho;
	this.alto=alto;
	this.fondo=fondo;
	this.u=u;
	this.direccion=direccion;
	this.destinatario=destinatario;
	this.emisor=emisor;
	this.fragil=fragil;
}

public double getVolumen() {
	double volumen;
	if(u==Unidades.cm) {
		volumen=(ancho*alto*fondo)/1000000;
	}else {
		volumen=(ancho*alto*fondo);
	}
	return volumen;
}

public String toString() {
	return "La caja tiene "+ancho+u+" de ancho, "+alto+u+" de alto y "+fondo+u+" de fondo \n"
			+ "Datos: cliente: "+emisor+" direccion: "+direccion+" destinatario: "+destinatario+" fragil: "+fragil;
}

}
