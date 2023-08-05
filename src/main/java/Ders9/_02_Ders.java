package Ders9;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.time.Duration;

public class _02_Ders extends BaseDriver {
    @Test
    public void Test1() throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement userName = driver.findElement(By.name("username"));
        wait.until(ExpectedConditions.visibilityOf(userName));
        userName.sendKeys("Gökhan");

        WebElement password = driver.findElement(By.name("password"));
        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys("admin123");

        WebElement btn = driver.findElement(By.cssSelector("button[type='submit']"));
        btn.click();

        List<WebElement> alertMsg = driver.findElements(By.cssSelector("div[role='alert']"));
        if (alertMsg.size() > 0) {
            System.out.println("Hata Oluştu");

            TakesScreenshot ts = (TakesScreenshot) driver;

            File hafizadakiHali = ts.getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(hafizadakiHali, new File("\\screenshot.png"));
        }

        MyFunctions.Bekle(2);

        BekleKapat();
    }
}
//TODO: Kayıt aldığı dosya adını benzersiz yaparak üzerine kaydetmemesini sağlayacak kod parçasını projeye dahil et.
// ipucu: LocalDateTime ile yapılacak.