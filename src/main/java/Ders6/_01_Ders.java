package Ders6;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class _01_Ders extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        //MyFunctions.Bekle(5);
        //Duration duration = Duration.ofSeconds(30);
        //driver.manage().timeouts().pageLoadTimeout(duration);

        WebElement btn = driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        btn.click();

        Duration duration = Duration.ofSeconds(90);
        driver.manage().timeouts().implicitlyWait(duration);

        WebElement msg = driver.findElement(By.xpath("//p[text()='WebDriver']"));


        Assert.assertTrue("locator bulunamadı", msg.getText().equals("WebDriver"));
        BekleKapat();

    }
}
