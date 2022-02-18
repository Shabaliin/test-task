package pages;
import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    private static final By greetingLocator = By.className("homepage-greeting-header");

    public static String getGreetingText() {
        WebElement greeting = wait.until(ExpectedConditions.visibilityOf(driver.findElement(greetingLocator)));
        return greeting.getText();
    }
}
