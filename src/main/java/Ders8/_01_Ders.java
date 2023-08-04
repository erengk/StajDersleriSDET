package Ders8;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class _01_Ders extends BaseDriver {
    @Test
    public void Test1(){

        driver.get("https://p-del.co/");
        MyFunctions.Bekle(2);



       // Actions actions = new Actions(driver);
       // Select webSelect = new Select(element);
        double sayi1 = 12.3564434;
        int sayi2 = (int)(sayi1);
        System.out.println(sayi2);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0, 3000)");

        MyFunctions.Bekle(2);

        js.executeScript("window.scrollBy(0,-2000)");

        BekleKapat();


    }
}
