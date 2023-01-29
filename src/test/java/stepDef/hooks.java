package stepDef;

import config.env;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class hooks extends env {

    @Before
    public void openApps() throws IOException, InterruptedException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel 3a XL API 32");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "12");
        capabilities.setCapability("app", System.getProperty("user.dir") + "/src/test/resources/app/alfagift.apk");
        capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability("autoAcceptAlerts", true);

        URL url = new URL(baseUrl);
        driver = new AndroidDriver(url, capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, duration);
    }

    @After
    public void after(Scenario scenario) throws IOException {
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String savePhotoFolder;
        if (scenario.isFailed()){
            savePhotoFolder = "/src/test/resources/screenshots/failed/";
        } else {
            savePhotoFolder = "/src/test/resources/screenshots/all/";
        }
        FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + savePhotoFolder + scenario.getName() + ".png"));
        driver.quit();
    }

}
