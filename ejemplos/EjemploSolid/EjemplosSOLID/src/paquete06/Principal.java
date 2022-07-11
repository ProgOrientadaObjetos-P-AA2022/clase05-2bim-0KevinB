/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        TarjetaCredito tarjeta = new TarjetaCredito("Visa", "295", 5000);

        MayorEdad representante = new MayorEdad("José", tarjeta);

        MenorEdad menor = new MenorEdad("Felipe", representante);

        System.out.printf("Nombre: %s - Tarjeta: %s\nCupo: %s   -  Codigo: %s\n",
                menor.obtenerNombre(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerNombreTarjeta(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerCodigo(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerCupo());

    }
}
