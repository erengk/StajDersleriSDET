package Ders5;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_Ders extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickBtn2 = driver.findElement(By.xpath("//button[@onClick='myConfirmFunction()']"));
        MyFunctions.Bekle(2);
        clickBtn2.click();

        MyFunctions.Bekle(2);
        driver.switchTo().alert().dismiss();

        BekleKapat();
    }
}
