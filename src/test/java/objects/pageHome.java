package objects;

import org.openqa.selenium.By;

public class pageHome {

    By btn_dismissTutorial = By.xpath("//*[@resource-id='com.alfamart.alfagift:id/btnDismissTutorial']");
    By page_home = By.xpath("//*[@resource-id='com.alfamart.alfagift:id/fab_game']");
    By btn_home = By.xpath("//*[@resource-id='com.alfamart.alfagift:id/clickHomeMenu']");

    public By getBtn_dismissTutorial() {
        return btn_dismissTutorial;
    }

    public By getPage_home() {
        return page_home;
    }

    public By getBtn_home() {
        return btn_home;
    }
}
