/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.dauphine.carte;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zouhairhajji
 */
public class Carte {

    private List<String> zones;

    private Timestamp dernierUpdate;

    private Navigateur navigateur;

    public Carte(Navigateur navigateur) {
        // on peut faire une implémentation meilleure,  - BEST EFFORT - 
        this.zones = new ArrayList<String>() {
            @Override
            public boolean add(String e) {
                boolean state = super.add(e);
                if (state) {
                    dernierUpdate = new Timestamp(System.currentTimeMillis());
                }
                return state;
            }
        };

        this.dernierUpdate = new Timestamp(System.currentTimeMillis());
        this.navigateur = navigateur;
    }

    public void addZone(String zone) {
        if (this.zones == null) {
            this.zones = new ArrayList<>();
        }
        this.zones.add(zone);
    }

    public Timestamp getDernierUpdate() {
        return dernierUpdate;
    }

    public Navigateur getNavigateur() {
        return navigateur;
    }

    public List<String> getZones() {
        return zones;
    }

    public void setNavigateur(Navigateur navigateur) {
        this.navigateur = navigateur;
    }
    
    

}
