import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Soru_03 extends BaseDriver {
    /*
        1) Bu siteye gidin. -> https://www.snapdeal.com/
        2) "teddy bear" aratın ve Search butonuna tıklayın.
        3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
        Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.
     */
    @Test
    public void Test3(){
        driver.get("https://www.snapdeal.com/");
        MyFunc.Wait(2);
        WebElement search = driver.findElement(By.cssSelector("[id='inputValEnter']"));
        search.sendKeys("teddy bear");
        MyFunc.Wait(2);
        WebElement searchButton = driver.findElement(By.cssSelector("[class='searchformButton col-xs-4 rippleGrey']"));
        searchButton.click();
        MyFunc.Wait(2);

        WebElement result = driver.findElement(By.cssSelector("[id='searchMessageContainer']>div>span"));
        System.out.println(result.getText());
        Assert.assertTrue(result.getText().contains("We've got 97 results for teddy bear"));
        System.out.println(result.getText()+2);
        tearDown();
    }
}
