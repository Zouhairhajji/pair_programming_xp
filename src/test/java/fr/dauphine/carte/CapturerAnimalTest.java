package fr.dauphine.carte;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fr.dauphine.zoo.Animal;
import org.junit.Assert;

public class CapturerAnimalTest {

    private Navigateur chrostopheColomb;
    private Carte carte;
    
    @Given("^il y a un animal a la position (\\d+) (\\d+)$")
    public void il_y_a_un_animal_a_la_position(int xPos, int yPos) throws Throwable {
        this.carte = new Carte("Inde");
        this.chrostopheColomb = new Navigateur(carte, "Chrostophe Colomb", 80, "F");
        
        Animal animal1 = new Animal("animal 1", 20, "M", null, null);
        animal1.setCoordinate(xPos, yPos);
        
        this.carte.getAnimaux().add(animal1);
        
        Assert.assertEquals(this.carte, this.chrostopheColomb.getCarte());
        Assert.assertEquals(0, this.chrostopheColomb.getCoffre().getElements().size());
        Assert.assertEquals(1, this.carte.getAnimaux().size());
    }

    @When("^le navigateur capture (\\d+) animal à la position (\\d+) (\\d+)$")
    public void le_navigateur_capture_un_animal(int countAnimals, int xPos, int yPos) throws Throwable {
        this.chrostopheColomb.setCoordinate(xPos, yPos);
        int count = this.chrostopheColomb.capturer().size();
        Assert.assertEquals(countAnimals, count);
    }

    @Then("^le coffre de navigateur doit contenir (\\d+) animal et le naviteur est en vie$")
    public void le_coffre_de_navigateur_doit_contenir_animal_et_le_naviteur_est_en_vie(int arg1) throws Throwable {
        System.out.println("arg1 : " + arg1);
        Assert.assertEquals(arg1, this.chrostopheColomb.getCoffre().getElements().size());
    }

}
