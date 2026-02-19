package herencias.geometríaYcalendario;

public class Calendario {
protected int año;
protected int mes;
protected int dia;

public Calendario(int año,int mes,int dia) {
	if(año <= 0) throw new IllegalArgumentException("el año no puede ser menor a 0");
	if(mes < 1 || mes > 12) throw new IllegalArgumentException("el mes tiene que estar en el rango permitido");
	if((mes ==1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia > 31 || dia < 1))
		throw new IllegalArgumentException("No esta en el rango permitido");
	if((mes == 4 || mes == 6 || mes == 9 || mes == 11 ) && (dia > 30 || dia < 1))
		throw new IllegalArgumentException("No esta en el rango permitido");
	if(mes == 2 && (dia > 28 || dia < 1))throw new IllegalArgumentException("No esta en el rango permitido");
	this.año=año;
	this.mes=mes;
	this.dia=dia;
}

public void IncrementarDia(int cantidad) {
	for(int i =0;i<cantidad;i++) {
		if((mes ==1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia ==31)) {
			IncrementarMes(1);
			dia=1;
		}else if((mes == 4 || mes == 6 || mes == 9 || mes == 11 ) && (dia == 30)){
			IncrementarMes(1);
			dia=1;
		}else if(mes == 2 && (dia == 28)) {
			IncrementarMes(1);
			dia=1;
		}else {
			dia++;
		}
	}
}

public void IncrementarMes(int cantidad) {
	for(int i=0;i<cantidad;i++) {
		if( mes == 12) {
			IncrementarAño(1);
			mes=1;
		}else {
			mes++;
		}
	}
}

public void IncrementarAño(int cantidad) {
	if (cantidad ==0) 
		throw new IllegalArgumentException("la cantidad no puede ser 0");
		
	año+=cantidad;
}

public void mostrar() {
	System.out.println("[ "+dia+" : "+mes+" : "+año+ " ]");
}

public boolean iguales (Calendario otrafecha) {
	return this.dia == otrafecha.dia && this.mes == otrafecha.mes && this.año == otrafecha.año;
}

}
