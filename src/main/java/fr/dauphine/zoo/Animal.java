package fr.dauphine.zoo;

import fr.dauphine.abstracts.Entity;
import lombok.Getter;
import lombok.Setter;

/**
 * Décrivez votre classe Animal ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
@Getter
@Setter
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
        //when creating an animal the first time it should be ok...
        if(state==AnimalStates.NOT_OK){
            throw new IllegalArgumentException();
        }
        this.state=state;
    }

    public void changeState(AnimalStates state){

    }

    @Override
    public void move(int x, int y) {
        
    }
}
