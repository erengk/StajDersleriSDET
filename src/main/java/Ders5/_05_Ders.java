package Ders5;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_Ders extends BaseDriver {
    @Test
    public void Test1(){

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe = driver.findElement(By.xpath("//button[@onClick='myPromptFunction()']"));
        MyFunctions.Bekle(3);
        clickMe.click();

        MyFunctions.Bekle(3);
        driver.switchTo().alert().sendKeys("Gökhan Eren");
        MyFunctions.Bekle(3);
        driver.switchTo().alert().accept();

        MyFunctions.Bekle(3);

        WebElement txtActual = driver.findElement(By.id("prompt-demo"));

        Assert.assertTrue("İsim göründü mü?", txtActual.getText().toLowerCase().contains("gökhan eren"));
        BekleKapat();

    }
}
