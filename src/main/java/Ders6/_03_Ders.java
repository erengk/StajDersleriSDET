package Ders6;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03_Ders extends BaseDriver {
    @Test
    public void Test1(){
        /*
Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz
        (xpath kullanmayınız)
 */

        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement title = driver.findElement(By.cssSelector("input#title"));
        title.sendKeys("Gökhan");
        WebElement description = driver.findElement(By.cssSelector("textarea#description"));
        description.sendKeys("Eren");

        WebElement btn = driver.findElement(By.id("btn-submit"));
        btn.click();

        WebDriverWait bekle = new WebDriverWait(driver, Duration.ofSeconds(30));
        bekle.until(ExpectedConditions.textToBe(By.id("submit-control"),"Form submited Successfully!"));

        WebElement msg = driver.findElement(By.id("submit-control"));
        Assert.assertEquals("Form submited Successfully!",msg.getText());

        BekleKapat();


    }
}
