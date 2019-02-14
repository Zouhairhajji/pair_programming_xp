/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.dauphine.zoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author amiradjilani
 */
public class Zoo {
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
    
    public int getNumberAnimals(){
        int nb_animaux=0;
        Set cles = zoo.keySet();
        Iterator it = cles.iterator();
        while (it.hasNext()){
            Object resp = it.next(); // tu peux typer plus finement ici
            ArrayList<Animal> animaux_resp = zoo.get(resp); // tu peux typer plus finement ici
            nb_animaux+= animaux_resp.size();
        }
        return nb_animaux;
    }

    public float getMoyAge(){
        Integer nb_animaux=0;
        Integer total_age=0;
        Set cles = zoo.keySet();
        Iterator it = cles.iterator();
        while (it.hasNext()){
            Object resp = it.next(); // tu peux typer plus finement ici
            ArrayList<Animal> animaux_resp = zoo.get(resp); // tu peux typer plus finement ici
            nb_animaux+= animaux_resp.size();
            for (int i = 0; i < animaux_resp.size(); i++) {
                total_age+=animaux_resp.get(i).getAge();
            }
        }
        return total_age/nb_animaux;
    }
    

    
}
