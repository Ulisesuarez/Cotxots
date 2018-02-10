package org.mvpigs.Cotxots.conductores;

import java.util.ArrayList;

public class Conductor {
    private String nombre=null;
	private String modelo=null;
	private String matricula=null;
	private double valoracionMedia =0;
	private ArrayList<Byte> valoraciones;
	private boolean ocupado=false;


    public Conductor(String nombre) {
        this.nombre=nombre;
        this.valoraciones= new ArrayList<Byte>();
    }

    public void setValoracionMedia() {
        double sumaValoraciones=0;
        for (Byte valoracion:this.valoraciones){
            sumaValoraciones=sumaValoraciones+valoracion;
        }

       this.valoracionMedia= sumaValoraciones/this.valoraciones.size();
    }

    public void setValoraciones(ArrayList<Byte> valoraciones) {
        this.valoraciones = valoraciones;
        setValoracionMedia();
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }



	public void setMatricula(String matricula) {
		 this.matricula=matricula;
		
	}

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getValoracionMedia() {
        setValoracionMedia();
        return valoracionMedia;
    }

    public ArrayList<Byte> getValoraciones() {
        return valoraciones;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setModelo(String modelo) {
		this.modelo=modelo;
		
	}

	public void setValoracion(byte valoracion) {
		this.valoraciones.add(valoracion);
		
	}

    public String getNombre() {
        return this.nombre;
    }
}
/*
Atributos
nombre del conductor
modelo modelo del coche
matricula
valoracionMedia valoración media del conductor
valoraciones array de longitud variable que almacena todas las valoraciones del conductor
ocupado indica si el conductor está prestando un servicio o está libre.

Métodos
setValoracion(valoracion) añade la nueva valoración y actualiza la valoración media del conductor.

*/