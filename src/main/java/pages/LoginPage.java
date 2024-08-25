package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WaitUtil;
import util.WebDriverUtil;

public class LoginPage extends WebTestBase {

    @FindBy(xpath="//input[@type='text']")
    WebElement loginTextBox;

    @FindBy(id="pass")
    WebElement passwordTextBox;

    @FindBy(name="login")
    WebElement loginBtn;

    @FindBy(xpath="//a[text()='Forgotten password?']")
    WebElement paswordReset;

    public LoginPage(){
        PageFactory.initElements(driver,"this");
    }
    public void login(String userName,String password){

        WebDriverUtil.sendKeysToElement(loginTextBox,userName);
        WebDriverUtil.sendKeysToElement(passwordTextBox,password);
        WaitUtil.waitUntilElementToBeClickable(loginBtn);
        WebDriverUtil.clickElement(loginBtn);



    }
    public String titlePage(){
        String title = driver.getTitle();
        return title;
    }


}
