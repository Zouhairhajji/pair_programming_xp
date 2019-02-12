/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.dauphine.abstracts;

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
public abstract class Entity {
    
    protected Integer x, y;
    protected Integer age;
    protected String name;
    protected String gender;
    
    public abstract void move(int x, int y) ; 
    
}
