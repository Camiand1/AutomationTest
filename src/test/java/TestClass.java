import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestClass {
    String firstName = "Camila Andrea";
    String lastName = "Gamboa Guerrero";
    @Test
    public void webDriverChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://toolsqa.com/Automation-practice-form/");
        String firstName = "Camila Andrea";
        String lastName = "Gamboa Guerrero";

        // Maximize the window
        driver.manage().window().maximize();

        //Wait 10 seconds to the page recharge
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Type Name in the FirstName text box
        driver.findElement(By.name("firstname")).sendKeys(firstName);

        //Type LastName in the LastName text box
        driver.findElement(By.id("lastname")).sendKeys(lastName);

        // Click on the Submit button
        driver.findElement(By.id("buttonwithclass")).click();

         //Wait 10 seconds to the page recharge
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Select the deselected Radio button for category Sex
        List<WebElement> rdButtonSex = driver.findElements(By.id("sex-1"));

        // Create a boolean variable which will hold the value (True/False)
        boolean valueButtonSex = false;

        // This statement will return True, in case of first Radio button (Make) is selected
        valueButtonSex = rdButtonSex.get(0).isSelected();

        // Will check if the valueButtonSex is True means if the first radio button is selected(Male)
        if(valueButtonSex == true){
            // This will select Second radio button (Female), if the first radio button is selected by default
            rdButtonSex.get(1).click();
        }else{
            // If the first radio button is not selected by default, the first will be selected (Male)
            rdButtonSex.get(0).click();
        }
        // Select option 2 of Years of experience
        driver.findElement(By.id("exp-2")).click();

        // Step 6: Check the Check Box 'Selenium IDE' for category 'Automation Tool' (Use cssSelector)
        driver.findElement(By.id("tool-1")).click();





        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        String actualUrl = driver.getCurrentUrl();
        String pageSource = driver.getPageSource();
        int pageSourceLength = pageSource.length();

        //driver.findElement(By.xpath(".//*[@id=\"NavigationBar\"]/div/nav/li[5]/button/span/p")).click();
        // Go back to Home Page
        //driver.navigate().back();

        // Go forward to Registration page
        //driver.navigate().forward();

        // Go back to Home page
        //driver.navigate().to(url);

        // Refresh browser
        //driver.navigate().refresh();


        //driver.quit();

        System.out.println("Title of the page is : " + title);
        System.out.println("URL of the page is : " + url);
        System.out.println("Total length of the Pgae Source is : " + pageSourceLength);


        if (actualUrl.equals(url)) {
            System.out.println("Verification Successful - The correct Url is opened.");
        } else {
            System.out.println("Verification Failed - An incorrect Url is opened.");
            System.out.println("Actual URL is : " + actualUrl);
            System.out.println("Expected URL is : " + url);
        }

    }
   /* public void methods(){
        assert
    }

    */
}
