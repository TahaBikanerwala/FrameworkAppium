package stepdefinitions;

import java.io.IOException;

import FrameworkAppium.Base;
import PageObjects.HelpPage;
import PageObjects.JoinPage;
import PageObjects.SignInPage;
import PageObjects.SignUpPage;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class SampleTest extends Base{
	
	static SignInPage signInPage;
	static JoinPage joinInPage;
	static SignUpPage signUpPage;
	static HelpPage helpPage;
	AndroidDriver driver;
	

	@BeforeAll
	public static void before_all(){
		// service = startServer();
	}
	
	@Given("User launches the app")
	public void user_launches_the_app() throws IOException {
		 driver = capabilities();
		 signInPage = new SignInPage(driver);

		//  signInPage.typeEmail("lawson_8857.hammes@gmail.com");
		//  signInPage.typePassword("foobarbazz");
		//  signInPage.signInButtonClick();
	}
	@Then("HomeScreen should be displayed")
	public void home_screen_should_be_displayed() throws InterruptedException {
		Thread.sleep(2000);
		joinInPage = signInPage.signUpButtonClick();
		Thread.sleep(2000);
		signUpPage = joinInPage.joinOnlyMeClick();
		Thread.sleep(2000);
		signUpPage.userNameEnter("Taha");
		Thread.sleep(2000);
		signUpPage.lastNameEnter("Bikanerwala");
		Thread.sleep(2000);
		signUpPage.emailEnter("dummy_mail@dummy.com");
		Thread.sleep(2000);
		signUpPage.termsCheckBoxClick();
		helpPage = signUpPage.helpButtonClick();
		Thread.sleep(2000);
		

	}


		
	
	
	
}
