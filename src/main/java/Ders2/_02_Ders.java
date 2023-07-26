package Ders2;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Ders extends BaseDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        MyFunctions.Bekle(3);

        WebElement alertBtn = driver.findElement(By.id("alerttest"));
        alertBtn.click();
        MyFunctions.Bekle(3);

        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        MyFunctions.Bekle(3);

        System.out.println(driver.getCurrentUrl());
        driver.navigate().forward();
        MyFunctions.Bekle(3);

        System.out.println(driver.getCurrentUrl());

        BekleKapat();
    }
}
