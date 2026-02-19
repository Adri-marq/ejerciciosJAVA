package es.iescamas.estructura;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConjuntoArrayTest {

    private ConjuntoArray conjunto;

    @BeforeEach
    public void setUp() {
        conjunto = new ConjuntoArray();
    }

    @Test
    public void testAdd() {
        assertTrue(conjunto.add(10), "Debe poder agregar un elemento nuevo");
        assertTrue(conjunto.contains(10), "El elemento agregado debe estar contenido");

        assertFalse(conjunto.add(10), "No debe permitir duplicados");
    }

    @Test
    public void testRemoveValue() {
        conjunto.add(20);
        assertTrue(conjunto.removeValue(20), "Debe eliminar un elemento existente");
        assertFalse(conjunto.contains(20), "El elemento eliminado no debe estar contenido");

        assertFalse(conjunto.removeValue(30), "No debe eliminar elementos que no existen");
    }

    @Test
    public void testContains() {
        conjunto.add(5);
        conjunto.add(15);

        assertTrue(conjunto.contains(5), "Debe contener el elemento 5");
        assertTrue(conjunto.contains(15), "Debe contener el elemento 15");
        assertFalse(conjunto.contains(25), "No debe contener el elemento 25");
    }

    @Test
    public void testMuchosAddsYRemoves() {
        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(3);

        assertTrue(conjunto.removeValue(2));
        assertFalse(conjunto.contains(2));

        assertTrue(conjunto.contains(1));
        assertTrue(conjunto.contains(3));
    }
}

