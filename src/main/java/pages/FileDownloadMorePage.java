package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FileDownloadMorePage {
    private WebDriver driver;

    public FileDownloadMorePage(WebDriver driver) {
        this.driver = driver;
    }

    public void skipSignInButton() {
        driver.findElement(By.id("btn2")).click();
    }
    public void fileDownloadSection() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[9]/a")).click();
        Actions releaseWidgets = new Actions(driver);
        WebElement select = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[9]/a"));
        releaseWidgets.moveToElement(select).moveToElement(driver.findElement(By.linkText("File Download"))).click().build().perform();
    }
    public void writeTxtBox(){
        driver.findElement(By.id("textbox")).click();
        driver.findElement(By.id("textbox")).clear();
        driver.findElement(By.id("textbox")).sendKeys("Prove to download a file in txt :D");
    }
    public void generateFileTxt(){
        driver.findElement(By.id("createTxt")).click();
    }
    public void downloadFileTxt(){
        driver.findElement(By.id("link-to-download")).click();
    }
    public void writePdfBox(){
        driver.findElement(By.id("pdfbox")).click();
        driver.findElement(By.id("pdfbox")).clear();
        driver.findElement(By.id("pdfbox")).sendKeys("Prove to download a file in pdf :D");
    }
    public void generateFilePdf(){
        driver.findElement(By.id("createPdf")).click();
    }
    public void downloadFilePdf(){
        driver.findElement(By.id("pdf-link-to-download")).click();
    }
}
