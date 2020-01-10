package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticeSitePage {
    private WebDriver driver;

    public PracticeSitePage(WebDriver driver) {
        this.driver = driver;
    }

    public void skipSignInButton() {
        driver.findElement(By.id("btn2")).click();
    }

    public void practiceSiteSection() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[10]/a")).click();
    }
    public void shopSection(){
        driver.findElement(By.xpath("//*[@id=\"menu-item-40\"]/a")).click();
    }
    public void seleniumCategory(){
        driver.findElement(By.xpath("//*[@id=\"woocommerce_product_categories-2\"]/ul/li[4]/a")).click();
    }
    public void addSeleniumRubyAtBasket(){
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li/a[2]")).click();
    }
    public void seeBasket(){
        driver.findElement(By.id("wpmenucartli")).click();
    }
}
