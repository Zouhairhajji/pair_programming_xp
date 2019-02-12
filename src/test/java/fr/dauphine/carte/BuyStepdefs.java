package fr.dauphine.carte;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fr.dauphine.zoo.Animal;
import fr.dauphine.zoo.AnimalStates;
import java.util.stream.IntStream;

public class BuyStepdefs {

    private Navigateur chrostopheColomb;
    private Carte carte;

    @Before
    public void initUp() {
        this.carte = new Carte("Inde");
        this.chrostopheColomb = new Navigateur(carte, "Chrostophe Colomb", 80, "F");
    }

    @Given("^I have (\\d+) item in my wallet before buy$")
    public void verify_elements(int count_items) throws Throwable {
        IntStream
                .of(10)
                .forEach(s -> {
                    Animal animal = new Animal("", s, "F", null, AnimalStates.OK);
                    carte.getAnimaux().add(animal);
                });
                
    }

    @When("^I buy the (\\d+) item  from the other browser$")
    public void give_ble_to_colomb(int countItems) throws Throwable {
        
    }
    
    

    @Then("^I ll have (\\d+) in my wallet after buy$")
    public void troro(int expectedCound) throws Throwable {
        
    }

}
