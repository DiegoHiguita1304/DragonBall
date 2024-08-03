package org.example.modelos.hijos;

import org.example.modelos.Sayayin;

public class ClaseAlta extends Sayayin {

    private String estaciónEntrenamiento;

    public ClaseAlta() {
    }

    @Override
    public void pelear() {
        System.out.println("analizo al enemigo y ataco su punto debil");
    }

    public ClaseAlta(String nombres, String familia, String edad, int poderPelea, String estaciónEntrenamiento) {
        super(nombres, familia, edad, poderPelea);
        this.estaciónEntrenamiento = estaciónEntrenamiento;
    }

    public String getEstaciónEntrenamiento() {
        return estaciónEntrenamiento;
    }

    public void setEstaciónEntrenamiento(String estaciónEntrenamiento) {
        this.estaciónEntrenamiento = estaciónEntrenamiento;
    }
}
