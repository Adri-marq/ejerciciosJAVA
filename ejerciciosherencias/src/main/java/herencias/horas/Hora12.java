package herencias.horas;

public class Hora12 extends Hora{
protected periodo periodo;

public Hora12(int hora, int minuto, periodo periodo) {
	 super(hora>12?hora-12:hora,minuto);
	 this.periodo=periodo;
}

@Override
public void inc() {
super.minuto++;
if(super.minuto >59) {
	super.hora++;
	super.minuto=0;
}
if (super.hora == 12 && super.minuto == 0) {
    if (periodo == periodo.AM) {
        periodo = periodo.PM;
    } else {
        periodo = periodo.AM;
    }
}

if (super.hora > 12) {
    super.hora = 1;
}
}

@Override
public String toString() {
	
	return String.format("%02d:%02d ", hora,minuto)+periodo;
}




}

