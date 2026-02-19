package herencias.geometríaYcalendario;

public class CalendarioExacto extends Calendario{
private int hora;
private int minuto;


	public CalendarioExacto(int año, int mes, int dia, int hora, int minuto) {
		super(año, mes, dia);
		if(hora > 24 || hora < 1)throw new IllegalArgumentException("No esta en el rango permitido");
		if(minuto > 24 || minuto < 0)throw new IllegalArgumentException("No esta en el rango permitido");
		this.hora=hora;
		this.minuto=minuto;
	}

	public void IncrementarHora(int cantidad) {
		for(int i=0;i<cantidad;i++) {
			if( hora == 23 && minuto == 60) {
				IncrementarDia(1);
				hora=1;
			}else {
				mes++;
			}
		}
	}
}
