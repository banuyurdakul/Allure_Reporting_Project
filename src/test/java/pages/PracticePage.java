package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class PracticePage {


    public PracticePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "menu-item-20")
    private WebElement practiceLinkHeadBar;

    @FindBy(xpath = "//a[text()='Test Login Page']")
    private WebElement testLoginPageLink;

    @FindBy(id = "username")
    private WebElement usernameTextBox;

    @FindBy(id = "password")
    private WebElement passwordTextBox;

    public WebElement getPracticeLinkHeadBar() {
        return practiceLinkHeadBar;
    }

    public WebElement getTestLoginPageLink() {
        return testLoginPageLink;
    }

    public WebElement getUsernameTextBox() {
        return usernameTextBox;
    }

    public WebElement getPasswordTextBox() {
        return passwordTextBox;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public WebElement getLogOutButton() {
        return logOutButton;
    }

    public WebElement getErrorText() {
        return errorText;
    }

    @FindBy(id = "submit")
    private WebElement submitButton;

    @FindBy(xpath = "//a[text()='Log out']")
    private WebElement logOutButton;

    @FindBy(id = "error")
    private WebElement errorText;


}
