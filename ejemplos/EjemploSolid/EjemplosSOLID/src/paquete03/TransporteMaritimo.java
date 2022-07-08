/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author UTPL
 */
class TransporteMaritimo {
        private String cooperativaTaxi;
    private double tarifa;
    
    public void establecerCooperativaTaxi(String n){
        cooperativaTaxi = n;
    }
    
    public void establecerTarifa(){
        tarifa = 0.40 + (0.40*0.5);
    }
    
    public String obtenerCooperativaTaxi(){
        return cooperativaTaxi;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
    
    
}

