package objects;

import org.openqa.selenium.By;

public class pageLogin {

    By input_number = By.xpath("//*[@resource-id='com.alfamart.alfagift:id/etPhonePontaNumber']");
    By input_password = By.xpath("//*[@resource-id='com.alfamart.alfagift:id/etPassword']");
    By btn_next = By.xpath("//*[@resource-id='com.alfamart.alfagift:id/btnNext']");
    By txt_numberUnregistered = By.xpath("//*[@resource-id='com.alfamart.alfagift:id/txtMessage']");

    public By getInput_number() {
        return input_number;
    }

    public By getInput_password() {
        return input_password;
    }

    public By getBtn_next() {
        return btn_next;
    }

    public By getTxt_numberUnregistered() {
        return txt_numberUnregistered;
    }
}