import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class TestLogin extends BaseTest {

    @Test
    public void verificationLogin() {
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
        loginPage.login(System.getProperty("username"), System.getProperty("password"));
        homePage.checkGreeting();
    }
}
