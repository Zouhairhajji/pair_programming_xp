/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.dauphine.zoo;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.ArrayList;

/**
 *
 * @author amiradjilani
 */
public class CucumberTest {

    private ArrayList<Animal> animals;
  
    private Zoo zoo;
    private Responsible resp;
    private AnimalTest animal;

    private JUnit junit;
    private boolean success;


    @Given("^Responsible add animals to the zoo$")
    public void responsible_add_animals_to_the_zoo() throws Throwable {
        
        junit = new JUnit();
/*        
// Write code here that turns the phrase above into concrete actions
        Animal animal1 = new Animal("Amira", 5, "female", resp, AnimalStates.OK);
        Animal animal2 = new Animal("Nizar", 5, "male", resp, AnimalStates.NOT_OK);
        animals.add(animal1);
        animals.add(animal2);
        
        //ArrayList<Animal> animaux_resp= new ArrayList<Animal>();
        //animaux_resp.add(animal1);
        resp = new Responsible("Amira");
        resp.addAnimal(animal1);
        
        HashMap<Responsible,ArrayList<Animal>> zoo_members=new HashMap<Responsible,ArrayList<Animal>>();
        zoo_members.put(resp, resp.getAnimals());
        zoo= new Zoo(2,zoo_members);
        // Write code here that turns the phrase above into concrete actions
        //System.out.println(zoo.getZoo().get(resp)).size());
        //assertEquals(1, (zoo.getZoo().get(resp)).size());
        //throw new PendingException();
        */
        //  success = junit.doSomething();
    }

    @When("^Responsible check the state of each animal$")
    public void responsible_check_the_state_of_each_animal() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Responsible return number of animals$")
    public void responsible_return_number_of_animals() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    
    /*@Given("^my service exists$")
    public void my_service_exists() throws Throwable {
        
        Examples:
        |name_animal | age | animal_gender |
        |Singe       | 5   | Female        |
        |Animal      | 4   | Male          |
        
        Animal animal1 = new Animal("Amira", 5, "female", resp, AnimalStates.OK);
        Animal animal2 = new Animal("Nizar", 5, "male", resp, AnimalStates.NOT_OK);
        animals.add(animal1);
        animals.add(animal2);
        
        //ArrayList<Animal> animaux_resp= new ArrayList<Animal>();
        //animaux_resp.add(animal1);
        resp = new Responsible("Amira");
        resp.addAnimal(animal1);
        
        HashMap<Responsible,ArrayList<Animal>> zoo_members=new HashMap<Responsible,ArrayList<Animal>>();
        zoo_members.put(resp, resp.getAnimals());
        zoo= new Zoo(2,zoo_members);
        // Write code here that turns the phrase above into concrete actions
        
        assertEquals(1, (zoo.getZoo().get(resp)).size());
        throw new PendingException();
    }
 
    @When("^I call my service$")
    public void i_call_my_service() throws Throwable {
        
    }
 
    @Then("^it should have been a success$")
    public void it_should_have_been_a_success() throws Throwable {
        Assert.assertTrue(success);
    }*/
    
}
