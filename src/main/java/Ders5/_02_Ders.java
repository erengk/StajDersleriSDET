package Ders5;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_Ders extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://demoqa.com/auto-complete");

        WebElement txtBox = driver.findElement(By.id("autoCompleteSingleInput"));

        Actions actions = new Actions(driver);

        Action action = actions

                .moveToElement(txtBox)
                .click()
                .sendKeys("b")
                .build();
        action.perform();

        MyFunctions.Bekle(2);

        action = actions
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .build();
        action.perform(); //ctrl + alt + L (code refactoring)
        BekleKapat();
    }
}
