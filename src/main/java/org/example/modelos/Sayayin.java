package org.example.modelos;

public abstract class Sayayin {

    private String nombres;
    private String familia;
    private String edad;
    private int poderPelea;

    public Sayayin() {
    }

    public Sayayin(String nombres, String familia, String edad, int poderPelea) {
        this.nombres = nombres;
        this.familia = familia;
        this.edad = edad;
        this.poderPelea = poderPelea;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public int getPoderPelea() {
        return poderPelea;
    }

    public void setPoderPelea(int poderPelea) {
        this.poderPelea = poderPelea;
    }

    public void saludar(){
        System.out.println("Hola mi nombre es: "+this.nombres);
    }

    public abstract void pelear();
}
