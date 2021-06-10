package stepDefinitions;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import resources.Base;


	



@RunWith(Cucumber.class)
public class StepDefinition extends Base
{
	

	@Given("I am on login page with login")
		public void i_am_on_login_page() throws IOException {
	
		 driver=InitDriver();
	   
		}

		//Some other steps were also undefined:


    @When("^I Enter (.+) and (.+) and click with correct credentials$")
    public void i_enter_and_and_click_with_correct_credentials(String username, String password) throws Throwable {
       
			driver.findElement(By.xpath("//input['@jsaction=paste:puy29d']")).sendKeys("cucumber");
			
			System.out.println(username+" ANNND"+ password);
			Assert.assertTrue(true);
		}
		@Then("I am able to login to the website")
		public void i_am_able_to_login_to_the_website() {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new io.cucumber.java.PendingException();
			driver.close();
		}




}
