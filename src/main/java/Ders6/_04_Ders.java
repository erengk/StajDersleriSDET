package Ders6;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _04_Ders extends BaseDriver {
    @Test
    public void Test1(){
        /*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönünüz
 */
        driver.get("https://www.demoblaze.com/index.html");

        WebElement linkS6 = driver.findElement(By.linkText("Samsung galaxy s6"));
        linkS6.click();

        WebElement linkAddBtn = driver.findElement(By.linkText("Add to cart"));
        linkAddBtn.click();

        WebDriverWait bekle = new WebDriverWait(driver, Duration.ofSeconds(30));
        bekle.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        WebElement homePage = driver.findElement(By.cssSelector("a#nava"));
        homePage.click();

        bekle.until(ExpectedConditions.urlToBe("https://www.demoblaze.com/index.html"));

        Assert.assertEquals("https://www.demoblaze.com/index.html",driver.getCurrentUrl());

        BekleKapat();

    }
}
