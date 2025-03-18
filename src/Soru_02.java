import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru_02 extends BaseDriver {
/*
1) Bu siteye gidin. -> https://demo.applitools.com/
2) Username kısmına "ttechno@gmail.com" girin.
3) Password kısmına "techno123." girin.
4) "Sign in" buttonunan tıklayınız.
5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.
*/
    @Test
    public void Test2() {

        driver.get("https://demo.applitools.com/");

        WebElement username = driver.findElement(By.cssSelector("[id='username']"));
        username.sendKeys("ttechno@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("[id='password']"));
        password.sendKeys("techno123.");

        WebElement signIn = driver.findElement(By.cssSelector("[id='log-in']"));
        signIn.click();

        WebElement message = driver.findElement(By.cssSelector("[id='time']"));

        Assert.assertTrue(message.getText().contains("Your nearest branch closes in: 30m 5s"));

        tearDown();
    }
}
