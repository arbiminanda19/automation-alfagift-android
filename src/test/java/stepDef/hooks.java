package stepDef;

import config.env;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class hooks extends env {

    @Before
    public void openApps() throws IOException, InterruptedException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel_3a_API_32_arm64-v8a");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "12");
        capabilities.setCapability("app", System.getProperty("user.dir") + "/src/test/resources/app/alfagift.apk");
        capabilities.setCapability("autoGrantPermissions", "true");

        URL url = new URL(baseUrl);
        driver = new AndroidDriver(url, capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, duration);
    }

    @After
    public void after(){
        driver.quit();
    }

}
