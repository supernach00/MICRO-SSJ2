package com.company;

public class Claustrofobico extends Pasajero {

    @Override
    public boolean quiereSubir(Micro micro) {

        return micro.getVolumen() > 120;

    }

}
