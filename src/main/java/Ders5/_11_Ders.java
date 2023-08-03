package Ders5;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _11_Ders extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");
        Actions aksiyonlar = new Actions(driver);

        WebElement solSurgu=driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
        MyFunctions.Bekle(3);

        Action aksiyon=aksiyonlar.dragAndDropBy(solSurgu, 100, 0).build();
        aksiyon.perform();

        BekleKapat();
    }
}
