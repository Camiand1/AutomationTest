/*
public class ExerciseTesting {

    private WebDriver driver;
    private boolean acceptNextAlert = true;
    String first_Name = "Camila Andrea";
    String last_Name = "Gamboa Guerrero";
    String address = "Parque Belen";

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @Test
    public void TestingIndex() throws InterruptedException {


        driver.get("http://demo.automationtesting.in/Index.html");
        driver.manage().window().maximize();
        AutomationTestingIndex goIn = new AutomationTestingIndex();
        goIn.emailId(driver).click();
        goIn.emailId(driver).clear();
        goIn.emailId(driver).sendKeys("camila.gamboa@sofka.com.co");
        goIn.goAhead(driver).click();
    }

    @Test
    public void TestingRegisterx() throws InterruptedException {

        driver.get("http://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        AutomationTestingRegister register = new AutomationTestingRegister();
        register.registerUser(firstName).clear();
        register.firstName(driver).sendKeys(first_Name);
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Gamboa Guerrero");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Address'])[1]/following::textarea[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Address'])[1]/following::textarea[1]")).sendKeys("Parque Belen");
        driver.findElement(By.xpath("//input[@type='email']")).clear();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("camila.gamboa@sofka.com.co");
        driver.findElement(By.xpath("//input[@type='tel']")).clear();
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("3204843621");
        driver.findElement(By.xpath("(//input[@name='radiooptions'])[2]")).click();
        driver.findElement(By.id("checkbox2")).click();
        driver.findElement(By.id("msdd")).click();
        driver.findElement(By.linkText("English")).click();
        driver.findElement(By.linkText("Spanish")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"section\"]/div/div")).click();
        driver.findElement(By.id("Skills")).click();
        new Select(driver.findElement(By.id("Skills"))).selectByVisibleText("Java");
        driver.findElement(By.id("countries")).click();
        new Select(driver.findElement(By.id("countries"))).selectByVisibleText("Colombia");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[11]")).click();
        driver.findElement(By.id("yearbox")).click();
        new Select(driver.findElement(By.id("yearbox"))).selectByVisibleText("1996");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"))).selectByVisibleText("May");
        driver.findElement(By.id("daybox")).click();
        new Select(driver.findElement(By.id("daybox"))).selectByVisibleText("27");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date Of Birth'])[1]/following::div[4]")).click();
        driver.findElement(By.id("firstpassword")).sendKeys("Caggrp-1009");
        driver.findElement(By.id("secondpassword")).sendKeys("Caggrp-1009");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("submitbtn")).click();

    }

    @Test
    public void WebDriverChrometestingWebTables() throws InterruptedException {

        driver.get("http://demo.automationtesting.in/WebTable.html");

        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='/'])[1]/following::button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='/'])[1]/following::button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='/'])[1]/following::button[1]")).click();
        Thread.sleep(2000);
        acceptNextAlert = true;
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='shor'])[2]/following::button[3]")).click();
        assertEquals("Delete the record permanently", closeAlertAndGetItsText());
        driver.findElement(By.xpath("//button[3]/div")).click();
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }



 */