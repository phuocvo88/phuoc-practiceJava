package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class testcaseCombined1and2 {

    public static void main(String[] args) throws Exception{
        SeleniumUtils.openBrowser();
        SeleniumUtils.goToSignInForm();

        TC1_VerifyLoginWithValidCredential();
        TC2_VerifyLoginWithWrongCredential();

    }

    public static void TC1_VerifyLoginWithValidCredential(){
        SeleniumUtils.openBrowser();
        //TC001
        //Input correct email and password
        WebElement email = SeleniumUtils.driver.findElement(By.id("email"));
        WebElement pwd = SeleniumUtils.driver.findElement(By.id("passwd"));

        email.sendKeys("p.minh@aswhiteglobal.com");
        pwd.sendKeys("123456");
        SeleniumUtils.driver.findElement(By.id("SubmitLogin")).click();

        String s = SeleniumUtils.driver.findElement(By.className("info-account")).getText();
        System.out.println("Welcome text: " + s);

        //log out and navigate back to homepage
        SeleniumUtils.SignOut();
        SeleniumUtils.driver.findElement(By.cssSelector(".logo.img-responsive")).click();
        System.out.println("End of test case 1");
        SeleniumUtils.goToSignInForm();
    }

    public static void TC2_VerifyLoginWithWrongCredential(){
        //TC002
        //Input wrong email and password
        SeleniumUtils.goToSignInForm();

        //System.out.println("email box is displayed?: " +email.isDisplayed());
        //System.out.println("pwd box is displayed?: " +pwd.isDisplayed());
        SeleniumUtils.driver.findElement(By.id("email")).sendKeys("dsadbbcx");
        SeleniumUtils.driver.findElement(By.id("passwd")).sendKeys("bvcbvc");

        //email.sendKeys("dsadbbcx");
        //pwd.sendKeys("bvcbvc");

        SeleniumUtils.driver.findElement(By.id("SubmitLogin")).click();
        //find error and print
        WebElement err = SeleniumUtils.driver.findElement(By.cssSelector("div.alert.alert-danger p"));

        System.out.println("error : " + err.getText());
        System.out.println("end test case 2");
    }


}
