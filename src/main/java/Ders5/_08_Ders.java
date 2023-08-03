package Ders5;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _08_Ders extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://demoqa.com/buttons");

        WebElement element = driver.findElement(By.id("rightClickBtn"));
        MyFunctions.Bekle(2);

        Actions aksiyonlar = new Actions(driver);
        Action aksiyon=aksiyonlar.moveToElement(element).contextClick().build(); // contextClick=rightClick
        aksiyon.perform();

        // aksiyonlar.moveToElement(element).contextClick().build().perform();
        // new Actions(driver).contextClick(element).build().perform();

        BekleKapat();
    }
}
