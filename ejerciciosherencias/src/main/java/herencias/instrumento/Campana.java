package herencias.instrumento;

public class Campana extends Instrumento {
	public void interpretar() {
		System.out.println("campana:");
		for(int i=0;i < super.melodia.length;i++ ) {
			if(super.melodia[i]!=null) {
				System.out.println(super.melodia[i]);
			}
		}
}
}
