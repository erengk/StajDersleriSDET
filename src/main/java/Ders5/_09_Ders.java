package Ders5;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _09_Ders extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://www.hepsiburada.com/");

        WebElement element = driver.findElement(By.xpath("//span[text()='Moda']"));
        MyFunctions.Bekle(2);

        Actions aksiyonlar= new Actions(driver);
        Action aksiyon= aksiyonlar.moveToElement(element).build();
        aksiyon.perform();

        BekleKapat();
    }
}
