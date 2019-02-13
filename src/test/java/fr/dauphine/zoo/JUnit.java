/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.dauphine.zoo;

import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author amiradjilani
 */
public class JUnit {

    Responsible resp = new Responsible("Animal");
    Animal Chat = new Animal("Amira", 5,"female",resp,AnimalStates.OK);


    /**
     * constructor test
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructor()
    {
        Responsible resptest = new Responsible("Animal");
        Animal animaltest = new Animal("Amira", 5,"female",resp,AnimalStates.NOT_OK);
    }

    /**
     * getter test
     */
    @Test
    public void testGender()
    {
        assertEquals("female", Chat.getGender());
    }
    @Test
    public void testState()
    {
        assertEquals(AnimalStates.OK, Chat.getState());
    }
    @Test
    public void testAge()
    {
        assertEquals(Integer.valueOf(5), Chat.getAge());
    }

    @Test
    public void testName()
    {
        assertEquals("Amira", Chat.getName());
    }
}

