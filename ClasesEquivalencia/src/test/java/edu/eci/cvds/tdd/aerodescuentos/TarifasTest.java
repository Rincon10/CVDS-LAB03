package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {
    private CalculadorDescuentos c= new CalculadorDescuentos();
    private double tarifa;



    @Test
    public void validateTest1(){
        //        deberia generar error por edad <= 0
        try{
            tarifa = c.calculoTarifa(5000000,15,-100);
        }
        catch ( Exception e){
            System.out.println( e.getMessage());
        }


    }
    @Test
    public void validateTest4(){
        //        no se debe aplicar descuento
        tarifa = c.calculoTarifa(5000000,15,65);
        Assert.assertEquals( String.valueOf(tarifa), "5000000.0");

    }

}