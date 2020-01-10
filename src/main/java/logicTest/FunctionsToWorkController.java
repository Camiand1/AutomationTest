package logicTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.*;

public class FunctionsToWorkController {

    private WebDriver driver;

    public FunctionsToWorkController(WebDriver driver) {
        this.driver = driver;
    }

    public void inputRegister() throws InterruptedException {

        AutomationTestingIndexPage index = new AutomationTestingIndexPage(driver);
        index.emailId("camiigamboa1@hotmail.com");
        index.goAhead(driver);
        RegisterTestingPage register = new RegisterTestingPage(driver);
        String registerUrl = driver.getCurrentUrl();
        String registerTitle = driver.getTitle();
        if (registerTitle.equals("Register")) {
            System.out.println("You are in register page");
            System.out.println("Actually page: " + registerTitle + " Actually URL " + registerUrl);
            register.setFirstName("Camila Andrea");
            register.setLastName("Gamboa Guerrero");
            register.setAddress("Parque Belen");
            register.setEmail("camiigamboa1@hotmail.com");
            register.setPhone("3204843621");
            register.setFemaleGender();
            register.setHobbie();
            register.setLanguages();
            register.setSkills();
            register.setCountry();
            register.setBirth();
            register.setPassword("Caggrp-1009");
            register.clickSubmint();
        } else {
            System.out.println("You are'nt go in on Register page");
            driver.navigate().back();
            Thread.sleep(5000);
            driver.quit();
        }
        Thread.sleep(5000);
        driver.quit();
    }

    public void inputWebTables() throws InterruptedException {
        AutomationTestingIndexPage skipSignIn = new AutomationTestingIndexPage(driver);
        skipSignIn.skipSignInButton();
        WebTablesPage webTables = new WebTablesPage(driver);
        webTables.webTablesSection();
        String webTableUrl = driver.getCurrentUrl();
        String webTableTitle = driver.getTitle();
        if (webTableTitle.equals("Web Table")) {
            System.out.println("You are in Web Table page");
            System.out.println("Actually page: " + webTableTitle + " Actually URL " + webTableUrl);
            webTables.passPage();
            Thread.sleep(2000);
            webTables.passPage();
            Thread.sleep(2000);
            webTables.passPage();
            Thread.sleep(2000);
            webTables.passPage();
            webTables.deleteUser8Page5();
            webTables.passPage();
            Thread.sleep(2000);
            webTables.deleteUser4page6();
            webTables.passPage();
            Thread.sleep(2000);
            webTables.passPage();
            Thread.sleep(2000);
            webTables.deleteUser10page8();
            Thread.sleep(2000);
        } else {
            System.out.println("You are not in Web Table page");
            driver.navigate().back();
            Thread.sleep(5000);
            driver.quit();
        }
        Thread.sleep(5000);
        driver.quit();
    }

    public void inputAccordingWidget() throws InterruptedException {

        AccordionWidgetsPage accordionTeste = new AccordionWidgetsPage(driver);
        accordionTeste.skipSignInButton();
        Thread.sleep(2000);
        accordionTeste.accordingSection();
        Thread.sleep(1000);
        String accordingsUrl = driver.getCurrentUrl();
        String accordingTitle = driver.getTitle();
        if (accordingTitle.equals("Accordion")) {
            System.out.println("You are in -Accordion Widgets-");
            System.out.println("Actually page: " + accordingTitle + " Actually URL " + accordingsUrl);
            accordionTeste.clickGroup2();
            Thread.sleep(1000);
            accordionTeste.clickGroup3();
            Thread.sleep(1000);
            accordionTeste.clickGroup4();
            Thread.sleep(1000);
            accordionTeste.clickGroup1();
            Thread.sleep(1000);
            accordionTeste.clickGroup2();
            Thread.sleep(1000);
            accordionTeste.clickGroup3();
            Thread.sleep(1000);
            accordionTeste.clickGroup4();
        }else{
            System.out.println("Your are not in Accordion Widgets");
            driver.navigate().back();
            Thread.sleep(5000);
            driver.quit();
        }
        Thread.sleep(5000);
        driver.quit();
    }
    public void inputAlertsSwitchTo() throws InterruptedException {
        AlertsSwitchToPage alertsSwitchTo = new AlertsSwitchToPage(driver);
        alertsSwitchTo.skipSignInButton();
        alertsSwitchTo.alertSection();
        alertsSwitchTo.buttonOkAlertBox();
        Thread.sleep(2000);
        alertsSwitchTo.okAlertButton();
        alertsSwitchTo.alertWithOkCancel();
        Thread.sleep(2000);
        alertsSwitchTo.buttonCancelAlertBox();
        Thread.sleep(2000);
        alertsSwitchTo.cancelAlertButton();
        alertsSwitchTo.buttonAlertWithText();
        Thread.sleep(2000);
        alertsSwitchTo.buttonDisplayBox();
        Thread.sleep(2000);
        alertsSwitchTo.textAlertButton("Camila Andrea");
        Thread.sleep(5000);
        driver.quit();
    }
    public String[] inputResizableInteraction() throws InterruptedException{
        String arrayActual[]=new String[7];


        SelectableInteractionsPage selectableTest = new SelectableInteractionsPage(driver);
        selectableTest.skipSignInButton();
        selectableTest.selectableSection();
        selectableTest.serializeButton();
        Thread.sleep(2000);

        selectableTest.readability();
        arrayActual[0]= driver.findElement(By.id("result")).getText();
        Thread.sleep(2000);

        selectableTest.singleLine();
        arrayActual[1]= driver.findElement(By.id("result")).getText();
        Thread.sleep(2000);

        selectableTest.methodChaining();
        arrayActual[2]= driver.findElement(By.id("result")).getText();
        Thread.sleep(2000);

        selectableTest.croosBrowser();
        arrayActual[3]= driver.findElement(By.id("result")).getText();
        Thread.sleep(2000);

        selectableTest.extentReports();
        arrayActual[4]= driver.findElement(By.id("result")).getText();
        Thread.sleep(2000);

        selectableTest.dataDriven();
        arrayActual[5]= driver.findElement(By.id("result")).getText();
        Thread.sleep(2000);

        selectableTest.functional();
        arrayActual[6]= driver.findElement(By.id("result")).getText();
        Thread.sleep(2000);

        Thread.sleep(2000);
        return arrayActual;
    }



