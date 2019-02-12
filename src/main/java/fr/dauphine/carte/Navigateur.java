/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.dauphine.carte;

import fr.dauphine.abstracts.Entity;
import fr.dauphine.zoo.Animal;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author zouhairhajji
 */
@Getter
@Setter
public class Navigateur extends Entity {

    private Coffre<Animal> coffre;
    private Carte carte;

    public Navigateur(Carte carte, String name, int age, String gender) {
        super(0, 0, age, name, gender);
        this.coffre = new Coffre();
        this.carte = carte;
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        List<Animal> toGive = this.carte.getAnimaux()
                .stream()
                .filter(s -> s.getX() == x)
                .filter(s -> s.getY() == y)
                .collect(Collectors.toList());
        
        this.carte.getAnimaux().removeIf( s -> toGive.contains(s) );
        this.coffre.getElements().addAll(toGive);
    }
    
    

}
