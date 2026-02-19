package es.iescamas.estructura;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ListaArray lista = new ListaArray();
        
        lista.addFinal(4);
        lista.addFinal(5);
        lista.addFinal(6);
        System.out.println(lista.toString());
        
        System.out.println(lista.get(2));
        lista.indexOf(0);
        
        lista.remove(2);
        System.out.println(lista.toString());
        
        lista.size();
        lista.toString();
    
    PilaArray pila = new PilaArray();
    	pila.push(2);
    	System.out.println(pila.toString());
    	
    	pila.push(4);
    	pila.push(6);
    	pila.pop();
    	System.out.println(pila.toString());
    
    	System.out.println(pila.peak());
    	System.out.println(pila.IsEmpty());
    	
    ColaArray cola = new ColaArray();
    	cola.enqueue(3);
    	cola.enqueue(6);
    	cola.enqueue(9);
    	System.out.println(cola.toString());
    	
    	cola.dequeue();
    
    	System.out.println(cola.toString());
    	
    	System.out.println(cola.first());
    	System.out.println(cola.IsEmpty());
    	
    	
    }
}
