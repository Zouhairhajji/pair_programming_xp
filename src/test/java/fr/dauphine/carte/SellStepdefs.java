package fr.dauphine.carte;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static junit.framework.Assert.assertEquals;

public class SellStepdefs {

    private Navigateur chrostopheColomb;
    private Navigateur otherBrowser;

    @Before
    public void initUp() {
        this.chrostopheColomb = new Navigateur("Christophe", "Colomb", 80);
        this.otherBrowser = new Navigateur("other", "other", 20);
        System.out.println("CouCou");
    }

    @Given("^I have (\\d+) item in my wallet$")
    public void verify_elements(int count_items) throws Throwable {
        System.out.println("-> 1");
        this.chrostopheColomb.addCoffre("Ble");
        assertEquals(count_items, this.chrostopheColomb.getCoffre().size());
    }

    @When("^I give the item (\\d+) to the other browser$")
    public void give_ble_to_colomb(int countItems) throws Throwable {
        System.out.println("-> 2");
        this.chrostopheColomb.giveTo("Ble", otherBrowser);
       
        assertEquals(countItems, this.otherBrowser.getCoffre().size());
    }

    @Then("^I ll have (\\d+) in my wallet$")
    public void troro(int expectedCound) throws Throwable {
        System.out.println("-> 3");
        //assertEquals(expectedCound, this.chrostopheColomb.getCoffre().size());
    }

}
