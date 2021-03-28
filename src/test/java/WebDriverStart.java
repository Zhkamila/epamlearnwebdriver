import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class WebDriverStart {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://translate.google.com/?sl=en&tl=ru&op=translate");

        WebElement textArea = driver.findElement(By.xpath("//*[@aria-label='Source text']"));
        textArea.sendKeys("Awesome");
        Thread.sleep(2000);

        WebElement switchBtn = driver.findElement(By.xpath("//*[@aria-label='Swap languages (Ctrl+Shift+S)']"));
        switchBtn.click();
        Thread.sleep(2000);

        driver.quit();
    }
}
