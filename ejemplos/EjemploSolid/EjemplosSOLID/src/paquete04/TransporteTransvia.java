/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author UTPL
 */
class TransporteTransvia extends Transporte {

    private String cooperativaTaxi;

    public void establecerCooperativaTV(String n) {
        cooperativaTaxi = n;
    }

    public void establecerTarifa() {
        tarifa = 5 + (0.25 * 0.5);
    }

    public String obtenerCooperativaTV() {
        return cooperativaTaxi;
    }

}
