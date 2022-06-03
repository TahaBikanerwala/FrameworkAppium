package PageObjects;

import io.appium.java_client.android.AndroidDriver;

public class Dependency {

    AndroidDriver driver;
    public Dependency(AndroidDriver driver){
        this.driver = driver;
    }

}
