package Ders1;

import Utility.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_Ders {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        try{

            WebElement firstName = driver.findElement(By.id("hataliLocator"));

        }catch (Exception e){
            System.out.println("WebElement Bulunamadı --> " + e.getMessage());
        }

        MyFunctions.Bekle(3);
        driver.quit();
    }
}
