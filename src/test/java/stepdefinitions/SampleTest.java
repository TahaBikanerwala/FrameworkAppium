package stepdefinitions;

import java.io.IOException;

import org.junit.Test;

import FrameworkAppium.Base;
import PageObjects.HomePage;
import PageObjects.Preferences;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SampleTest extends Base{
	
	static HomePage homePage;
	static Preferences prefs;
	AndroidDriver driver;
	
	@Given("User launches the app")
	public void user_launches_the_app() throws IOException {
		 driver = capabilities();
		 homePage = new HomePage(driver);
		 homePage.clickpreferences();
		 
	}
	@Then("HomeScreen should be displayed")
	public void home_screen_should_be_displayed() {
		prefs = new Preferences(driver);
		prefs.clickpreferences_dep();
	}


		
	
	
	
}
