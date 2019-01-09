package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumUtils {
    public static WebDriver driver;


    public static void openBrowser(){
        System.setProperty("webdriver.gecko.driver", "D://Automation learning/GeckoDriver/geckodriver.exe");
        driver = new FirefoxDriver();

        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

    }

    public static void closeBrowser(){
        driver.close();
    }

    public static void goToSignInForm(){
        //find sign in button
        WebElement signin = driver.findElement(By.className("login"));
        System.out.println("button sign in is displayed?: " + signin.isDisplayed());
        signin.click();

    }

    public static void SignOut(){
        WebElement signout = driver.findElement(By.className("logout"));
        signout.click();


    }


}
