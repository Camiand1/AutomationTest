package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AccordionWidgetsPage {

    private WebDriver driver;

    public AccordionWidgetsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void skipSignInButton() {
        driver.findElement(By.id("btn2")).click();
    }

    public void accordingSection() {

        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/a")).click();
        Actions releaseWidgets = new Actions(driver);
        WebElement select = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/a"));
        releaseWidgets.moveToElement(select).moveToElement(driver.findElement(By.linkText("Accordion"))).click().build().perform();
    }

    public void clickGroup1() {
        driver.findElement(By.xpath("//*[@id=\"Functionality\"]/div/div/div/div[1]/div[1]/h4/a")).click();
    }

    public void clickGroup2() {
        driver.findElement(By.xpath("//*[@id=\"Functionality\"]/div/div/div/div[2]/div[1]/h4/a")).click();
    }

    public void clickGroup3() {
        driver.findElement(By.xpath("//*[@id=\"Functionality\"]/div/div/div/div[3]/div[1]/h4/a")).click();
    }

    public void clickGroup4() {
        driver.findElement(By.xpath("//*[@id=\"Functionality\"]/div/div/div/div[4]/div[1]/h4/a")).click();
    }
}