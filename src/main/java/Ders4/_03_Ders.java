package Ders4;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_Ders extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://demoqa.com/buttons");
        WebElement clickMe = driver.findElement(By.xpath("//button[text()='Click Me']"));
        //clickMe.click();

        Actions actions = new Actions(driver);

        Action action = actions.moveToElement(clickMe).click().build();
        System.out.println("Aksiyon hazırlandı");

        MyFunctions.Bekle(2);

        action.perform();
        System.out.println("Aksiyon gerçekleşti");

        BekleKapat();
    }
}
