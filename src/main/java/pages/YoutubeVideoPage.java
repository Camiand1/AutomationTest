package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class YoutubeVideoPage {

    private WebDriver driver;

    public YoutubeVideoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void skipSignInButton() {
        driver.findElement(By.id("btn2")).click();
    }
    public void youtubeVideoSection(){
        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[7]/a")).click();
        Actions releaseWidgets = new Actions(driver);
        WebElement select = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[7]/a"));
        releaseWidgets.moveToElement(select).moveToElement(driver.findElement(By.linkText("Youtube"))).click().build().perform();
    }
    public void playButton(){
        driver.get("https://youtu.be/wPECeNP1BoY");
    }
    public void maximazeVideo(){
        driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[25]/div[2]/div[2]/button[9]")).click();
    }
}