package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Empleado;
import pkg.Empleado.TipoEmpleado;

class EmpleadoTest {

	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalculoNominaBrutaTipoEmpleadoVendedor() {
		float expected = 2500;
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1500, 10);
		assertEquals(expected,actual);
	}
	
	@Test
	void testCalculoNominaBrutaTipoEmpleadoEncargado() {
		float expected = 3000;
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1500, 10);
		assertEquals(expected,actual);
	}
	
	@Test
	void testCalculoNominaBrutaTipoEmpleadoOtro() {
		float expected = 0;
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Otro, 1500, 10);
		assertEquals(expected,actual);
	}
	
	@Test
	void testCalculoNominaBrutaVentasNegativas() {
		float expected = 0;
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, -1, 10);
		assertEquals(expected,actual);
	}
	
	@Test
	void testCalculoNominaBrutaVentasMenosDe1000() {
		float expected = 2300;
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 500, 10);
		assertEquals(expected,actual);
	}
	
	@Test
	void testCalculoNominaBrutaVentasMasDeM1000() {
		float expected = 2400;
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1200, 10);
		assertEquals(expected,actual);
	}
	
	@Test
	void testCalculoNominaBrutaVentasMasDe1500() {
		float expected = 2500;
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1800, 10);
		assertEquals(expected,actual);
	}
	
	@Test
	void testCalculoNominaBrutaHorasExtrasNegativas() {
		float expected = 0;
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1500, -1);
		assertEquals(expected,actual);
	}
	
	@Test
	void testCalculoNominaBrutaHorasExtrasPositivas() {
		float expected = 2500;
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1500, 10);
		assertEquals(expected,actual);
	}

	@Test
	void testCalculoNominaNetaMasDe2500() {
		float expected = 2460;
		float actual = Empleado.calculoNominaNeta(3000);
		System.out.println("Valor actual: " + actual);
		assertEquals(expected,actual);
	}
	
	@Test
	void testCalculoNominaNetaMasDe2100() {
		float expected = 2040;
		float actual = Empleado.calculoNominaNeta(2400);
		System.out.println("Valor actual: " + actual);
		assertEquals(expected,actual);
	}
	
	@Test
	void testCalculoNominaNetaMenosDe2100() {
		float expected = 1000;
		float actual = Empleado.calculoNominaNeta(1000);
		System.out.println("Valor actual: " + actual);
		assertEquals(expected,actual);
	}
	
	@Test
	void testCalculoNominaNetaNegativa() {
		float expected = 0;
		float actual = Empleado.calculoNominaNeta(-10);
		System.out.println("Valor actual: " + actual);
		assertEquals(expected,actual);
	}

}