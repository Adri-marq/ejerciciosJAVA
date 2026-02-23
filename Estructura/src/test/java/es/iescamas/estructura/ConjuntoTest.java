package es.iescamas.estructura;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConjuntoTest {

    private Conjunto conjunto;
    private Conjunto otroConjunto;

    @BeforeEach
    void setUp() {
        conjunto = new Conjunto();
        otroConjunto = new Conjunto();
    }

    @Test
    void testInsertarYNumeroElementos() {
        conjunto.insertar(5);
        conjunto.insertar(10);
        assertEquals(2, conjunto.numeroElementos());

        conjunto.insertar(5);
        assertEquals(2, conjunto.numeroElementos());
    }

    @Test
    void testPertenece() {
        conjunto.insertar(1);
        conjunto.insertar(2);
        assertTrue(conjunto.pertenece(1));
        assertFalse(conjunto.pertenece(3));
    }

    @Test
    void testEliminarElemento() {
        conjunto.insertar(7);
        conjunto.insertar(8);

        assertTrue(conjunto.eliminarElemento(7));
        assertFalse(conjunto.pertenece(7));
        assertEquals(1, conjunto.numeroElementos());

        assertFalse(conjunto.eliminarElemento(100));
    }

    @Test
    void testAñadirElementosDE() {
        conjunto.insertar(1);
        conjunto.insertar(2);

        otroConjunto.insertar(2);
        otroConjunto.insertar(3);

        conjunto.añadirElementosDE(otroConjunto);

        assertEquals(3, conjunto.numeroElementos());
        assertTrue(conjunto.pertenece(1));
        assertTrue(conjunto.pertenece(2));
        assertTrue(conjunto.pertenece(3));
    }

    @Test
    void testEliminarTodos() {
        conjunto.insertar(1);
        conjunto.insertar(2);
        conjunto.insertar(3);

        otroConjunto.insertar(2);
        otroConjunto.insertar(3);

        conjunto.eliminarTodos(otroConjunto);

        assertEquals(1, conjunto.numeroElementos());
        assertTrue(conjunto.pertenece(1));
        assertFalse(conjunto.pertenece(2));
        assertFalse(conjunto.pertenece(3));
        System.out.println(conjunto.toString());
    }

    @Test
    void testToString() {
        conjunto.insertar(10);
        conjunto.insertar(20);

        String s = conjunto.toString();
        assertNotNull(s);
        assertTrue(s.contains("10") || s.contains("20"));
        System.out.println(s);
    }
    @Test
    void testMinimo() {
        conjunto.insertar(5);
        conjunto.insertar(2);
        conjunto.insertar(9);
        assertEquals(2, conjunto.minimo());
        conjunto.insertar(1);
        assertEquals(1, conjunto.minimo());
    }
    
    @Test
    void testMinimoConjuntoVacio() {
    	String mensajeEsperado="Conjunto vacio";
    	NoSuchElementException ex = 
    	assertThrows(NoSuchElementException.class, ()-> conjunto.minimo());
    	String mensaje = ex.getMessage().toString();
    	assertEquals(mensajeEsperado,mensaje);
    }

    @Test
    void testMaximo() {
        conjunto.insertar(-5);
        conjunto.insertar(2);
        conjunto.insertar(9);
        assertEquals(9, conjunto.maximo());
        conjunto.insertar(15);
        assertEquals(15, conjunto.maximo());
    }
    @Test
    void testMaximoConjuntoVacio() {
    	String mensajeEsperado="Conjunto vacio";
    	NoSuchElementException ex = 
    	assertThrows(NoSuchElementException.class, ()-> conjunto.maximo());
    	String mensaje = ex.getMessage().toString();
    	assertEquals(mensajeEsperado,mensaje);
    }

    @Test		
    void testMedia() {
        conjunto.insertar(2);
        conjunto.insertar(4);
        conjunto.insertar(6);
        assertEquals(4.0, conjunto.media());
        conjunto.insertar(8);
        assertEquals(5.0, conjunto.media());
    }
    @Test
    void testMediaConjuntoVacio() {
    	String mensajeEsperado="Conjunto vacio";
    	NoSuchElementException ex = 
    	assertThrows(NoSuchElementException.class, ()-> conjunto.media());
    	String mensaje = ex.getMessage().toString();
    	assertEquals(mensajeEsperado,mensaje);
    }

    @Test
    void testIncluido() {
        conjunto.insertar(1);
        conjunto.insertar(2);
        otroConjunto.insertar(1);
        otroConjunto.insertar(2);
        otroConjunto.insertar(3);
        assertTrue(Conjunto.incluido(conjunto, otroConjunto));
        assertFalse(Conjunto.incluido(otroConjunto, conjunto));
        Conjunto vacio = new Conjunto();
        assertTrue(Conjunto.incluido(vacio, conjunto));
    }

    @Test
    void testUnion() {
        conjunto.insertar(1);
        conjunto.insertar(2);
        otroConjunto.insertar(2);
        otroConjunto.insertar(3);
        Conjunto u = Conjunto.union(conjunto, otroConjunto);
        assertEquals(3, u.numeroElementos());
        assertTrue(u.pertenece(1));
        assertTrue(u.pertenece(2));
        assertTrue(u.pertenece(3));
    }

    @Test
    void testInterseccion() {
        conjunto.insertar(1);
        conjunto.insertar(2);
        conjunto.insertar(3);
        otroConjunto.insertar(2);
        otroConjunto.insertar(3);
        otroConjunto.insertar(4);
        Conjunto inter = Conjunto.interseccion(conjunto, otroConjunto);
        assertEquals(2, inter.numeroElementos());
        assertTrue(inter.pertenece(2));
        assertTrue(inter.pertenece(3));
        assertFalse(inter.pertenece(1));
        assertFalse(inter.pertenece(4));
    }

    @Test
    void testDiferencia() {
        conjunto.insertar(1);
        conjunto.insertar(2);
        conjunto.insertar(3);
        otroConjunto.insertar(2);
        otroConjunto.insertar(4);
        Conjunto diferente = Conjunto.diferencia(conjunto, otroConjunto);
        assertEquals(2, diferente.numeroElementos());
        assertTrue(diferente.pertenece(1));
        assertTrue(diferente.pertenece(3));
        assertFalse(diferente.pertenece(2));
        assertFalse(diferente.pertenece(4));
    }

}
