package Ders7;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class _03_Ders extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://www.selenium.dev/");
        String anaSayfaWindowId = driver.getWindowHandle(); //Yalnızca aktif olan tek sayfa için kullanılır

        JavascriptExecutor js = (JavascriptExecutor) driver;

        System.out.println("anaSayfaWindowId = " + anaSayfaWindowId);

        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));

        // Aşağıdaki şu anda bütün sayfalar açıldı
        for (WebElement link : linkler) {
            if (!link.getAttribute("href").contains("mail")) {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
                wait.until(ExpectedConditions.elementToBeClickable(link));
                js.executeScript("arguments[0].scrollIntoView(true);", link);
                js.executeScript("arguments[0].click();", link);
                driver.switchTo().window(anaSayfaWindowId);
                wait.until(ExpectedConditions.urlToBe("https://www.selenium.dev/"));
            }
        }


// her bir sayfaya geçip url ve title ını yazdırma
        Set<String> windowsIdLer = driver.getWindowHandles(); // Liste oluşturarak tüm açılan sekmelerin id lerini bu listeye aktarır
        for (String id : windowsIdLer) {
            MyFunctions.Bekle(2);
            driver.switchTo().window(id); // sıradaki tabdaki window a geçmiş oldum.
            System.out.println("title=" + driver.getTitle() + ", url=" + driver.getCurrentUrl());
        }

// ana sayfa harici kapama
        for (String id : windowsIdLer) {
            if (id.equals(anaSayfaWindowId))
                continue;

            driver.switchTo().window(id); // sıradaki tabdaki window a geçmiş oldum.
            driver.close(); //quit(): Tüm sayfaları kapatıyor. close(): Aktif olan sayfayı kapatıyor
        }




        BekleKapat();
    }
}
