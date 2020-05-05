package com.company;

public abstract class Pasajero {

	public FormaDeViajar formaDeViajar;
	
    public boolean quiereSubir(Micro micro) {
        formaDeViajar.quiereSubir(Micro micro);
    }
}
   