package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAge {
    public WebDriver driver;
    public UserAge(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "/html/body/form/ol/li[1]/input")
    private WebElement radio18;

    @FindBy(xpath = "/html/body/form/input")
    private WebElement submitBtn;

    public void clickRadio18() {
        radio18.click();
    }

    public void clickSubmitBtn() {
        submitBtn.click();
    }

}
