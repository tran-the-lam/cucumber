package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class ExampleSteps {
    private int number1;
    private int number2;
    private int result;

    @Given("I have two numbers {int} and {int}")
    public void i_have_two_numbers_and(int num1, int num2) {
        this.number1 = num1;
        this.number2 = num2;
    }

    @When("I add them")
    public void i_add_them() {
        this.result = this.number1 + this.number2;
    }

    @Then("I should get {int}")
    public void i_should_get(int expectedResult) {
        assertEquals(expectedResult, this.result);
    }
}