package herencias.horas;

public class HoraExacta extends Hora {
	protected int segundos;
	
	

	public HoraExacta(int hora, int minuto, int segundos) {
		super(hora,minuto);
		if(segundos < 60 && segundos > 0)
			this.segundos = segundos;
	
	}
	
	public boolean setSegundos(int segundos) {
		if(segundos > 60 || segundos < 0) {
			return false;
		}else if (segundos == 60) {
			super.minuto++;
			this.segundos=0;
			return true;
		}
		this.segundos=segundos;
		return true;
	}
	
	public void inc() {
		segundos++;
		
		if(segundos >=60) {
			super.minuto++;
			segundos=0;
		}
		
		if(super.minuto >=60) {
			super.hora++;
			super.minuto=0;
		}

		if(super.hora >=24) {
			super.hora=0;
		}
		}
	
	public boolean ComparacionHoras (int hora, int minuto, int segundos) {
		if(super.hora==hora) {
			if(super.minuto==minuto) {
				if(this.segundos==segundos) {
					return true;
				}
			}
		}
		return false;
	}
	
	public String toString() {
		
		return String.format("%02d:%02d:%02d", hora,minuto,segundos);
	}

}

