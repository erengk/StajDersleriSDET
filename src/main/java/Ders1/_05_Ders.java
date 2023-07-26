package Ders1;
import Utility.BaseDriver;
import Utility.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_Ders extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.hepsiburada.com/");

        WebElement siparislerimLinki = driver.findElement(By.linkText("Siparişlerim"));
        WebElement div = driver.findElement(By.id("oldHeader_f3a2e8e5-7b3f-4546-e9bd-10697d789f3c"));

        System.out.println(siparislerimLinki.getText());

        System.out.println("siparislerimLinki.getText() = " + siparislerimLinki.getText());

        System.out.println("siparislerimLinki.getAttribute(\"href\") = " + siparislerimLinki.getAttribute("href"));
        System.out.println("siparislerimLinki.getAttribute(\"title\") = " + siparislerimLinki.getAttribute("title"));
        System.out.println("siparislerimLinki.getAttribute(\"rel\") = " + siparislerimLinki.getAttribute("rel"));
        System.out.println("siparislerimLinki.getAttribute(\"voltran-hydrated\") = " + div.getAttribute("voltran-hydrated"));
        System.out.println("div.getAttribute(\"style\") = " + div.getAttribute("style"));
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
