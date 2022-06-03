package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Preferences {
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='3. Preference dependencies']")
	public WebElement preference_dep;
	
	public Preferences(AndroidDriver driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}

	public void clickpreferences_dep() {
		preference_dep.click();
	}

}