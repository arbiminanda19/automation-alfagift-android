package stepDef;

import config.env;
import io.cucumber.java.en.When;
import objects.pageHome;
import objects.pageGeneral;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class home extends env {

    pageHome pageHome = new pageHome();
    pageGeneral pageGeneral = new pageGeneral();
    @When("user is on Home page")
    public void user_is_on_home_page() {
        if (driver.findElements(pageGeneral.getBtn_never()).size() > 0) {
            driver.findElement(pageGeneral.getBtn_never()).click();
        }
        if (driver.findElements(pageGeneral.getBtn_x()).size() > 0) {
            driver.findElement(pageGeneral.getBtn_x()).click();
        }
        if (driver.findElements(pageHome.getBtn_dismissTutorial()).size() > 0) {
            driver.findElement(pageHome.getBtn_dismissTutorial()).click();
        }
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
