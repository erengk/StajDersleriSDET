package OdevCozumleri;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _01_OdevCozumu extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

        List<WebElement> countries = driver.findElements(By.id("[class='destinationBox']"));
        List<WebElement> cities = driver.findElements(By.cssSelector("answerDiv"));

        Actions actions = new Actions(driver);
        for (int i = 0; i < cities.size(); i++) {
            for (int j = 0; j < countries.size(); j++) {

                actions.clickAndHold(cities.get(i)).build().perform();
                actions.moveToElement(countries.get(j)).release().build().perform();

                if (countries.get(j).getCssValue("background-color").equals("red") || countries.get(j).getText().equals(cities.get(i).getText())) {
                    actions.clickAndHold(countries.get(j)).build().perform();
                    actions.moveToElement(countries.get(j + 1)).release().build().perform();
                } else
                    continue;
            }
        }
        BekleKapat();
    }
}
