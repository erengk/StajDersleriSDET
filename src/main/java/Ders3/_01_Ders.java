package Ders3;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_Ders extends BaseDriver {
    public static void main(String[] args) {
        //https://demo.seleniumeasy.com/basic-first-form-demo.html
        // 1-Açılan sayfadaki kutucuğa mesajınızı yazını.
        // 2-Butona tıklatınız
        // 3-Butona basıldığında mesajınızın sayfada göründüğünü test ediniz.
        // CSS Selector kullanılarak yapılacak.

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        String msg = "Merhaba";
        WebElement textBox = driver.findElement(By.cssSelector("[type=text][class=form-control][id=user-message]"));
        textBox.sendKeys(msg);
        WebElement button = driver.findElement(By.cssSelector("form#get-input button"));
        button.click();
        WebElement message = driver.findElement(By.cssSelector("[id=display][title^=text]"));
        if (message.getText().equals(msg)){
            System.out.println("Test passed");
        }else
            System.out.println("Test fail");

        BekleKapat();

    }
}
