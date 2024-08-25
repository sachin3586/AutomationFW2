import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import testbase.WebTestBase;

public class LoginTest extends WebTestBase {

    public LoginPage loginPage;
    public LoginTest(){
        super();
    }
    @BeforeMethod
    public void beforeMethod(){

        initialization();
        loginPage=new LoginPage();

    }
    @Test(description ="verify login with valid username and  valid password")
    public void verifyLogin(){
        SoftAssert softAssert=new SoftAssert();
        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        softAssert.assertEquals(loginPage.titlePage(),"MY ACCOUNT HOMEPAGE","text should be MY ACCOUNT HOME PAGE");
        softAssert.assertAll();
    }
    @Test(description = "verify login with valid username and invalid password")
        public void verifyLoginWithValidUsernameAndInvalidPassword(){
        SoftAssert softAssert=new SoftAssert();
        loginPage.login(prop.getProperty("username"), prop.getProperty("invalidpassword"));
        softAssert.assertEquals(loginPage.titlePage(),"The password that you've entered is incorrect.");
        softAssert.assertAll();


    }

    @AfterMethod
    public void afterMethod(){
        driver.close();

    }



}
