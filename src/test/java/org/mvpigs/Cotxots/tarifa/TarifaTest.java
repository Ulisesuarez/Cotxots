package org.mvpigs.Cotxots.tarifa;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.mvpigs.Cotxots.carrera.Carrera;
public class TarifaTest

{
    private Carrera carrera;
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
    public void testGetCosteDistancia( ){

        Assert.assertEquals(10.4625,Tarifa.getCosteDistancia(carrera.getDistancia()),0.01);
    }

    @Test
    public void testGetCosteTiempo(){

        Assert.assertEquals(3.5,Tarifa.getCosteMinutos(carrera.getTiempoEsperado()),0.01);
    }
    @Test
    public void testGetCosteTotalEsperado() {

        Assert.assertEquals(13.9625, Tarifa.getCosteTotalEsperado(carrera), 0.01);
    }
}/*getCosteDistancia(distancia) devuelve la parte del coste del trayecto debido al a
distancia.
• getCosteTiempo(minutos) devuelve la parte del coste del trayecto debido a su
duración en minutos.
• getCosteTotalEsperado(carrera) devuelve el coste total esperado de la carrera
que recibe en función de la distancia esperada*/