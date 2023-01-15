package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(name = "auth_email")
    private WebElement loginField;

    @FindBy(name = "auth_pass")
    private WebElement passwdField;

    @FindBy(name = "form_auth_submit")
    private WebElement loginBtn;

    public void inputLogin(String login) {
        loginField.sendKeys(login); }

    public void inputPass(String password) {
        passwdField.sendKeys(password); }

    public void clickLoginBtn() {
        loginBtn.click(); }
}
