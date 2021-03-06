/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.dauphine.carte;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fr.dauphine.zoo.Animal;
import org.junit.Assert;

/**
 *
 * @author zouhairhajji
 */
public class CoffreTest {

    private Navigateur christopheColomb;
    private Carte carte;

    public void setUp() {

    }

    @Given("^il y a (\\d+) animal dans le coffre du navigateur$")
    public void il_y_a_animal_dans_le_coffre_du_navigateur(int nbrAnimals) throws Throwable {
        this.carte = new Carte("Inde");
        this.christopheColomb = new Navigateur(carte, "Christophe Colomb", 80, "M");

        for (int i = 0; i < nbrAnimals; i++) {
            this.christopheColomb.getCoffre().getElements().add(new Animal("animal 1", 20, "M", null, null));
        }

        Assert.assertEquals(this.carte, this.christopheColomb.getCarte());
        Assert.assertEquals(nbrAnimals, this.christopheColomb.getCoffre().getElements().size());
    }

    @When("^le navigateur ameliore son coffre de (\\d+) elements$")
    public void le_navigateur_ameliore_son_coffre(int nbr_elements) throws Throwable {

        int oldCapacity = this.christopheColomb.getCoffre().getCapacity();
        Boolean state = this.christopheColomb.ameliorerCoffre();
        int newCapacity = this.christopheColomb.getCoffre().getCapacity();

        Assert.assertEquals(nbr_elements, newCapacity - oldCapacity);
    }

    @Then("^la capacite du coffre devrait etre (\\d+) elements$")
    public void la_capacite_du_coffre_devrait_etre_ameliorer_de_elements(int arg1) throws Throwable {
        Assert.assertEquals(arg1, this.christopheColomb.getCoffre().getCapacity());
    }

    
    
}
