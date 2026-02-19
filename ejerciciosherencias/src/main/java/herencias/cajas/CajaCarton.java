package herencias.cajas;

public class CajaCarton extends Caja{
private final int EtiNum;
	
	public CajaCarton(int ancho, int alto, int fondo, Unidades u, String direccion, String destinatario, String emisor,
			boolean fragil) {
		super(
		        (u == Unidades.cm) ? ancho : ancho * 100,
		        (u == Unidades.cm) ? alto  : alto  * 100,
		        (u == Unidades.cm) ? fondo : fondo * 100,
		        Unidades.cm, 
		        direccion,
		        destinatario,
		        emisor,
		        fragil
		    );
		this.EtiNum = (int)(Math.random()*1000000000);
	}
	
	
	@Override
	public double getVolumen() {
		double volumen;
			volumen=(super.ancho*super.alto*super.fondo);
		
		return volumen;
	}
	
	public double getSuperficie() {
		double superficie;
		superficie=2*(super.ancho * super.alto + super.ancho * super.fondo + super.alto * super.fondo);
	
	return superficie;
	}

}
