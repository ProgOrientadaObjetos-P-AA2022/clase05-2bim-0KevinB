/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {

    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    // private double edadminima;

    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public ArrayList<Persona> obtenerEstudiante() {
        return estudiantes;
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (Persona e : obtenerEstudiante()) {
            suma = suma + e.obtenerEdad();
        }
        promedioEdades = suma / obtenerEstudiante().size();
    }

    public double obtenerPromedioEdades() {

        return promedioEdades;
    }

    @Override
    public String toString() {
        String cadena = "Lista de estudiantes";
        for (Persona e : obtenerEstudiante()) {
            cadena = String.format("%s\nNombre del estudiante: %s\n",
                    cadena,
                    e.obtenerNombre());
        }
        cadena = String.format("%s\nPromedio de edad: %.2f",
                cadena, promedioEdades);
        return cadena;
    }

}
