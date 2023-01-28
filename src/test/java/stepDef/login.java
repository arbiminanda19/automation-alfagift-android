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

    @When("user input invalid Nomor HP or Nomor Member format")
    public void input_invalid_number_format() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageLogin.getInput_number())
        );
        driver.findElement(pageLogin.getInput_number()).sendKeys("5647");
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

    @When("user see wrong password error message")
    public void see_wrong_password_error() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageLogin.getTxt_passwordError())
        );
        Assert.assertTrue((driver.findElement(pageLogin.getTxt_passwordError()).getText()).contains("Password Anda salah"));
    }

    @When("user see number cant empty error message")
    public void see_number_cant_empty_error() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageLogin.getTxt_phoneNumberError())
        );
        Assert.assertTrue((driver.findElement(pageLogin.getTxt_phoneNumberError()).getText()).contains("Nomor HP / No. kartu Member tidak boleh kosong"));
    }

    @When("user see password cant empty error message")
    public void see_password_cant_empty_error() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageLogin.getTxt_passwordError())
        );
        Assert.assertTrue((driver.findElement(pageLogin.getTxt_passwordError()).getText()).contains("Kolom ini diperlukan"));
    }

    @When("user see invalid phone or member number format error message")
    public void see_invalid_number_format_error() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageLogin.getTxt_phoneNumberError())
        );
        Assert.assertTrue((driver.findElement(pageLogin.getTxt_phoneNumberError()).getText()).contains("Format nomor HP atau No. kartu member anda salah"));
    }
}
