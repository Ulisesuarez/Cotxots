package org.mvpigs.Cotxots.carrera;


import org.mvpigs.Cotxots.conductores.PoolConductores;
import org.mvpigs.Cotxots.tarifa.Tarifa;
import org.mvpigs.Cotxots.conductores.Conductor;
public class Carrera {

	private String tarjetaCredito;
	private String origen;
	private String destino;
	private double distancia;
	private int tiempoEsperado;
	private int tiempoCarrera;
    private double costeTotal=0;
    private Conductor conductor;
    private double propina=0;

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
		this.tiempoEsperado =tiempoEsperadoMinutos;
		
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
		
		return this.tiempoEsperado;
	}
	public double getCosteEsperado() {


		
		return Tarifa.getCosteTotalEsperado(this);
	}

	public void asignarConductor(PoolConductores conductores) {
        this.conductor=conductores.asignarCondtuctor();
		
	}

	public Conductor getConductor() {

		return this.conductor;

	}

    public int getTiempoCarrera() {
        return this.tiempoCarrera;
    }

    public void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    public double getCosteTotal() {
        this.costeTotal=Tarifa.getCosteTotal(this);

        return this.costeTotal;
    }




	public void realizarPago(double pago) {

	    this.costeTotal=pago;

		
	}

	public void recibirPropina(double propina) {
		this.propina=propina;
	}

	public double getPropina(){
        return this.propina;
    }
	public void liberarConductor() {
		this.conductor.setOcupado(false);
		
	}

	

}
