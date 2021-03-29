import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSet.getDriver();
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
