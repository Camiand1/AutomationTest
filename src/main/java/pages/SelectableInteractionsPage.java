package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SelectableInteractionsPage {
    private WebDriver driver;

    public SelectableInteractionsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void skipSignInButton() {
        driver.findElement(By.id("btn2")).click();
    }

    public void selectableSection() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/a")).click();
        Actions releaseWidgets = new Actions(driver);
        WebElement select = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/a"));
        releaseWidgets.moveToElement(select).moveToElement(driver.findElement(By.linkText("Selectable"))).click().build().perform();
    }

    public void serializeButton(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
    }

    public void readability(){
        driver.findElement(By.xpath("//*[@id=\"Serialize\"]/ul/li[1]")).click();
    }
    public void singleLine(){
        driver.findElement(By.xpath("//*[@id=\"Serialize\"]/ul/li[2]")).click();
    }
    public void methodChaining(){
        driver.findElement(By.xpath("//*[@id=\"Serialize\"]/ul/li[3]")).click();
    }
    public void croosBrowser(){
        driver.findElement(By.xpath("//*[@id=\"Serialize\"]/ul/li[4]")).click();
    }
    public void extentReports(){
        driver.findElement(By.xpath("//*[@id=\"Serialize\"]/ul/li[5]")).click();
    }
    public void dataDriven(){
        driver.findElement(By.xpath("//*[@id=\"Serialize\"]/ul/li[6]")).click();
    }
    public void functional(){
        driver.findElement(By.xpath("//*[@id=\"Serialize\"]/ul/li[7]")).click();
    }
}