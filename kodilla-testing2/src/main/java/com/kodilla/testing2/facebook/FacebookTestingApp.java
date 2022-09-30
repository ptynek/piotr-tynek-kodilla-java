package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FacebookTestingApp {

    public static final String XPATH_COOKIEAGREEMENT = "//*[@data-cookiebanner = \"accept_button\"]";
    public static final String XPATH_CREATE_NEW_ACCOUNT = "//*[@data-testid = \"open-registration-form-button\"]";
    public static final String XPATH_MAIN_FORM = "//input[contains(@class, \"_58mg _5dba _2ph-\")]";
    public static final String XPATH_SELECT_MONTH = "//select[@name = \"birthday_month\"]";
    public static final String XPATH_SELECT_DAY = "//select[@name = \"birthday_day\"]";
    public static final String XPATH_SELECT_YEAR = "//select[@name = \"birthday_year\"]";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        driver.findElement(By.xpath(XPATH_COOKIEAGREEMENT)).click();
        driver.findElement(By.xpath(XPATH_CREATE_NEW_ACCOUNT)).click();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        while(!driver.findElement(By.xpath(XPATH_MAIN_FORM)).isDisplayed());

        WebElement webElementSelectDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(webElementSelectDay);
        selectDay.selectByIndex(19);

        WebElement webElementSelectMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(webElementSelectMonth);
        selectMonth.selectByIndex(11);

        WebElement webElementSelectYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(webElementSelectYear);
        selectYear.selectByValue("1993");


    }
}
