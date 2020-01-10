package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class WebTablesPage {

    private WebDriver driver;

    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void webTablesSection() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[3]/a")).click();
    }

    public void passPage() {
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='/'])[1]/following::button[1]")).click();
    }

    public void deleteUser8Page5() {
        Actions action1 = new Actions(driver);
        action1.contextClick(driver.findElement(By.xpath("//*[contains(@id,'-7-uiGrid-000B-cell')]/user-click-select/div[1]/del-click/button"))).build().perform(); //contains: que contenga parte del xpath //*[@id="1577375070552-7-uiGrid-000B-cell"]/user-click-select/div[1]/del-click/button/i
        driver.findElement(By.xpath("//*[contains(@id, '-7-uiGrid-000B-cell')]/user-click-select/div[1]/div/ul/li[1]/button")).click();
        Alert alert1 = driver.switchTo().alert();
        driver.switchTo().alert().accept();
    }

    public void deleteUser4page6() {
        Actions action2 = new Actions(driver);
        action2.contextClick(driver.findElement(By.xpath("//*[contains(@id,'-3-uiGrid-000B-cell')]/user-click-select/div[1]/del-click/button"))).build().perform();
        driver.findElement(By.xpath("//*[contains(@id,'-3-uiGrid-000B-cell')]/user-click-select/div[1]/div/ul/li[1]")).click();
        Alert alert2 = driver.switchTo().alert();
        driver.switchTo().alert().accept();
    }

    public void deleteUser10page8() {
        Actions action2 = new Actions(driver);
        action2.contextClick(driver.findElement(By.xpath("//*[contains(@id,'-9-uiGrid-000B-cell')]/user-click-select/div[1]/del-click/button"))).build().perform();
        driver.findElement(By.xpath("//*[contains(@id,'-9-uiGrid-000B-cell')]/user-click-select/div[1]/div/ul/li[1]")).click();
        Alert alert3 = driver.switchTo().alert();
        driver.switchTo().alert().accept();
    }
}