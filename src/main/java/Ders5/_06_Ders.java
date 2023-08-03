package Ders5;

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

        driver.get("https://demoqa.com/buttons");
        WebElement element=driver.findElement(By.xpath("//button[text()='Click Me']"));
        //element.click();

        Actions aksiyonlar=new Actions(driver); // web sayfası aksiyonlara açıldı.

        Action aksiyon= aksiyonlar.moveToElement(element).click().build();
        // elementin üzerin click için git orda bekle.aksiyonu hazırla.
        System.out.println("Aksiyon hazırlandı");

        MyFunctions.Bekle(4);
        aksiyon.perform(); // aksiyonu gerçekleştir. , işleme al, uygula, icra et
        System.out.println("asiyon gerçekleştir.");

        BekleKapat();
    }
}
