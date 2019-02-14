/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.dauphine.carte;

import fr.dauphine.abstracts.Entity;
import fr.dauphine.patterns.CoffreDecorator;
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
        this.addObserver(carte);
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        List<Animal> toGive = this.carte.getAnimaux()
                .stream()
                .filter(s -> s.getX() == x)
                .filter(s -> s.getY() == y)
                .collect(Collectors.toList());

        this.carte.getAnimaux().removeIf(s -> toGive.contains(s));
        this.coffre.getElements().addAll(toGive);
    }

    public List<Animal> capturer() {
        List<Animal> ToBeCaptured = this.carte.getAnimaux()
                .stream()
                .filter(s -> s.getX() == x)
                .filter(s -> s.getY() == y)
                .collect(Collectors.toList());
        this.carte.getAnimaux().removeAll(ToBeCaptured);
        ToBeCaptured.forEach(s -> this.coffre.getElements().add(s));
        if (ToBeCaptured.size() > 0) {
            this.notifyAllObservers();
        }
        return ToBeCaptured;
    }

    public Boolean ameliorerCoffre() {
        if (this.coffre.getElements().size() > 0) {
            this.coffre.getElements().remove(0);
            this.coffre = new CoffreDecorator(this.coffre);
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    public void setCarte(Carte carte) {
        this.clearObservers();
        this.carte = carte;
        this.addObserver(carte);
    }
}
