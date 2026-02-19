package es.iescamas.estructura;

public class Conjunto extends ConjuntoArray{

	public Conjunto() {
		super();
	}
	
	public int numeroElementos() {
		return super.size();
	}
	
	public boolean insertar(Integer n) {
		return add(n);
	}
	
	public void añadirElementosDE(Conjunto otro) {
			for(int j=0;j<otro.size();j++) {
				add(otro.get(j));
			}
		}
	
	public boolean eliminarElemento(Integer n) {
		return removeValue(n);
	}
	
	public void eliminarTodos(Conjunto otro) {
		for(int j=0;j<otro.size();j++) {
			eliminarElemento(otro.get(j));
		}
	}
	
	public boolean pertenece(Integer n) {
		return contains(n);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public int minimo() {
	int min=get(0);
	for(int i=0;i<size();i++) {
		if(get(i)<min) {
			min=get(i);
		}
	}	
		return min;
	}
	
	public int maximo() {
		int max=get(0);
		for(int i=0;i<size();i++) {
			if(get(i)>max) {
				max=get(i);
			}
		}	
			return max;
		}
	
	public double media() {
		double media=0;
		for(int i=0;i<size();i++) {
				media+=get(i);
		}	
		media = media/size();
			return media;
		}
	
	public static boolean incluido(Conjunto c1,Conjunto c2) {
		if(c1.size()==0)
		return true;
		
		for(int i=0;i<c1.size();i++) {
			if(!c2.contains(c1.get(i))) {
				return false;
			}
		}	
		
		
		return true;
	}
	public static Conjunto union(Conjunto c1,Conjunto c2) {
		Conjunto c3 = new Conjunto();
		c3.añadirElementosDE(c1);
		c3.añadirElementosDE(c2);
	return c3;
	}
	
	public static Conjunto interseccion(Conjunto c1,Conjunto c2) {
		Conjunto c3 = new Conjunto();
		for(int i=0;i<c1.size();i++) {
			if(c2.contains(c1.get(i))) {
				c3.add(c1.get(i));
			}
		}
	return c3;
	}
	
	public static Conjunto diferencia(Conjunto c1,Conjunto c2) {
		Conjunto c3 = new Conjunto();
		for(int i=0;i<c1.size();i++) {
			if(!c2.contains(c1.get(i))) {
				c3.add(c1.get(i));
			}
		}
	return c3;
	}
	
}
