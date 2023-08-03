package Ders7;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_Ders extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://chercher.tech/practice/frames");

        //driver.switchTo().frame("iamframe");
        //driver.switchTo().frame("frame1"); // id ve name çok yavaş çalışıyor, index bizim tercihimiz olacak. index ok hızlı çalışır
        // index>name>id
        driver.switchTo().frame(0); // 0 index'e sahip ilk frame içerisine gittim
        WebElement textBox = driver.findElement(By.cssSelector("#topic+input"));
        textBox.sendKeys("Gökhan");

        driver.switchTo().frame(0); // ilk frame içerisinde 0 index'e sahip frame'e gittim
        WebElement checkBox = driver.findElement(By.cssSelector("input[id='a']"));
        checkBox.click();
/*
frame 0
        frame 0
        frame 1

frame 1
frame 2 -> driver.switchTo().frame(2)
        frame 0 -> driver.switchTo().frame(0)
        frame 1 -> driver.switchTo().frame(1)
        frame 2 -> driver.switchTo().frame(2)
        frame 3 -> driver.switchTo().frame(3)
 */



        BekleKapat();
    }
}
