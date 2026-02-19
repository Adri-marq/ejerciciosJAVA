package es.iescamas.estructura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListaArrayTest {

    private ListaArray lista;

    @BeforeEach
    void setUp() {
        lista = new ListaArray();
    }

    @Test
    void testConstructorVacio() {
        assertEquals(0, lista.size(), "La lista debería empezar vacía");
        assertEquals("[]", lista.toString(), "toString de lista vacía");
    }

    @Test
    void testAddFinal() {
        lista.addFinal(10);
        lista.addFinal(20);

        assertEquals(2, lista.size());
        assertEquals(10, lista.get(0));
        assertEquals(20, lista.get(1));
    }

    @Test
    void testGet() {
        lista.addFinal(5);
        lista.addFinal(15);

        assertEquals(5, lista.get(0));
        assertEquals(15, lista.get(1));
    }

    @Test
    void testRemove() {
        lista.addFinal(1);
        lista.addFinal(2);
        lista.addFinal(3);

        Integer eliminado = lista.remove(1);

        assertEquals(2, eliminado, "Elemento eliminado debe ser 2");
        assertEquals(2, lista.size(), "Tamaño tras eliminar debe ser 2");
        assertEquals("[1, 3]", lista.toString());
    }

    @Test
    void testIndexOf() {
        lista.addFinal(7);
        lista.addFinal(8);
        lista.addFinal(9);

        assertEquals(1, lista.indexOf(8), "El índice de 8 debe ser 1");
    }

    @Test
    void testIndexOfNoExistente() {
        lista.addFinal(7);
        lista.addFinal(8);

        assertEquals(-1, lista.indexOf(99), "Elemento no existente devuelve -1");
    }

    @Test
    void testToString() {
        lista.addFinal(1);
        lista.addFinal(2);
        lista.addFinal(3);

        assertEquals("[1, 2, 3]", lista.toString());
    }

    @Test
    void testRemovePrimerElemento() {
        lista.addFinal(10);
        lista.addFinal(20);

        lista.remove(0);

        assertEquals("[20]", lista.toString(), "Eliminar el primer elemento");
    }

    @Test
    void testRemoveUltimoElemento() {
        lista.addFinal(10);
        lista.addFinal(20);

        lista.remove(1);

        assertEquals("[10]", lista.toString(), "Eliminar el último elemento");
    }
}