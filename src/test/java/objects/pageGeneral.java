package objects;

import org.openqa.selenium.By;

public class pageGeneral {
    By btn_never = By.xpath("//*[@resource-id='android:id/autofill_save_no']");

    By btn_x = By.xpath("//android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView");

    public By getBtn_never() {
        return btn_never;
    }

    public By getBtn_x() {
        return btn_x;
    }
}
