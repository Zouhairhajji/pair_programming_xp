/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.dauphine.zoo;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author amiradjilani
 */
public class Zoo {
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private HashMap<Responsible,ArrayList<Animal>> zoo;
    private int capacity;

    /**
     * Constructeur d'objets de classe Animal
     */
    public Zoo(int capacity, HashMap<Responsible, ArrayList<Animal>> zoo) {
        // initialisation des variables d'instance
        this.zoo=zoo;
        this.capacity=capacity;
        
    }

    public HashMap<Responsible, ArrayList<Animal>> getZoo() {
        return zoo;
    }

    public void setZoo(HashMap<Responsible, ArrayList<Animal>> zoo) {
        this.zoo = zoo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    

    
}
