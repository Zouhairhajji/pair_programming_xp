/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.dauphine;

import fr.dauphine.carte.Coffre;
import fr.dauphine.patterns.CoffreDecorator;

/**
 *
 * @author zouhairhajji
 */
public class CarteRunner {
    public static void main(String[] args) {
        
        Coffre coffre = new Coffre();
        System.out.println(coffre.getCapacity());
        
        coffre = new CoffreDecorator(coffre);
        System.out.println(coffre.getCapacity());
        
        
    }
}
