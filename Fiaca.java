package com.company;

public class Fiaca extends Pasajero {

	private int VecesQueLeDijeronDeSubir = 0;
	
    @Override
    public boolean quiereSubir(Micro micro) {
        
    	return micro.hayLugarParaIrSentado();
    	
    	VecesQueLeDijeronDeSubir++
    	
    	if (VecesQueLeDijeronDeSubir >= 2) {
    		formaDeViajar = Moderado; 
    	}
    	
    }

    @Override
    public String toString() {
        return "Fiaca";
    }
}
