package Ders4;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_Ders extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://demoqa.com/buttons");

        WebElement rightClick = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
        MyFunctions.Bekle(2);
        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(rightClick).contextClick().build(); //contextClick == rightClick
        action.perform();
        WebElement rightClickAssertMsg = driver.findElement(By.xpath("//p[contains(text(),'done')]"));
        MyFunctions.Bekle(2);
        Assert.assertTrue("right click yapılamadı", rightClickAssertMsg.getText().contains("done a right"));
        BekleKapat();

    }
}
