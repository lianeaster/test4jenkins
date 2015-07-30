import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by ademenkova on 7/27/2015.
 */
public class Smple {
    @Test
    public void checkIfGoogleSearchAWord() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com.ua");
        WebElement element = driver.findElement(By.id("lst-ib"));
        element.sendKeys("foo bar");
        WebElement button = driver.findElement(By.className("lsb"));
        button.click();
        Thread.sleep(2000);
        WebElement firstLink = driver.findElement(By.xpath("//*[@id='rso']/div[2]/div[1]/div/div/div/span"));
        Assert.assertEquals(firstLink.isEnabled(), true);
        driver.close();
    }
}
