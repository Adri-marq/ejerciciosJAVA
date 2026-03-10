package com.interfaces.Actividad9;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reproducible[] repro = new Reproducible [4];
		
		Reproducible can1 = new Cancion("Sukuna rey de las maldiciones","Miki.martz",3);
		Reproducible can2 = new Cancion("feliz 50 plutonianos","Pluton764",3);
		Reproducible pod1 = new Podcast("la tierra es plana","theWildProyect",3);
		Reproducible pod2 = new Podcast("los 5 cerditos","teoriasAntonio",3);

		repro[0]= can1;
		repro[1]= can2;
		repro[2]= pod1;
		repro[3]= pod2;
		
		Reproductor reproductor = new Reproductor(null);
		
		for(Reproducible rep : repro) {
		reproductor.cambiarReproducible(rep);
		reproductor.ReproducirPlay();
		System.out.println(((Mostrable)rep).mostrar());
		reproductor.ReproducirPause();
		System.out.println(((Mostrable)rep).mostrar());
		reproductor.ReproducirStop();
		System.out.println(((Mostrable)rep).mostrar());
		}
	}
}
