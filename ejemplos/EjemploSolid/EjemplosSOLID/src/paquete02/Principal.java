/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        Persona p1 = new Persona("Kevin Barrazueta", 18);
        Persona p2 = new Persona("Alexander Quizhpe", 18);
        Persona p3 = new Persona("Luis Vera", 20);
        Persona p4 = new Persona("Pablo Gonzales", 17);
        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        OperacionesEstudiantes o = new OperacionesEstudiantes();
        o.establecerEstudiante(lista);
        o.establecerPromedioEdades();
        System.out.println(o);
    }
}
