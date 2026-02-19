package es.iescamas.estructura;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ColaArrayTest {

    private ColaArray cola;

    @BeforeEach
    void setUp() {
        cola = new ColaArray();
    }

    @Test
    void testIsEmptyInicial() {
        assertTrue(cola.IsEmpty(), "La cola debe empezar vacía");
    }

    @Test
    void testEnqueueYIsEmpty() {
        cola.enqueue(10);
        assertFalse(cola.IsEmpty(), "La cola no debe estar vacía tras enqueue");
        cola.enqueue(20);
        assertEquals(2, cola.numElementos, "Debe haber 2 elementos en la cola");
    }

    @Test
    void testFirst() {
        assertNull(cola.first(), "first en cola vacía debe ser null");

        cola.enqueue(5);
        cola.enqueue(15);

        assertEquals(5, cola.first(), "first debe devolver el primer elemento");
        assertEquals(2, cola.numElementos, "first no debe modificar el tamaño");
    }

    @Test
    void testDequeue() {
        cola.enqueue(1);
        cola.enqueue(2);
        cola.enqueue(3);

        Integer eliminado = cola.dequeue();

        assertEquals(1, eliminado, "dequeue debe devolver el primer elemento");
        assertEquals(2, cola.numElementos, "dequeue debe reducir el tamaño en 1");
        assertEquals(2, cola.first(), "first después de dequeue debe devolver el nuevo primer elemento");
    }

    @Test
    void testDequeueHastaVacia() {
        cola.enqueue(100);
        cola.enqueue(200);

        assertEquals(100, cola.dequeue());
        assertEquals(200, cola.dequeue());
        assertTrue(cola.IsEmpty(), "La cola debe estar vacía después de dequeue de todos los elementos");
    }

    @Test
    void testDequeueEnColaVacia() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> cola.dequeue(), "dequeue en cola vacía debe lanzar excepción");
    }

    @Test
    void testCrecimientoAutomatico() {
        cola.enqueue(1);
        cola.enqueue(2);
        cola.enqueue(3);

        assertEquals(3, cola.numElementos, "Después de varios enqueue la cola debe crecer correctamente");
        assertEquals("[1, 2, 3]", cola.toString(), "toString debe reflejar los elementos correctamente");
    }
}

