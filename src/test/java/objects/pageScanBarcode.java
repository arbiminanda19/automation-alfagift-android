package objects;

import org.openqa.selenium.By;

public class pageScanBarcode {

    By txt_scanBarcodeTitlePage = By.xpath("//*[@resource-id='com.alfamart.alfagift:id/tv_page_title']");
    By container_cameraView = By.xpath("//*[@resource-id='com.alfamart.alfagift:id/zxing_viewfinder_view']");

    public By getTxt_scanBarcodeTitlePage() {
        return txt_scanBarcodeTitlePage;
    }

    public By getContainer_cameraView() {
        return container_cameraView;
    }
}
