package org.mvpigs.Cotxots;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mvpigs.Cotxots.carrera.Carrera;

public class TestCarrera {
	
	private Carrera carrera = null;
	
	@Before
	public void setUp(){
		String tarjetaCredito = "4916119711304546";
		String origen = "Aeroport Son Sant Joan";
		String destino = "Magaluf";
		double distancia = 7.75;
		int tiempoEsperadoMinutos = 10;
		carrera = new Carrera(tarjetaCredito);
		carrera.setOrigen(origen);
		carrera.setDestino(destino);
		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(tiempoEsperadoMinutos);
	}

	@Test
	public void testCarrera() {
		Assert.assertEquals("4916119711304546",carrera.getTarjetaCredito());
		
	}

	@Test
	public void testGetOrigen() {
		
		Assert.assertEquals("Aeroport Son Sant Joan",carrera.getOrigen());
		
	}

	@Test
	public void testGetDestino() {

		Assert.assertEquals("Magaluf",carrera.getDestino());
	}

	@Test
	public void testGetDistancia() {

		Assert.assertEquals(7.75,carrera.getDistancia(),0.1);
	}

	@Test
	public void testGetTiempoEsperado() {

		Assert.assertEquals(10, carrera.getTiempoEsperado());
	}


	@Test
	public void testGetCosteEsperado() {
		
	    Assert.assertEquals(13.9625,carrera.getCosteEsperado(),0.01);
	}

	@Test
	public void testAsignarConductor() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetConductor() {
		fail("Not yet implemented");
	}

	@Test
	public void testRealizarPago() {
		fail("Not yet implemented");
	}

	@Test
	public void testRecibirPropina() {
		fail("Not yet implemented");
	}

	@Test
	public void testLiberarConductor() {
		fail("Not yet implemented");
	}

}
