package com.company;

public class Obsecuente extends Pasajero {

    private Pasajero jefe;

    public Obsecuente(Pasajero jefe) {
        this.jefe = jefe;
    }

    @Override
    public boolean quiereSubir(Micro micro) {
        return this.jefe.quiereSubir(micro);
    }

}
