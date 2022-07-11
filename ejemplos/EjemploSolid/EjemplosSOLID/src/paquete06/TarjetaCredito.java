/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author SALA I
 */
class TarjetaCredito {

    private String nombre;
    private String codigo;
    private double cupo;

    public TarjetaCredito(String n, String c, double cm) {
        nombre = n;
        codigo = c;
        cupo = cm;
    }

    public void establecerNombreTarjeta(String n) {
        nombre = n;
    }

    public void establecerCodigo(String c) {
        codigo = c;
    }

    public void establecerCupo(double cm) {
        cupo = cm;
    }

    public String obtenerNombreTarjeta() {
        return nombre;
    }

    public String obtenerCodigo() {
        return codigo;
    }

    public double obtenerCupo() {
        return cupo;
    }
}
