package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testcase2 {

    public static void TC002(){
        System.setProperty("webdriver.gecko.driver", "D://Automation learning//GeckoDriver/geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();
        WebDriver driver = new FirefoxDriver();
    /*
        driver.get("http://demo.guru99.com/");
        WebElement element=driver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("abc@gmail.com");

        WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();
     */

        driver.get("http://automationpractice.com/index.php");

        driver.manage().window().maximize();

        //find sign in button
        WebElement signin = driver.findElement(By.className("login"));
        System.out.println("button sign in is displayed?: " + signin.isDisplayed());

        signin.click();
        //driver.findElement(By.linkText("http://automationpractice.com/index.php?controller=my-account")).click();


        //Input wrong email and password
        WebElement email = driver.findElement(By.id("email"));
        WebElement pwd = driver.findElement(By.id("passwd"));

        email.sendKeys("dsadbbcx");
        pwd.sendKeys("bvcbvc");

        driver.findElement(By.id("SubmitLogin")).click();
        //find error and print
        WebElement err = driver.findElement(By.cssSelector("div.alert.alert-danger p"));

        System.out.println("error : " + err.getText());
        System.out.println("end test case 2");
        driver.close();

    }
}
