package Ders2;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Ders extends BaseDriver {
    public static void main(String[] args) {
        //http://www.dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html
        driver.get("https://www.snapdeal.com/");

        WebElement searchBox = driver.findElement(By.id("inputValEnter"));

        System.out.println("searchBox.getCssValue(\"color\") = " + searchBox.getCssValue("color"));
        System.out.println("searchBox.getCssValue(\"font-size\") = " + searchBox.getCssValue("font-size"));
        System.out.println("searchBox.getAttribute(\"name\") = " + searchBox.getAttribute("name"));
        System.out.println("searchBox.getCssValue(\"height\") = " + searchBox.getCssValue("height"));
        System.out.println("searchBox.getCssValue(\"background-color\") = " + searchBox.getCssValue("background-color"));
        System.out.println("searchBox.getCssValue(\"font-family\") = " + searchBox.getCssValue("font-family"));

        BekleKapat();
    }
}
