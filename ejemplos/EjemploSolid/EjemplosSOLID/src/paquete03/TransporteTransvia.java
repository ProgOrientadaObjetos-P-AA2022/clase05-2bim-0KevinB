/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author UTPL
 */
class TransporteTransvia {

    private String cooperativaTV;
    private double tarifa;

    public void establecerCooperativaTaxi(String n) {
        cooperativaTV = n;
    }

    public void establecerTarifa() {
        tarifa = 0.50 + (0.25 * 0.5);
    }

    public String obtenerCooperativaTransvia() {
        return cooperativaTV;
    }

    public double obtenerTarifa() {
        return tarifa;
    }

}
