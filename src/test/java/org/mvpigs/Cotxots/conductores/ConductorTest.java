package org.mvpigs.Cotxots.conductores;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConductorTest {

    private Conductor conductor;
    @Before
    public void setConductor(){
        conductor=new Conductor("Samantha");
        conductor.setMatricula("4ABC123");
        conductor.setModelo("Chevy Malibu");
        conductor.setValoracion((byte) 4);
        conductor.setValoracion((byte) 2);

    }

    @Test
    public void testConductor(){

        Assert.assertEquals("Samantha",conductor.getNombre());
    }

    @Test
    public void testSetMatricula() {
        Assert.assertEquals("4ABC123",conductor.getMatricula());
    }

    @Test
    public void testSetModelo() {
        Assert.assertEquals("Chevy Malibu",conductor.getModelo());
    }

    @Test
    public void testSetValoracion() {

        Assert.assertEquals(3,conductor.getValoracionMedia(),0.1);
    }


}

/*

 */