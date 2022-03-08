import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class FrontPage   implements PageObject{
    private final By BUTTON_LOGOUT =By.cssSelector("a.button.secondary");
    private WebDriver driver;


    public FrontPage(WebDriver driver) {
        this.driver=driver;
    }
    public PageObject logoutUserAccount(){


        driver.findElement(BUTTON_LOGOUT).click();
        if (driver.getCurrentUrl().equals("http://the-internet.herokuapp.com/secure"))
            return this;
        else return new LoginPage(driver);
    }
}