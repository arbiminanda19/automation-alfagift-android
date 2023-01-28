package stepDef;

import config.env;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import objects.pageWelcome;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class welcome extends env {

    pageWelcome pageWelcome = new pageWelcome();
    @Given("user is on welcome page")
    public void click_certain_card() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageWelcome.getImg_welcome())
        );
    }

    @When("user click Masuk button")
    public void click_masuk_button() {
        driver.findElement(pageWelcome.getBtn_masuk()).click();
    }

}
