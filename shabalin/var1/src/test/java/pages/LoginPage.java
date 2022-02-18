package pages;
import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage  extends BasePage {

    private static final By usernameFieldLocator = By.id("username");
    private static final By passwordFieldLocator = By.id("password");
    private static final By submitButtonLocator = By.id("sign-in-btn");

    public static void login(String username, String password){
        driver.get("https://identity.getpostman.com/login");
        WebElement usernameField =
                wait.until(ExpectedConditions.visibilityOf(driver.findElement(usernameFieldLocator)));
        WebElement passwordField =
                wait.until(ExpectedConditions.visibilityOf(driver.findElement(passwordFieldLocator)));
        WebElement submitButton =
                wait.until(ExpectedConditions.visibilityOf(driver.findElement(submitButtonLocator)));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        submitButton.click();
    }
}
