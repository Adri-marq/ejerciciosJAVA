package es.iescamas.estructura;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilaArrayTest {

    private PilaArray pila;

    @BeforeEach
    void setUp() {
        pila = new PilaArray();
    }

    @Test
    void testIsEmptyInicial() {
        assertTrue(pila.IsEmpty(), "La pila debe empezar vacía");
    }

    @Test
    void testPushYIsEmpty() {
        pila.push(10);
        assertFalse(pila.IsEmpty(), "La pila no debe estar vacía tras push");
        pila.push(20);
        assertEquals(2, pila.numElementos, "Debe haber 2 elementos en la pila");
    }

    @Test
    void testPeek() {
        pila.push(5);
        pila.push(15);
        assertEquals(15, pila.peak(), "Peek debe devolver el último elemento");
        assertEquals(2, pila.numElementos, "Peek no debe modificar el tamaño");
    }

    @Test
    void testPop() {
        pila.push(1);
        pila.push(2);
        pila.push(3);

        Integer eliminado = pila.pop();
        assertEquals(3, eliminado, "Pop debe devolver el último elemento");
        assertEquals(2, pila.numElementos, "Pop debe reducir el tamaño en 1");
        assertEquals(2, pila.peak(), "Peek después de pop debe devolver el nuevo último elemento");
    }

    @Test
    void testPopHastaVacio() {
        pila.push(100);
        pila.push(200);

        assertEquals(200, pila.pop());
        assertEquals(100, pila.pop());
        assertTrue(pila.IsEmpty(), "Pila debe estar vacía después de hacer pop de todos los elementos");
    }

    @Test
    void testPopEnPilaVacia() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> pila.pop(), "Pop en pila vacía debe lanzar excepción");
    }

    @Test
    void testPeekEnPilaVacia() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> pila.peak(), "Peek en pila vacía debe lanzar excepción");
    }
}
