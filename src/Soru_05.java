import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Soru_05 extends BaseDriver {
    /*
     Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
     Fake Alerts' tıklayınız.
     Show Alert Box'a tıklayınız.
     Ok'a tıklayınız.
     Alert kapanmalıdır.
     */
    @Test
    public void Test5(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Wait(2);
        driver.findElement(By.cssSelector("[id='fakealerttest']")).click();
        MyFunc.Wait(2);
        driver.findElement(By.cssSelector("[id='fakealert']")).click();
        MyFunc.Wait(2);
        driver.findElement(By.cssSelector("[id='dialog-ok']")).click();
        MyFunc.Wait(2);
        tearDown();
    }




}
