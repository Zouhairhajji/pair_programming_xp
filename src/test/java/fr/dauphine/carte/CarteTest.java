/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.dauphine.carte;

import fr.dauphine.zoo.Animal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
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
public class CarteTest {
    
    private Navigateur navigateur;
    private Carte carte;
    
    @Before
    public void setUp() {
        this.carte = new Carte("Inde");
        this.navigateur = new Navigateur(carte, "Colomb ", 80, "M");
    }
    
    @Test
    public void testZone(){
        this.carte.setZoneName("Inde");
        Assert.assertEquals("Inde", this.carte.getZoneName());
    }
    
    @Test
    public void testAnimaux(){
        List<Animal> animaux = new ArrayList<>();
        this.carte.setAnimaux(animaux);
        Assert.assertEquals(animaux, this.carte.getAnimaux());
    }
    
    @Test
    public void testNavigateur(){
        List<Navigateur> navigateurs = new ArrayList<>();
        this.carte.setNavigateurs(navigateurs);
        Assert.assertEquals(navigateurs, this.carte.getNavigateurs());
    }
    
    @Test
    public void testLastUpdate(){
        Timestamp lastUpdate = new Timestamp(System.currentTimeMillis());
        this.carte.setDernierUpdate(lastUpdate);
        Assert.assertEquals(lastUpdate, this.carte.getDernierUpdate());
    }
    
}
