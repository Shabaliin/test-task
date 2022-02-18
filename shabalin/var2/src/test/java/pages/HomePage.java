package pages;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {
    @FindBy(className = "homepage-greeting-header")
    private WebElement greeting;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void checkGreeting() {
        wait.until(ExpectedConditions.visibilityOf(greeting));
    }
}
