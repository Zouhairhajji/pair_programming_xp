/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.dauphine.zoo;

import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author amiradjilani
 */
public class JUnit {



    Responsible resp = new Responsible("Nizar");
    Animal singe = new Animal("Singe", 7,"F",resp,AnimalStates.OK);
    Animal chat = new Animal("Chat", 7,"M",resp,AnimalStates.OK);

    ArrayList<Animal> animals = new ArrayList<Animal>() {{
        add(singe);
        add(chat);
    }};

    HashMap<Responsible, ArrayList<Animal>> hashzoo = new HashMap<Responsible, ArrayList<Animal>>() {
        {
            put(resp, animals);
        }
    };

    Zoo zoo= new Zoo(100, hashzoo);

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
        assertEquals("F", chat.getGender());
    }
    @Test
    public void testState()
    {
        assertEquals(AnimalStates.OK, chat.getState());
    }
    @Test
    public void testAge()
    {
        assertEquals(Integer.valueOf(7), chat.getAge());
    }

    @Test
    public void testName() {
        assertEquals("Chat", chat.getName());
    }

    @Test
    public void testGetNumberAnimals(){
        assertEquals(2,zoo.getNumberAnimals());
    }

    @Test
    public void testGetMoyAge(){
        assertEquals(7.00f, zoo.getMoyAge(), 0.0002); // true
    }


    @Test
    public void testGetCapacity(){
        assertEquals(100,zoo.getCapacity());
    }



}

