package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationTestingIndexPage {

    private WebDriver driver;

    public AutomationTestingIndexPage(WebDriver driver) {
        this.driver = driver;
    }

    public void emailId(String emailIndex) {
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(emailIndex);
    }

    public void skipSignInButton() {
        driver.findElement(By.id("btn2")).click();
    }

    public void goAhead(WebDriver driver) {
        driver.findElement(By.id("enterimg")).click();
    }
}