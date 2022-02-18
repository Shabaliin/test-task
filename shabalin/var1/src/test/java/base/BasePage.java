package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

abstract public class BasePage {
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
        setWait(driver);
    }

    private static void setWait(WebDriver driver) {
        wait = new WebDriverWait(driver, 20);
    }
}
