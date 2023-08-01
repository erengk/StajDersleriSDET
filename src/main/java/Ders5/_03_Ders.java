package Ders5;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Ders extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickBtn = driver.findElement(By.xpath("//*[@onClick='myAlertFunction()']"));
        clickBtn.click();

        MyFunctions.Bekle(2);
        driver.switchTo().alert().accept();

        BekleKapat();
    }
}
