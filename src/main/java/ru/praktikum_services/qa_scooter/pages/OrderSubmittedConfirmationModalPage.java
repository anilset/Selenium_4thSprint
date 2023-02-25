package ru.praktikum_services.qa_scooter.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.List;

public class OrderSubmittedConfirmationModalPage {

    private WebDriver driver;
    private static By viewStatusButton = By.xpath("//button[text()='Посмотреть статус']");

    public OrderSubmittedConfirmationModalPage (WebDriver driver) {
        this.driver = driver;
    }
    public void clickStatusButton() {
        driver.findElement(viewStatusButton).isEnabled();
        driver.findElement(viewStatusButton).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public static By getStatusButton() {
        return viewStatusButton;
    }

    public int getStatusButtonSize() {
       List<WebElement> buttons = driver.findElements(viewStatusButton);
       return buttons.size();
    }

}
