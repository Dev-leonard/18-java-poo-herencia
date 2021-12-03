package org.leonard.pooherencia;

public class Alumno extends Persona { // tambien tiene sus propios atributos.
    private String instituto;
    private double notaMatematica;
    private double notacastellano;
    private double notaHistoria;

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotacastellano() {
        return notacastellano;
    }

    public void setNotacastellano(double notacastellano) {
        this.notacastellano = notacastellano;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }
}
