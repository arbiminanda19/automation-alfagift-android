package stepDef;

import config.env;
import io.cucumber.java.en.When;
import objects.pageHome;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class home extends env {

    pageHome pageHome = new pageHome();

    @When("user is on Home page")
    public void user_is_on_home_page() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageHome.getBtn_dismissTutorial())
        );
        driver.findElement(pageHome.getBtn_dismissTutorial()).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageHome.getPage_home())
        );
    }

    @When("user see Alfagift menu")
    public void see_menu() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageHome.getBtn_home())
        );
    }

}
