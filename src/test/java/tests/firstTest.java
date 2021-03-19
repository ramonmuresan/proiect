package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {

    @Test
    public void firstMethod(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramon\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");
    }

}
