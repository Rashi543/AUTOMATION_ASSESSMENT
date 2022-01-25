package mystore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data {
    private final WebDriver driver;
    public Data(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rashi.rajan\\Documents\\ASSIGNMENT\\Selenium_Project\\Selenium_work\\src\\main\\resources\\chromedriver.exe");
        this.driver = new ChromeDriver();
    }
    public WebDriver getData() {
        return driver;
    }
}
