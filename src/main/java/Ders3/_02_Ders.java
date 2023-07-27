package Ders3;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Ders extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        String msg = "Sana da merhaba";

        WebElement textBox = driver.findElement(By.cssSelector("label[for=message] + input"));
        textBox.sendKeys(msg);
        WebElement btn = driver.findElement(By.cssSelector("[onclick='showInput();']"));
        btn.click();
        WebElement message = driver.findElement(By.cssSelector("div#user-message > *:nth-child(2)"));

        Assert.assertTrue(message.getText().equals(msg));
        Assert.assertTrue(message.getText().contains("/"));

        BekleKapat();

    }
}

/*
Windesk.FM Facility Management Domain Expert
Algoritma
Java
Maven
GitHub -> version control
Selenium Web Driver
TestNG (New Generation) - jUnit
Cucumber -> Gherkin Test Scenario - Test Case
"kullanıcı tıkla butonuna bastığında sipariş sayfasına yönlenebilmelidir"
Apache POI
MySQL -> SQL sorgularını göreceğiz
JDBC -> Excel de işkem yaptırmayı göreceğiz
Postman
RestAssured
Mobil Test -> Appium
Jira -> Agile Project Management
Jenkins -CI/CD
 */