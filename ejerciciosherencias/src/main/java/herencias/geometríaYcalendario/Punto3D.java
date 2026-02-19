package herencias.geometríaYcalendario;

public class Punto3D extends Punto{
private double z;
	public Punto3D(double x, double y, double z) {
		super(x,y);
		this.z=z;
	}

	public void desplaza(double dx,double dy, double dz) {
		x +=dx;
		y +=dy;
		z +=dz;
	}
	public double distanciaEuclidea(Punto3D otro) {
		double result;
		result =Math.sqrt(Math.pow(this.x - otro.x, 2) + Math.pow(this.y - otro.y, 2)+ Math.pow(this.z - otro.z, 2));
		
		return result;
	}
	public void muestra() {
		System.out.println("x es " + this.x + ", y es " + this.y + "y z es " + this.z);
	}
}
