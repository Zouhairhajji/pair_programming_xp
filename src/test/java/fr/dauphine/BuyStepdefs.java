package fr.dauphine;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static junit.framework.Assert.assertEquals;

public class BuyStepdefs {

    private Navigateur chrostopheColomb;
    private Navigateur otherBrowser;

    @Before
    public void initUp() {
        this.chrostopheColomb = new Navigateur("Christophe", "Colomb", 80);
        this.otherBrowser = new Navigateur("other", "other", 20);
    }

    @Given("^I have (\\d+) item in my wallet before buy$")
    public void verify_elements(int count_items) throws Throwable {
        this.otherBrowser.addCoffre("Ble", 100L);

        assertEquals(count_items, this.chrostopheColomb.getCoffre().size());
    }

    @When("^I buy the (\\d+) item  from the other browser$")
    public void give_ble_to_colomb(int countItems) throws Throwable {
        this.otherBrowser.giveTo("Ble", chrostopheColomb);
        assertEquals(countItems, this.chrostopheColomb.getCoffre().size());
    }
    
    

    @Then("^I ll have (\\d+) in my wallet after buy$")
    public void troro(int expectedCound) throws Throwable {
        assertEquals(expectedCound, this.chrostopheColomb.getCoffre().size());
    }

}
