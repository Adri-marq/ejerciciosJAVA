package com.interfaces.Actividad9;

public class Reproductor {
private Reproducible reproducible;

public Reproductor (Reproducible reproducible) {
	this.reproducible=reproducible;
}

public void ReproducirPlay() {
	reproducible.play();
	
}

public void ReproducirStop() {
	reproducible.stop();
}

public void ReproducirPause() {
	reproducible.pause();
}
public void cambiarReproducible(Reproducible reproducible) {
	this.reproducible=reproducible;
}
}
