/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author UTPL
 */
class TransporteAereo {

    private String cooperativaAerea;
    private double tarifa;

    public void establecerCooperativaAerea(String n) {
        cooperativaAerea = n;
    }

    public void establecerTarifa() {
        tarifa = 40 + (10 * 5);
    }

    public String obtenerCooperativaAerea() {
        return cooperativaAerea;
    }

    public double obtenerTarifa() {
        return tarifa;
    }

}
