package objects;

import org.openqa.selenium.By;

public class pageWelcome {


    By img_welcome = By.xpath("//*[@resource-id='com.alfamart.alfagift:id/img_welcome']");
    By btn_masuk = By.xpath("//android.widget.TextView[@resource-id='com.alfamart.alfagift:id/btn_login']");

    public By getImg_welcome() {
        return img_welcome;
    }

    public By getBtn_masuk() {
        return btn_masuk;
    }
}
