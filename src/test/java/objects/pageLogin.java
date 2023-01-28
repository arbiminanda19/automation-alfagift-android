package objects;

import org.openqa.selenium.By;

public class pageLogin {

    By input_number = By.xpath("//*[@resource-id='com.alfamart.alfagift:id/etPhonePontaNumber']");
    By input_password = By.xpath("//*[@resource-id='com.alfamart.alfagift:id/etPassword']");
    By btn_next = By.xpath("//*[@resource-id='com.alfamart.alfagift:id/btnNext']");
    By txt_numberUnregistered = By.xpath("//*[@resource-id='com.alfamart.alfagift:id/txtMessage']");
    By txt_wrongpassword = By.xpath("//*[@resource-id='com.alfamart.alfagift:id/tvPasswordError']");
    By txt_phoneNumberCantEmpty = By.xpath("//*[@resource-id='com.alfamart.alfagift:id/tvPhoneNumberError']");
    By txt_passwordCantEmpty = By.xpath("//*[@resource-id='com.alfamart.alfagift:id/tvPasswordError']");

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

    public By getTxt_wrongpassword() {
        return txt_wrongpassword;
    }

    public By getTxt_phoneNumberCantEmpty() {
        return txt_phoneNumberCantEmpty;
    }

    public By getTxt_passwordCantEmpty() {
        return txt_passwordCantEmpty;
    }
}
