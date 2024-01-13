package calculatorBDD.steps;

import org.junit.Assert;

import aula1101.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps {
	
	private Calculator calculadora;
	private int result;

	@Given("I have a calculator")
	public void I_have_a_calculator() {
		calculadora = new Calculator();
	}
	
	@When("I add {int} and {int}")
	public void I_add_twonumbers(int num1, int num2){
		result = calculadora.add(num1,num2);
	}
		
	@When("I sub {int} and {int}")
	public void I_sub_two_numbers(int num1, int num2) {
		result = calculadora.subtract(num1, num2);
		//System.out.println("resultado" + result);
	}
	
	@Then("the result should be {int}")
	public void the_result_should_be(int num1) {
		Assert.assertEquals(result, num1);
	}

}
