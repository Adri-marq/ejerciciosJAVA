package herencias.instrumento;

public class Piano extends Instrumento {
	public void interpretar() {
			System.out.println("piano:");
			for(int i=0;i < super.melodia.length;i++ ) {
				if(super.melodia[i]!=null) {
					System.out.println(super.melodia[i]);
				}
			}
	}
	
	
}
