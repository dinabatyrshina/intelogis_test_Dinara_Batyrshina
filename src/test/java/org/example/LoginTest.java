package org.example;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    public static LoginPage loginPage;
    public static UserAge userAge;
    public static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", Const.DRIVER_PATH);
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        userAge = new UserAge(driver);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Const.URL);
    }
    @Test
    public void loginTest() {
        loginPage.inputLogin(Const.USERNAME);
        loginPage.inputPass(Const.PASS);
        loginPage.clickLoginBtn();
        userAge.clickRadio18();
        userAge.clickSubmitBtn();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

}
