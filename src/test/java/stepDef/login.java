package stepDef;

import config.env;
import io.cucumber.java.en.When;
import objects.pageLogin;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class login extends env {

    pageLogin pageLogin = new pageLogin();
    @When("user input registered Nomor HP or Nomor Member")
    public void input_registered_number() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageLogin.getInput_number())
        );
        driver.findElement(pageLogin.getInput_number()).sendKeys(registeredPhoneNumber);
    }

    @When("user input registered Password")
    public void input_registered_password() {
        driver.findElement(pageLogin.getInput_password()).sendKeys(registeredPassword);
    }

    @When("user click Lanjut button")
    public void click_next_button() {
        driver.findElement(pageLogin.getBtn_next()).click();
    }

}
