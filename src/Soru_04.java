import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru_04 extends BaseDriver {
/*
Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
Calculate'e tıklayınız.
İlk input'a herhangi bir sayı giriniz.
İkinci input'a herhangi bir sayı giriniz.
Calculate button'una tıklayınız.
Sonucu alınız.
Sonucu yazdırınız.
*/
    @Test
    public void Test4() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculate = driver.findElement(By.cssSelector("[href='calculator']> img"));
        calculate.click();

        WebElement firstInput = driver.findElement(By.cssSelector("[id='number1']"));
        firstInput.sendKeys("6");

        WebElement secondInput = driver.findElement(By.cssSelector("[id='number2']"));
        secondInput.sendKeys("5");

        WebElement calculateButton = driver.findElement(By.cssSelector("[id='calculate']"));
        calculateButton.click();

        WebElement result = driver.findElement(By.cssSelector("[id='answer']"));

        System.out.println(result.getText());
        Assert.assertTrue(result.getText().contains(String.valueOf(5 + 6)));
        System.out.println("gdhs");
    }
}
