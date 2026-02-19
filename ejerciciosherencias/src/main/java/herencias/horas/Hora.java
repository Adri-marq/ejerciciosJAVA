package herencias.horas;

public class Hora {
protected int hora;
protected int minuto;


public Hora(int hora, int minuto) {
 this.hora=hora;
 this.minuto=minuto;

}

public void inc() {
minuto++;
if(minuto >=60) {
	hora++;
	minuto=0;
}

if(hora >=24) {
	hora=0;
}
}

public boolean setHora(int hora) {
	if(hora > 23 || hora < 0) {
		return false;
	}else if (hora == 24) {
		this.hora=0;
	return true;
	}
	this.hora=hora;
	return true;
}

public boolean setMinuto(int minuto) {
	if(minuto > 59 || minuto < 0) {
		return false;
	}else if (minuto == 60) {
		hora++;
		this.minuto=0;
	return true;
	}
	this.minuto=minuto;
	return true;
}



public String toString() {
	
	return String.format("%02d:%02d", hora,minuto);
}


}
