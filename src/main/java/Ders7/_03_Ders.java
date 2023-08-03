package Ders7;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _03_Ders extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://www.selenium.dev/downloads/");

        String anasayfaWindowID = driver.getWindowHandle();
        System.out.println("anasayfaWindowID = " + anasayfaWindowID);

        List<WebElement> aLinkBlank = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement l : aLinkBlank) {
            //System.out.println("l.getAttribute(\"href\") = " + l.getAttribute("href"));
            if (!l.getAttribute("href").contains("mail")) {
                l.click();
                MyFunctions.Bekle(2);
                driver.switchTo().window(anasayfaWindowID);
            }
        }
        Set<String> windowsID = driver.getWindowHandles();
        for (String id: windowsID) {
            System.out.println("id = " + id);
        }
        BekleKapat();
    }
}
