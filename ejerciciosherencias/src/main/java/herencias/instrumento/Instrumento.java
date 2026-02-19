package herencias.instrumento;

public abstract class Instrumento {
 private final int max=100;
 protected Notas[] melodia = new Notas[max];
 protected int numNotas=0;

public boolean add (Notas n) {
if(this.melodia.length!=numNotas) {
	melodia[numNotas] = n;
	numNotas++;
	return true;
}
return false;
}

public abstract void interpretar();
}
