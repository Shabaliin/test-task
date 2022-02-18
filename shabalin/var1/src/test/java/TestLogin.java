import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class TestLogin extends BaseTest {

    @Test
    public void loginCheck() {
        LoginPage.login(System.getProperty("username"), System.getProperty("password"));
        HomePage.getGreetingText();
    }
}