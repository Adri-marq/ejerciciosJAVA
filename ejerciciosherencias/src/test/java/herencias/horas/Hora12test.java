package herencias.horas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Hora12test {
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
	hora = new Hora12(1,5,periodo.AM);
	hora2 = new Hora12(11,59,periodo.AM);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Prueba string")
	void Textostring() {
		String horaEsperada = "01:05 AM";
		String horaActual = hora.toString();
		assertEquals(horaEsperada, horaActual ,"la hora tienen que ser igual");
	}
	
	@Test
	@DisplayName("Prueba Incremento")
	void pruebaIncremento() {
		hora.inc();
		String horaEsperada = "01:06 AM";
		String horaActual = hora.toString();;
		assertEquals(horaEsperada, horaActual ,"la hora tienen que ser igual");
	}
	@Test
	@DisplayName("Prueba Incremento_vuelta")
	void pruebaIncremento_vuelta() {
		hora2.inc();
		String horaEsperada = "12:00 PM";
		String horaActual = hora2.toString();;
		assertEquals(horaEsperada, horaActual ,"la hora tienen que ser igual");
	}
	

}
