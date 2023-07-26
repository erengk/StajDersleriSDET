package Ders2;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class _01_Ders extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.hepsiburada.com/");

        List<WebElement> linkler = driver.findElements(By.tagName("a"));
        int listeBuyuklugu = linkler.size();
        System.out.println("listeBuyuklugu = " + listeBuyuklugu);

        for (WebElement e: linkler){
            if (e.getText().isEmpty()){
                System.out.println("e.getAttribute(\"href\") = " + e.getAttribute("href"));
                System.out.println("e.getAttribute(\"title\") = " + e.getAttribute("title"));
                System.out.println("e.getAttribute(\"rel\") = " + e.getAttribute("rel"));

            }
        }

        BekleKapat();
    }
}
