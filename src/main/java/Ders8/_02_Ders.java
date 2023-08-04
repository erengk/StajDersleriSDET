package Ders8;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _02_Ders extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://p-del.co/");
        MyFunctions.Bekle(2);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        MyFunctions.Bekle(2);

        js.executeScript("window.scrollTo(0,0);");

        MyFunctions.Bekle(2);

        BekleKapat();
    }
}
