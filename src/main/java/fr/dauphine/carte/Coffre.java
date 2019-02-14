/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.dauphine.carte;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

/**
 *
 * @author zouhairhajji
 */
@Getter
public class Coffre<T> {

    protected int capacity;
    protected List<T> elements;

    public Coffre() {
        this.capacity = 5;
        this.elements = new ArrayList<T>() {
            @Override
            public boolean add(T element) {
                return isFull() ? false : super.add(element);
            }
        };
    }

    public boolean isFull() {
        return this.elements.size() >= this.getCapacity();
    }

    
    public int getCapacity() {
        return capacity;
    }

    
    
    

}
