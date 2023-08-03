package Ders7;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_Ders extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);
        WebElement textBox = driver.findElement(By.cssSelector("#topic+input"));
        textBox.sendKeys("Türkiye");

        driver.switchTo().frame(0);
        WebElement checkBox = driver.findElement(By.cssSelector("input[id='a']"));
        checkBox.click();

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);

        WebElement webSelect = driver.findElement(By.id("animals"));
        Select objeSelect = new Select(webSelect);
        objeSelect.selectByIndex(3);

        BekleKapat();


       // driver.switchTo().defaultContent(); // Ana sayfaya gidiyor
       // driver.switchTo().parentFrame(); // Bir üst sayfaya gidiyor
    }
}
