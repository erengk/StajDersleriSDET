package Ders5;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_Ders extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://demoqa.com/auto-complete");

        WebElement txtBox = driver.findElement(By.id("autoCompleteSingleContainer"));

        // Gökhan -> 1.step : G  2.step : ökhan

        Actions actions = new Actions(driver);

        Action action = actions
                .moveToElement(txtBox)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("g")
                .keyUp(Keys.SHIFT)
                .sendKeys("ökhan")
                .build();

        MyFunctions.Bekle(2);
        action.perform();

        BekleKapat();

    }
}
