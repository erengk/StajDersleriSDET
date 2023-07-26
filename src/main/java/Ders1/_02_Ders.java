package Ders1;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_Ders extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://form.jotform.com/232061942956965");

        WebElement firstName = driver.findElement(By.id("first_10"));
        firstName.sendKeys("gokhan");

        WebElement lastName = driver.findElement(By.id("last_10"));
        lastName.sendKeys("eren");

        WebElement eMail = driver.findElement(By.name("q11_email11"));
        eMail.sendKeys("example@gmail.com");

        WebElement code = driver.findElement(By.id("input_12_area"));
        code.sendKeys("090");

        WebElement telNumber = driver.findElement(By.name("q12_phoneNumber12[phone]"));
        telNumber.sendKeys("5555555555");

        WebElement textBox = driver.findElement(By.id("input_6"));
        textBox.sendKeys("Bu bir deneme mesajıdır");
        MyFunctions.Bekle(2);


        WebElement submitBtn = driver.findElement(By.id("input_7"));
        submitBtn.click();
        MyFunctions.Bekle(3);

        WebElement dogrulama = driver.findElement(By.xpath("//h1[text()='Thank You!']"));
        System.out.println(dogrulama.getText());
        System.out.println("dogrulama = " + dogrulama.getText());

        MyFunctions.Bekle(3);

        driver.quit();
    }
}
