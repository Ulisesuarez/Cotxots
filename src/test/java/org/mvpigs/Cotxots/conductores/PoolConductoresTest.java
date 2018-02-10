package org.mvpigs.Cotxots.conductores;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PoolConductoresTest {
    private ArrayList<Conductor> poolConductores = new ArrayList<Conductor>();
    private PoolConductores conductores;
    @Before
    public void setPoolConductores() {

        Conductor conductor;


        String[] nombres = {"Samantha", "Fox", "Mola"};
        for (String nombre : nombres) {
            conductor = new Conductor(nombre);
            poolConductores.add(conductor);
        }

        String[] matricula = {"4ABC123", "5DHJ444", "7JKK555"};
        String[] modelos = {"Chevy Malibu", "Toyota Prius", "Mercedes A"};

        int index = 0;
        // conductora.getClass().getFields();
        for (Conductor conductora : poolConductores) {
            conductora.setMatricula(matricula[index]);
            conductora.setModelo(modelos[index]);
            // suponemos que las conductoras tienen una valoracion inicial de 4 stars
            conductora.setValoracion((byte) 4);
            index++;

        }
        conductores = new PoolConductores(poolConductores);
    }    // Creamos el objeto flota de conductores, de la clase PoolConductores.
    @Test
    public void testPoolConductores(){

        Assert.assertEquals("Samantha",conductores.getPoolConductores().get(0).getNombre());
        Assert.assertEquals("5DHJ444",conductores.getPoolConductores().get(1).getMatricula());
        Assert.assertEquals("Mercedes A",conductores.getPoolConductores().get(2).getModelo());
    }

    @Test
    public void testAsignarCondtuctor() {
        poolConductores.get(0).setOcupado(true);
        poolConductores.get(2).setOcupado(true);
        System.out.println(conductores.getPoolConductores().size());
        System.out.println(String.valueOf(poolConductores.get(0).isOcupado()));
        System.out.println(String.valueOf(poolConductores.get(1).isOcupado()));
        System.out.println(String.valueOf(poolConductores.get(2).isOcupado()));
        Assert.assertEquals("Fox",conductores.asignarCondtuctor().getNombre());

    }
}