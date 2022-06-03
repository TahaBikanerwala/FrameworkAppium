package FrameworkAppium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver capabilities() throws IOException {
		
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/FrameworkAppium/global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		AndroidDriver driver;
		File appDir = new File("src");
		File app = new File(appDir,(String) prop.get("AppNameKey"));
		DesiredCapabilities cap = new DesiredCapabilities();
		
		String device = (String) prop.get("DeviceName");
		cap.setCapability("deviceName", device);
		
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		String automatorName = (String) prop.get("AutomatorName");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, automatorName);
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"),cap);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		return driver;
	}
	

}

