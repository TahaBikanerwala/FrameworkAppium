package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import FrameworkAppium.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage extends Base{
	
	
	// private AndroidDriver driver;

	public HomePage(AndroidDriver driver) {
		// this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Preference']")
	public WebElement preferences;
	
	public void clickpreferences() {
		preferences.click();
//		return PageFactory.initElements(driver, Preferences.class);
		
	}
	
	

}