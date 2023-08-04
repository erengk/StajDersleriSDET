package Ders8;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _03_Ders extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://www.copado.com/robotic-testing");

        MyFunctions.Bekle(2);
        JavascriptExecutor js= (JavascriptExecutor)driver;

        WebElement element = driver.findElement(By.xpath("//a[text()='Read Story']"));
        // js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].scrollIntoView(false);", element);
        // default değeri true
        // false; element,sayfanın altında kalacak şekilde scroll yapar
        // true; element,sayfanın üstünde kalacak şekilde scroll yapar



        js.executeScript("arguments[0].click();", element);

        // element.click();

        MyFunctions.Bekle(5);
        BekleKapat();

    }
}
