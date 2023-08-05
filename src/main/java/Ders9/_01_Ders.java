package Ders9;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class _01_Ders extends BaseDriver {
    @Test
    public void Test1() throws AWTException {
        driver.get("https://demo.guru99.com/test/upload/");
        MyFunctions.Bekle(2);
        String window = driver.getWindowHandle();
        Robot rbt = new Robot();
        driver.switchTo().window(window);

        //driver.switchTo().frame("uploadframe");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        List<WebElement> acceptAll = driver.findElements(By.xpath("//span[text()='Accept All']"));
        if (acceptAll.size() > 0)
            acceptAll.get(0).click();

        WebElement sbmt = driver.findElement(By.id("submitbutton"));
        wait.until(ExpectedConditions.elementToBeClickable(sbmt));

        for (int i = 0; i < 21; i++){
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
        }
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        StringSelection dosyaYolu = new StringSelection("/Users/gokhanerenkamer/Documents/TechnoStudy Assignments/Presentations");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);

        MyFunctions.Bekle(1);
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_C);

        MyFunctions.Bekle(1);
        rbt.keyRelease(KeyEvent.VK_C);
        rbt.keyRelease(KeyEvent.VK_CONTROL);

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        MyFunctions.Bekle(1);

        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);

        rbt.keyPress(KeyEvent.VK_SPACE);
        rbt.keyRelease(KeyEvent.VK_SPACE);

        for (int i = 0; i < 2; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
        }
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        WebElement mesaj = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='has been successfully uploaded.']")));
        Assert.assertTrue(mesaj.isDisplayed());

        BekleKapat();
    }
}
