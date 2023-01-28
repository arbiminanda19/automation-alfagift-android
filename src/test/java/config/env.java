package config;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class env {

    public static AndroidDriver driver;
    public static DesiredCapabilities capabilities;
    public static String registeredPhoneNumber = "";
    public static String registeredMemberNumber = "";
    public static String registeredPassword = "";
    public static WebDriverWait wait;
    public static int duration = 10;
    public static String baseUrl = "http://127.0.0.1:4723/wd/hub";
    public static String phoneNumberMoreThan16Char = "081234567890123456";

}
