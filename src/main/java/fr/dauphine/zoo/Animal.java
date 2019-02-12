package fr.dauphine.zoo;

import fr.dauphine.abstracts.Entity;

/**
 * Décrivez votre classe Animal ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Animal extends Entity{

    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private Responsible responsable;
    private AnimalStates state;

    /**
     * Constructeur d'objets de classe Animal
     */
    public Animal(String name, int age, String gender, Responsible resp, AnimalStates state) {
        // initialisation des variables d'instance
        super(0, 0, age, name, gender);
        this.responsable=resp;
        this.state=state;
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    

}
