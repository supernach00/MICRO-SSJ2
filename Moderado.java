package com.company;

public class Moderado extends Pasajero {

    private int lugaresLibresDeseados;

    public Moderado(int lugaresLibresDeseados) {
        this.lugaresLibresDeseados = lugaresLibresDeseados;
    }

    @Override
    public boolean quiereSubir(Micro micro) {
        return micro.lugarDisponible() >= this.lugaresLibresDeseados;
        VecesQueLeDijeronDeSubir++
    	
    	if (VecesQueLeDijeronDeSubir >= 5) {
    		formaDeViajar = Apurado; 
    }

    @Override
    public String toString() {
        return "Moderado{" +
                "lugaresLibresDeseados=" + lugaresLibresDeseados +
                '}';
    }
}
