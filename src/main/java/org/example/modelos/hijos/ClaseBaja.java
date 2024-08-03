package org.example.modelos.hijos;

import org.example.modelos.Sayayin;

public class ClaseBaja extends Sayayin {

    private String nombreEsposa;

    public ClaseBaja() {
    }

    @Override
    public void pelear() {
        System.out.println("disfruto la pelea al maximo");
    }

    public ClaseBaja(String nombres, String familia, String edad, int poderPelea, String nombreEsposa) {
        super(nombres, familia, edad, poderPelea);
        this.nombreEsposa = nombreEsposa;
    }

    public String getNombreEsposa() {
        return nombreEsposa;
    }

    public void setNombreEsposa(String nombreEsposa) {
        this.nombreEsposa = nombreEsposa;
    }
}
