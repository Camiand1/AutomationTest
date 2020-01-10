package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class AlertsSwitchToPage {


    private WebDriver driver;

    public AlertsSwitchToPage(WebDriver driver) {
        this.driver = driver;
    }

    public void skipSignInButton() {
        driver.findElement(By.id("btn2")).click();
    }

    public void alertSection() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a")).click();
        Actions releaseWidgets = new Actions(driver);
        WebElement select = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a"));
        releaseWidgets.moveToElement(select).moveToElement(driver.findElement(By.linkText("Alerts"))).click().build().perform();
    }

    public void buttonOkAlertBox(){
        driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
    }
    public void okAlertButton(){
        Alert alert = driver.switchTo().alert();
        driver.switchTo().alert().accept();
    }
    public void alertWithOkCancel(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
    }
    public void buttonCancelAlertBox(){
        driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
    }
    public void cancelAlertButton() {
        Alert alert = driver.switchTo().alert();
        driver.switchTo().alert().dismiss();
    }
    public void buttonAlertWithText(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
    }
    public void buttonDisplayBox(){
        driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
    }
    public void textAlertButton(String textBox) {
        Alert alert = driver.switchTo().alert();
        driver.switchTo().alert().sendKeys(textBox);
        driver.switchTo().alert().accept();
    }
}
