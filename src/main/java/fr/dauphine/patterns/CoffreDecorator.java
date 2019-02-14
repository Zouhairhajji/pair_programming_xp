/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.dauphine.patterns;

import fr.dauphine.carte.Coffre;

/**
 *
 * @author zouhairhajji
 */
public class CoffreDecorator extends Coffre {

    private Coffre coffre;

    public CoffreDecorator(Coffre coffre) {
        this.coffre = coffre;
    }

    @Override
    public int getCapacity() {
        return this.coffre.getCapacity() + 5; 
    }

    

    
    
    
    
    

}
