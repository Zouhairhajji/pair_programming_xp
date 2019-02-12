/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.dauphine.carte;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.ToString;

/**
 *
 * @author zouhairhajji
 */
@ToString
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

    
    
    

    public List<T> getElementsByName(T name) {
        return this.elements
                .stream()
                .filter(s -> s == name)
                .collect(Collectors.toList());
    }

}
