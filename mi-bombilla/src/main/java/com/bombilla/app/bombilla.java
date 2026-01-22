package com.bombilla.app;

public class bombilla {
//aatributo
private boolean bombilla;
private boolean fusible;

//constructor

public bombilla() {
	this.bombilla=false;
}

//metodo

public boolean encenderbombilla() {
if(fusible = true) {
	bombilla=true;
	return bombilla;
}
bombilla = false;
return bombilla;
}
public boolean apagarbombilla() {
bombilla = false;
return bombilla;
}

public boolean encenderfusible() {
fusible = true;
return fusible;
}

public boolean apagarfusible() {
fusible = false;
return fusible;
}
public void estado() {
	System.out.println("bombilla: " + bombilla);
	System.out.println("fusible: " + fusible);
}
}
