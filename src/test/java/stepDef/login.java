package stepDef;

import config.env;
import io.cucumber.java.en.When;
import objects.pageLogin;
import org.junit.Assert;
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

    @When("user input unregistered Nomor HP or Nomor Member")
    public void input_unregistered_number() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageLogin.getInput_number())
        );
        driver.findElement(pageLogin.getInput_number()).sendKeys("086969696969");
    }

    @When("user input registered Password")
    public void input_registered_password() {
        driver.findElement(pageLogin.getInput_password()).sendKeys(registeredPassword);
    }

    @When("user input unregistered Password")
    public void input_unregistered_password() {
        driver.findElement(pageLogin.getInput_password()).sendKeys("unregispass");
    }

    @When("user click Lanjut button")
    public void click_next_button() {
        driver.findElement(pageLogin.getBtn_next()).click();
    }

    @When("user see number unregistered modal")
    public void see_number_unregistered_modal() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageLogin.getTxt_numberUnregistered())
        );
        Assert.assertTrue((driver.findElement(pageLogin.getTxt_numberUnregistered()).getText()).contains("Nomor Anda belum terdaftar"));
    }

}
