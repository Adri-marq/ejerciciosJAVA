package herencias.horas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Horatest {
private Hora hora;
private Hora hora2;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	hora = new Hora(10,5);
	hora2 = new Hora(23,59);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Prueba string")
	void Textostring() {
		String horaEsperada = "10:05";
		String horaActual = hora.toString();
		assertEquals(horaEsperada, horaActual ,"la hora tienen que ser igual");
	}
	/*
	@Test
	@DisplayName("Prueba rangos")
	void setHora_validaRango_0_23() {
		assertFalse(hora.setHora(-1));
		assertFalse(hora.setHora(24));
		assertFalse(hora.setHora(00));
		assertFalse(hora.setHora(23));
	}
	*/
	@Test
	@DisplayName("Prueba Incremento")
	void pruebaIncremento() {
		hora.inc();
		String horaEsperada = "10:06";
		String horaActual = hora.toString();;
		assertEquals(horaEsperada, horaActual ,"la hora tienen que ser igual");
	}
	@Test
	@DisplayName("Prueba Incremento")
	void pruebaIncremento_vuelta() {
		hora2.inc();
		String horaEsperada = "00:00";
		String horaActual = hora2.toString();;
		assertEquals(horaEsperada, horaActual ,"la hora tienen que ser igual");
	}
	

}
