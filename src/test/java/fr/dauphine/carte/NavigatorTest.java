/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.dauphine.carte;

import fr.dauphine.zoo.Animal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 *
 * @author zouhairhajji
 */
@RunWith(JUnit4.class)
public class NavigatorTest {

    private Navigateur navigateur;

    @Before
    public void setUp() {
        Carte carte = new Carte("Inde");
        this.navigateur = new Navigateur(carte, "Colomb ", 80, "M");
    }

    @Test
    public void testSetCarte(){
        Carte carte = new Carte("Inde");
        this.navigateur.setCarte(carte);
        Assert.assertEquals(carte, this.navigateur.getCarte());
    }
    
    @Test
    public void testSetCoffre(){
        Coffre<Animal> coffre = new Coffre();
        this.navigateur.setCoffre(coffre);
        Assert.assertEquals(coffre, this.navigateur.getCoffre());
    }
    
    @Test
    public void testMoveNavigateur(){
        this.navigateur.move(10, 10);
        Assert.assertEquals(10, this.navigateur.getX());
        Assert.assertEquals(10, this.navigateur.getY());
    }
    
}
