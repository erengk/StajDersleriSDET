package Ders1;

import Utility.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_Ders {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement firstName = driver.findElement(By.name("q8_name[first]"));
        firstName.sendKeys("eren");

        WebElement lastName = driver.findElement(By.cssSelector("input[autocomplete='section-input_8 family-name']"));
        lastName.sendKeys("gokhan");

        WebElement submitBtn = driver.findElement(By.cssSelector("button[type='submit']"));
        submitBtn.click();
        MyFunctions.Bekle(2);


        WebElement dogrulama = driver.findElement(By.xpath("//h1[text()='Thank You!']"));
        System.out.println(dogrulama.getText());
        System.out.println("dogrulama = " + dogrulama.getText());

        MyFunctions.Bekle(3);
        driver.quit();

    }
}
