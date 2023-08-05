package Ders9;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.Dimension;

public class _03_Ders extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        MyFunctions.Bekle(4);

        Dimension yeniBoyut = new Dimension(516,600);
        driver.manage().window().setSize(yeniBoyut);
        MyFunctions.Bekle(3);

        BekleKapat();
    }
}
