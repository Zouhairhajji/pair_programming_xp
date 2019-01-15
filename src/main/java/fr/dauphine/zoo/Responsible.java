/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.dauphine.zoo;

import java.util.ArrayList;

/**
 *
 * @author amiradjilani
 */
public class Responsible {
    ArrayList<Animal> animaux;
    private String name;
    
    public Responsible(String name){
        this.animaux=new ArrayList<Animal>();
        this.name=name;
    }
    public void addAnimal(Animal animal){
        animaux.add(animal);
    }
    
    public ArrayList<Animal> getAnimals(){
        return animaux;
    }
}
