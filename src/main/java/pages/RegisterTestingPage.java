package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterTestingPage {

    private WebDriver driver;
    private static By firstName = By.xpath("//input[@type='text']");
    private static By lastName = By.xpath("(//input[@type='text'])[2]");
    private static By address = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Address'])[1]/following::textarea[1]");
    private static By email = By.xpath("//input[@type='email']");
    private static By phone = By.xpath("//input[@type='tel']");
    private static By femaleGender = By.xpath("(//input[@name='radiooptions'])[2]");
    private static By maleGender = By.xpath("(//input[@name='radiooptions' and @value='Male'])");
    private static By movieHobbie = By.id("checkbox2");
    private static By languages = By.id("msdd");
    private static By englishLanguages = By.linkText("English");
    private static By spanishLanguage = By.linkText("Spanish");
    private static By skills = By.id("Skills");
    private static By country = By.id("countries");
    private static By selectCountry = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span");
    private static By unitedStatesCountryBox = By.xpath("//*[@id=\"select2-country-results\"]/li[11]");
    private static By yearBirth = By.id("yearbox");
    private static By monthBirth = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select");
    private static By dayBirth = By.id("daybox");
    private static By password = By.id("firstpassword");
    private static By confirmPassword = By.id("secondpassword");


    public RegisterTestingPage(WebDriver driver) {
        this.driver = driver;
    }


    public void setFirstName(String firstNameBox) {
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(firstNameBox);
    }

    public void setLastName(String lastNameBox) {
        driver.findElement(lastName).clear();
        driver.findElement(lastName).sendKeys(lastNameBox);
    }

    public void setAddress(String addressBox) {
        driver.findElement(address).clear();
        driver.findElement(address).sendKeys(addressBox);
    }

    public void setEmail(String emailBox) {
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys(emailBox);
    }

    public void setPhone(String phoneBox) {
        driver.findElement(phone).clear();
        driver.findElement(phone).sendKeys(String.valueOf(phoneBox));
    }

    public void setFemaleGender() {
        driver.findElement(femaleGender).click();
    }

    public void setMaleGender() {
        driver.findElement(maleGender).click();
    }

    public void setHobbie() {
        driver.findElement(movieHobbie).click();
    }

    public void setLanguages() {
        driver.findElement(languages).click();
        driver.findElement(spanishLanguage).click();
        driver.findElement(englishLanguages).click();
        driver.findElement(By.xpath("//*[@id=\"section\"]/div/div")).click();
    }

    public void setSkills() {
        driver.findElement(skills).click();
        new Select(driver.findElement(skills)).selectByVisibleText("Java");
    }

    public void setCountry() {
        driver.findElement(country).click();
        new Select(driver.findElement(country)).selectByVisibleText("Colombia");
        driver.findElement(selectCountry).click();
        driver.findElement(unitedStatesCountryBox).click();
    }

    public void setBirth() {
        driver.findElement(yearBirth).click();
        new Select(driver.findElement(yearBirth)).selectByVisibleText("1996");
        driver.findElement(monthBirth).click();
        new Select(driver.findElement(monthBirth)).selectByVisibleText("May");
        driver.findElement(dayBirth).click();
        new Select(driver.findElement(dayBirth)).selectByVisibleText("27");
    }

    public void setPassword(String passwordBox) {
        driver.findElement(password).sendKeys(passwordBox);
        driver.findElement(confirmPassword).sendKeys(passwordBox);
    }

    public void clickSubmint() {
        driver.findElement(By.id("submitbtn")).click();
    }


/*
        public static WebElement lregisteredMessage(WebDriver driver) {
            driver.findElement(By.xpath("//input[@type='text']"));
            return element;
        }

 */


}
