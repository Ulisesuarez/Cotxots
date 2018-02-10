package org.mvpigs.Cotxots.carrera;


import org.mvpigs.Cotxots.conductores.PoolConductores;
import org.mvpigs.Cotxots.tarifa.Tarifa;
public class Carrera {

	private String tarjetaCredito;
	private String origen;
	private String destino;
	private double distancia;
	private int TiempoEsperado;

	public Carrera(String tarjetaCredito) {
		this.tarjetaCredito=tarjetaCredito;
		
		
	}

	public void setOrigen(String origen) {
		this.origen=origen;
		
	}

	public void setDestino(String destino) {
		this.destino=destino;

	}

	public void setDistancia(double distancia) {
		this.distancia=distancia;
		
	}

	public void setTiempoEsperado(int tiempoEsperadoMinutos) {
		this.TiempoEsperado=tiempoEsperadoMinutos;
		
	}

	public String getTarjetaCredito() {
		
		return this.tarjetaCredito;
	}

	public String getOrigen() {
		
		return this.origen;
	}

	public String getDestino() {
		
		return this.destino;
	}

	public double getDistancia() {
		
		return this.distancia;
	}
	
	public int getTiempoEsperado() {
		
		return this.TiempoEsperado;
	}
	public double getCosteEsperado() {


		
		return Tarifa.getCosteTotalEsperado(this);
	}

	public void asignarConductor(PoolConductores conductores) {
		// TODO Auto-generated method stub
		
	}

	public Object getConductor() {
		// TODO Auto-generated method stub
		return null;
	}

	public void realizarPago(String costeEsperado) {
		// TODO Auto-generated method stub
		
	}

	public void recibirPropina(int i) {
		// TODO Auto-generated method stub
		
	}

	public void liberarConductor() {
		// TODO Auto-generated method stub
		
	}

	

}
