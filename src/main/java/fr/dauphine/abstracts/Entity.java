/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.dauphine.abstracts;

import fr.dauphine.patterns.Observable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author zouhairhajji
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Entity extends Observable{
    
    protected int x, y;
    protected int age;
    protected String name;
    protected String gender;
    
    public abstract void move(int x, int y) ; 
    
    public void setCoordinate(int x, int y){
        this.x = x;
        this.y =y;
    }
    
}
