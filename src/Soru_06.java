import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;

public class Soru_06 extends BaseDriver {
          /*
       Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html
       Fake Alerts'e tıklayınız.
       Show modal dialog buttonuna tıklayınız.
       Ok'a tıklayınız.
       Alert kapanmalıdır.
            */
    @Test
    public void Test6(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Wait(2);
        driver.findElement(By.cssSelector("[id='fakealerttest']")).click();
        MyFunc.Wait(2);
        driver.findElement(By.cssSelector("[id='modaldialog']")).click();
        MyFunc.Wait(2);
        driver.findElement(By.cssSelector("[id='dialog-ok']")).click();
        MyFunc.Wait(2);
        tearDown();
    }

}
