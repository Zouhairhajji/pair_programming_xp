/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.dauphine.patterns;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zouhairhajji
 */
public abstract class Observable {
    
    private List<IObserver> iObservers;

    public Observable() {
        this.iObservers = new ArrayList<>();
    }
    
    public void addObserver(IObserver iObserver){
        this.iObservers.add(iObserver);
    }
    
    public void clearObservers(){
        this.iObservers = new ArrayList<>();
    }
    
    public void notifyAllObservers(){
        this.iObservers
                .stream()
                .forEach(s -> s.update());
    }
    
    
    
}
