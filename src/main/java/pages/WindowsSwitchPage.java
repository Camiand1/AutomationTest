package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WindowsSwitchPage {
    private WebDriver driver;
    private static By name = By.id("name");
    private static By email = By.id("email");
    private static By subject = By.id("subject");
    private static By message = By.id("message");

    public WindowsSwitchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void skipSignInButton() {
        driver.findElement(By.id("btn2")).click();
    }
    public void autocompleteSection(){
        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a")).click();
        Actions releaseWidgets = new Actions(driver);
        WebElement select = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a"));
        releaseWidgets.moveToElement(select).moveToElement(driver.findElement(By.linkText("Windows"))).click().build().perform();
    }
    public void clickOpenWindow() throws Exception{
        driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
    }
    public void sakinaliumPage(){
        driver.get("http://www.sakinalium.in/");
    }
    public void contact(){

        driver.findElement(By.xpath("//*[@id=\"container\"]/header/div/div/div[2]/ul/li[4]/a")).click();
    }
    public void writeName() throws Exception{

        driver.findElement(name).clear();
        driver.findElement(name).sendKeys("Camila Andrea Gamboa");
        Thread.sleep(2000);
    }
    public void writeEmail() throws Exception{
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys("camila.gamboa@sofka.com.co");
        Thread.sleep(2000);
    }
    public void writeSubject() throws Exception{
        driver.findElement(subject).clear();
        driver.findElement(subject).sendKeys("Automation Test");
        Thread.sleep(2000);
    }
    public void writeMessage() throws Exception{
        driver.findElement(message).clear();
        driver.findElement(message).sendKeys("I am a prove XD");
    }
    public void send() {
        driver.findElement(By.id("submit")).click();
    }
}
