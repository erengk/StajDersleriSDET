package Ders4;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_Ders extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://www.amazon.com.tr/");

        WebElement dropDownMenu = driver.findElement(By.id("searchDropdownBox"));
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        Select ddMenu = new Select(dropDownMenu);
        ddMenu.selectByVisibleText("Ev");
        //ddMenu.selectByIndex(2);
        //ddMenu.selectByValue("search-alias=mi");

        searchBox.sendKeys("paspas");
        WebElement submitBtn = driver.findElement(By.id("nav-search-submit-button"));
        submitBtn.click();

        //String urlDeger = driver.getCurrentUrl();
        //Assert.assertTrue("paspas bulunamadı!", urlDeger.contains("paspas"));
        Assert.assertTrue("paspas bulunamadı", driver.getCurrentUrl().contains("paspas"));
        //ddMenu.selectByIndex(1);
        //System.out.println("ddMenu.toString() = " + ddMenu.getOptions().size());
        BekleKapat();
    }
}
