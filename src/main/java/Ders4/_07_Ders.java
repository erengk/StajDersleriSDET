package Ders4;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _07_Ders extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        Actions actions = new Actions(driver);

        WebElement italy = driver.findElement(By.id("box106"));
        WebElement rome = driver.findElement(By.id("box6"));

        //1. Yöntem
        //actions.dragAndDrop(rome,italy).build().perform();

        //2. Yöntem
        actions.clickAndHold(rome).build().perform();
        actions.moveToElement(italy).release().build().perform();

        BekleKapat();
    }
}
