package org.mvpigs.Cotxots.conductores;

import java.util.ArrayList;

public class PoolConductores {

    private ArrayList<Conductor> poolConductores;



    public PoolConductores(ArrayList<Conductor> poolConductores) {

		this.poolConductores=poolConductores;

	}

	public ArrayList<Conductor> getPoolConductores() {
        return poolConductores;
    }

	public Conductor asignarCondtuctor(){
	    for (Conductor conductor: this.poolConductores) {

	        if (!conductor.isOcupado()){

	            conductor.setOcupado(true);
	            return conductor;
            }
        }

     return null;}

}
