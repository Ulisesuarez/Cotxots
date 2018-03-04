package org.mvpigs.Cotxots.tarifa;

import org.mvpigs.Cotxots.carrera.Carrera;
public class Tarifa {

    private static final double  costeMilla=1.35;
    private static final double  costeMinuto=0.35;
    private static final int  costeMinimo=5;
    private static final double  porcentajeComision=0.2;//20%




    public static double getCosteDistancia( double distancia){
        return distancia*costeMilla;
    }
    public static double getCosteMinutos( int minutos){
        return minutos*costeMinuto;
    }
    public static double getCosteTotalEsperado(Carrera carrera){
        double costeTotalEsperado=getCosteDistancia(carrera.getDistancia())+getCosteMinutos(carrera.getTiempoEsperado());
        if (costeTotalEsperado<costeMinimo){
            costeTotalEsperado=costeMinimo;
        }
        //costeTotalEsperado=costeTotalEsperado+costeTotalEsperado*porcentajeComision;
        return costeTotalEsperado;
    }
    public static double getCosteTotal(Carrera carrera){
        double costeTotal=getCosteDistancia(carrera.getDistancia())+getCosteMinutos(carrera.getTiempoCarrera());
        if (costeTotal<costeMinimo){
            costeTotal=costeMinimo;
        }
        //costeTotalEsperado=costeTotalEsperado+costeTotalEsperado*porcentajeComision;
        return costeTotal;
    }
}


/*getCosteDistancia(distancia) devuelve la parte del coste del trayecto debido al a
distancia.
• getCosteTiempo(minutos) devuelve la parte del coste del trayecto debido a su
duración en minutos.
• getCosteTotalEsperado(carrera) devuelve el coste total esperado de la carrera
que recibe en función de la distancia esperada*/