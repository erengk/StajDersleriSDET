package Ders4;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_Ders extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://demoqa.com/buttons");

        WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
        MyFunctions.Bekle(2);

        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(doubleClick).doubleClick().build();
        action.perform();

        WebElement assertMsg = driver.findElement(By.id("doubleClickMessage"));

        Assert.assertTrue("double click yapamadı!", assertMsg.getText().contains("done"));

        BekleKapat();
    }
}
