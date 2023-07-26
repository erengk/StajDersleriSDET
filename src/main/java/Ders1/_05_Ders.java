package Ders1;
import Utility.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_Ders {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        WebElement siparislerimLinki = driver.findElement(By.linkText("Siparişlerim"));

        System.out.println(siparislerimLinki.getText());
        System.out.println("siparislerimLinki.getText() = " + siparislerimLinki.getText());

        System.out.println("siparislerimLinki.getAttribute(\"href\") = " + siparislerimLinki.getAttribute("href"));
        System.out.println("siparislerimLinki.getAttribute(\"title\") = " + siparislerimLinki.getAttribute("title"));
        System.out.println("siparislerimLinki.getAttribute(\"rel\") = " + siparislerimLinki.getAttribute("rel"));
        System.out.println("------------------------------------");

        siparislerimLinki.click();

        try{
            WebElement superFiyat = driver.findElement(By.partialLinkText("Süper Fiyat"));
            System.out.println("superFiyat.getText() = " + superFiyat.getText());
            System.out.println("superFiyat.getAttribute(\"title\") = " + superFiyat.getAttribute("title"));
            System.out.println("superFiyat.getAttribute(\"href\") = " + superFiyat.getAttribute("href"));
        }catch (Exception e){
            System.out.println("WebElement Bulunamadı --> " + e.getMessage());
        }

        MyFunctions.Bekle(2);
        driver.quit();
    }
}
