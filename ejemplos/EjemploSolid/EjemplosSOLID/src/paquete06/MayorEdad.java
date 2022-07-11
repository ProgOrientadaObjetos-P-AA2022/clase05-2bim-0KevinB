/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class MayorEdad extends Persona{
    private TarjetaCredito t;
    
    public MayorEdad(String n, TarjetaCredito tar){
        super(n);
        t = tar;
    }
    public void establecerTarjeta(TarjetaCredito n){
        t = n;
    }
    
    public TarjetaCredito obtenerTarjeta(){
        return t;
    }

    
}
