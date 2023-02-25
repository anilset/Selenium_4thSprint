package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Utilities {
    public static final String URL = "https://qa-scooter.praktikum-services.ru/";

    public void setUpChrome(WebDriver driver) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        driver.manage().window().maximize();
    }

    public void setUpFireFox(WebDriver driver) {
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
        driver.manage().window().maximize();
    }

    public void standardWait(WebDriver driver, int seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }

    public void waitUntilVisibility(WebDriver driver, By locator) {
        new WebDriverWait(driver, Duration.ofSeconds(3)).
                until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void setUpChromeBonigarcia(WebDriver driver) {
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
    }

    public void setUpFireFoxBonigarcia(WebDriver driver) {
        WebDriverManager.firefoxdriver().setup();
        driver.manage().window().maximize();

    }
}
