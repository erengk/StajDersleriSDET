package Ders4;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_Ders extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://www.hepsiburada.com/");
        WebElement element = driver.findElement(By.xpath("//span[text()='Anne, Bebek, Oyuncak']"));
        MyFunctions.Bekle(2);

        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(element).build();
        action.perform();
        MyFunctions.Bekle(2);

        BekleKapat();
    }
}