    public void inputWindowsSwitchTo() throws Exception{
        WindowsSwitchPage windowsTest = new WindowsSwitchPage(driver);
        windowsTest.skipSignInButton();
        windowsTest.autocompleteSection();
        Thread.sleep(2000);
        windowsTest.clickOpenWindow();
        Thread.sleep(2000);
        windowsTest.sakinaliumPage();
        windowsTest.contact();
        windowsTest.writeName();
        windowsTest.writeEmail();
        windowsTest.writeSubject();
        windowsTest.writeMessage();
        windowsTest.send();
        Thread.sleep(5000);
        String messageSent = driver.findElement(By.xpath("//*[@id=\"success\"]/div/strong")).getText();
        if (messageSent.equals("Your message has been sent.")) {
            System.out.println("Chech! " + messageSent);
        } else {
            System.out.println("You are in other part of the page");
            Thread.sleep(5000);
            driver.quit();
        }
        Thread.sleep(5000);
        driver.quit();
    }
    public void inputYoutubeVideo() throws Exception{
        YoutubeVideoPage testYoutube = new YoutubeVideoPage(driver);
        testYoutube.skipSignInButton();
        testYoutube.youtubeVideoSection();
        Thread.sleep(2000);
        testYoutube.playButton();
        Thread.sleep(2000);
        testYoutube.maximazeVideo();
        Thread.sleep(20000);
        testYoutube.maximazeVideo();
        Thread.sleep(5000);
        driver.quit();
    }
    public void inputDynamicData() throws Exception{
        DynamicDataMorePage dynamicData = new DynamicDataMorePage(driver);
        dynamicData.skipSignInButton();
        dynamicData.dinamicDataSection();
        dynamicData.buttonGetDynamicData();
        Thread.sleep(3000);
        dynamicData.getFirstName();
        Thread.sleep(5000);
        driver.quit();
    }
    public void inputFileDownload()throws Exception{
        FileDownloadMorePage fileDownload = new FileDownloadMorePage(driver);
        fileDownload.skipSignInButton();
        fileDownload.fileDownloadSection();
        Thread.sleep(1000);
        fileDownload.writeTxtBox();
        Thread.sleep(1000);
        fileDownload.generateFileTxt();
        Thread.sleep(1000);
        fileDownload.downloadFileTxt();
        Thread.sleep(1000);
        fileDownload.writePdfBox();
        Thread.sleep(1000);
        fileDownload.generateFilePdf();
        Thread.sleep(1000);
        fileDownload.downloadFilePdf();
        Thread.sleep(5000);
        driver.quit();
    }
    public void inputShopPracticeSite() throws Exception{
        PracticeSitePage practiceSite = new PracticeSitePage(driver);
        practiceSite.skipSignInButton();
        practiceSite.practiceSiteSection();
        practiceSite.shopSection();
        Thread.sleep(1000);
        practiceSite.seleniumCategory();
        Thread.sleep(2000);
        practiceSite.addSeleniumRubyAtBasket();
        Thread.sleep(2000);
        practiceSite.seeBasket();
        String seleniumRuby = driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[3]/a")).getText();
        if (seleniumRuby.equals("Selenium Ruby")) {
            System.out.println("On the basket there are " + seleniumRuby);
            Thread.sleep(5000);
        } else {
            System.out.println("You are in other part of the page");
            Thread.sleep(5000);
            driver.quit();
        }
        Thread.sleep(5000);
        driver.quit();
    }
}
