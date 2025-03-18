import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru_01 extends BaseDriver {
    /*
  1) Bu siteye gidin. -> http://demoqa.com/text-box
  2) Full Name kısmına "Automation" girin.
  3) Email kısmına "Testing@gmail.com" girin.
  4) Current Address kısmına "Testing Current Address" girin.
  5) Permanent Address kısmına "Testing Permanent Address" girin.
  6) Submit butonuna tıklayınız.
  7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
  8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.
*/
    @Test
    public void Test1() {


        driver.get("http://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.cssSelector("[id='userName']"));
        fullName.sendKeys("Automation");
        MyFunc.Wait(1);
        WebElement email = driver.findElement(By.cssSelector("[id='userEmail']"));
        email.sendKeys("Testing@gmail.com");
        MyFunc.Wait(1);
        WebElement currentAddress = driver.findElement(By.cssSelector("[id='currentAddress']"));
        currentAddress.sendKeys("Testing Current Address");
        MyFunc.Wait(1);
        WebElement permanentAddress = driver.findElement(By.cssSelector("[id='permanentAddress']"));
        permanentAddress.sendKeys("Testing Permanent Address");
        MyFunc.Wait(1);
        WebElement submitButton = driver.findElement(By.cssSelector("[id='submit']"));
        submitButton.click();
        MyFunc.Wait(1);
        WebElement name = driver.findElement(By.cssSelector("[id='name']"));
        Assert.assertTrue(name.getText().contains("Automation"));
        WebElement email2 = driver.findElement(By.cssSelector("[id='email']"));
        Assert.assertTrue(email2.getText().contains("Testing"));

        tearDown();

    }
}
