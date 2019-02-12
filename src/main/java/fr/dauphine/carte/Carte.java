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
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author zouhairhajji
 */
@Getter
@Setter
public class Carte {

    private String zoneName;
    private List<Animal> animaux;
    private List<Navigateur> navigateurs;
    
    
    private Timestamp dernierUpdate;
    
    public Carte(String zoneName) {
        this.zoneName = zoneName;
        this.animaux = new ArrayList<>();
        this.dernierUpdate = new Timestamp(System.currentTimeMillis());
        this.navigateurs = new ArrayList<>();
    }
    
    

}
