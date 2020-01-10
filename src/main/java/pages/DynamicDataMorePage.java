package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DynamicDataMorePage {
    private WebDriver driver;

    public DynamicDataMorePage(WebDriver driver) {
        this.driver = driver;
    }

    public void skipSignInButton() {
        driver.findElement(By.id("btn2")).click();
    }

    public void dinamicDataSection() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[9]/a")).click();
        Actions releaseWidgets = new Actions(driver);
        WebElement select = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[9]/a"));
        releaseWidgets.moveToElement(select).moveToElement(driver.findElement(By.linkText("Dynamic Data"))).click().build().perform();
    }
    public void buttonGetDynamicData(){
        driver.findElement(By.id("save")).click();
    }
    public void getFirstName(){
        String getUser = driver.findElement(By.id("loading")).getText();
        System.out.println("User: " + getUser);
    }
}
