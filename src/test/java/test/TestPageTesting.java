package test;

import logicTest.FunctionsToWorkController;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class TestPageTesting {
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://demo.automationtesting.in/Index.html");
        driver.manage().window().maximize();

    }

    @Test
    public void testRegistePageTesting() throws InterruptedException {

        FunctionsToWorkController officialRegister = new FunctionsToWorkController(driver);
        officialRegister.inputRegister();
    }

    @Test
    public void testWebTables() throws InterruptedException {

        FunctionsToWorkController officialWebTable = new FunctionsToWorkController(driver);
        officialWebTable.inputWebTables();
    }

    @Test
    public void testAccordionWidgets() throws Exception {

        FunctionsToWorkController officialAccordingWisget = new FunctionsToWorkController(driver);
        officialAccordingWisget.inputAccordingWidget();
    }

    @Test
    public void testAlertsSwitchTo() throws Exception {
        FunctionsToWorkController officialAlertsSwitchTo = new FunctionsToWorkController(driver);
        officialAlertsSwitchTo.inputAlertsSwitchTo();
    }

    @Test
    public void testSelectableInteraction() throws Exception {

        FunctionsToWorkController officialResizableInteraction = new FunctionsToWorkController(driver);
        String[] expected = officialResizableInteraction.inputResizableInteraction();
        assertEquals("Readability",expected[0]);
        Thread.sleep(2000);
        assertEquals("Single Line Coding",expected[1]);
        Thread.sleep(2000);
        assertEquals("Method Chaining",expected[2]);
        Thread.sleep(2000);
        assertEquals("Cross Browser Testing",expected[3]);
        Thread.sleep(2000);
        assertEquals("Extent Reports",expected[4]);
        Thread.sleep(2000);
        assertEquals("Data Driven Testing",expected[5]);
        Thread.sleep(2000);
        assertEquals("Functional Testing",expected[6]);
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void testAutocompleteWidgets() throws Exception {
        FunctionsToWorkController officialWindowsSwitchTo = new FunctionsToWorkController(driver);
        officialWindowsSwitchTo.inputWindowsSwitchTo();
    }

    @Test
    public void testYoutubeVideo() throws Exception{
        FunctionsToWorkController officialYoutubeVideo = new FunctionsToWorkController(driver);
        officialYoutubeVideo.inputYoutubeVideo();
    }

    @Test
    public void testDynamicData() throws Exception{
        FunctionsToWorkController officialDynamicData = new FunctionsToWorkController(driver);
        officialDynamicData.inputDynamicData();
    }

    @Test
    public void testFileDownload()throws Exception{
        FunctionsToWorkController officialFileDownload = new FunctionsToWorkController(driver);
        officialFileDownload.inputFileDownload();
    }

    @Test
    public void testPracticeSite() throws Exception{
        FunctionsToWorkController offciailShopPracticeSite = new FunctionsToWorkController(driver);
        offciailShopPracticeSite.inputShopPracticeSite();
    }


    @Test
    public void exampleFluent() throws Exception {

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        Function<WebDriver, Boolean> function = driver -> {
            String style = driver.findElement(By.xpath("button[id='btn2']")).getText();
            if (style.equals("Skip Sign In")) {
                System.out.println("Passed");
                System.out.println("The button text has style :" + style);
                return true;
            }else{
                System.out.println("Didn't pass");
                return false;
            }
        };
        wait.until(function);
    }

}