package com.company;

import java.util.List;

public class Micro {

    private int capacidadPersonasSentadas;
    private int capacidadPersonasParadas;
    private int volumen;

    private int pasajeros;
    private Pasajero quienSubioPrimero;
    private boolean yaMeUsaron;
    
    List<String> pasajerosSubidos = new ArrayList<String>();

    public Micro(int capacidadPersonasSentadas,
                 int capacidadPersonasParadas,
                 int volumen) {

        this.capacidadPersonasSentadas = capacidadPersonasSentadas;
        this.capacidadPersonasParadas = capacidadPersonasParadas;
        this.volumen = volumen;

    }

    public void subir(Pasajero pasajero) {

        if (this.puedeSubir(pasajero)) {
            this.pasajeros++;
            pasajerosSubidos.add(pasajero.formaDeViajar);
            if (!yaMeUsaron) {
                quienSubioPrimero = pasajero;
                yaMeUsaron = true;
            }
        } else {
            System.out.println("No puede subir bro");
        }

    }

    public void bajar() {

        if (this.pasajeros == 0) {
            System.out.println("No podes bajar lo inbajable bro");
        } else {
            this.pasajeros--;
        }

    }

    public Pasajero quienSubioPrimero() {
        return this.quienSubioPrimero;
    }

    public boolean puedeSubir(Pasajero pasajero) {
        return this.tengoLugar() && pasajero.quiereSubir(this);
    }

    public boolean hayLugarParaIrSentado() {
        return capacidadPersonasSentadas > pasajeros;
    }

    public int lugarDisponible() {
        return this.capacidadTotal() - this.pasajeros;
    }

    public int getVolumen() {
        return volumen;
    }
    
    public quePasajerosTengo {
        System.out.print(pasajerosSubidos);	
    
    	
    	
    }

    private boolean tengoLugar() {
        return this.pasajeros < (this.capacidadTotal());
    }

    private int capacidadTotal() {

        return this.capacidadPersonasSentadas + this.capacidadPersonasParadas;

    }

}
