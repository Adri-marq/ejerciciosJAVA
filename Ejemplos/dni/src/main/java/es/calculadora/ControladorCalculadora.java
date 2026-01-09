package es.calculadora;

public class ControladorCalculadora {
//atributos
private int num1;
private int num2;

//constructor
public ControladorCalculadora (int numero1,int numero2) {
this.num1 = numero1;
this.num2 = numero2;
}
//metodos

public int sumar() {
int resultado;
resultado= num1 + num2;
return resultado;
}

public int restar() {
int resultado;
resultado= num1 - num2;
return resultado;
}

public int multiplicar() {
int resultado;
resultado= num1 * num2;
return resultado;
}

public double dividir() {
double resultado;
try {
resultado= num1 / num2;
return resultado;
}catch(Exception ex) {
throw new IllegalArgumentException("no es posible dividir con 0");
}
}


}
