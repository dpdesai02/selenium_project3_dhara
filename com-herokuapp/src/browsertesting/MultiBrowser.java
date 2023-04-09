package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {

    static String browser = "Chrome";
    static String baseUrl =  "http://the-internet.herokuapp.com/login";
    static WebDriver driver;
    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println(" Wrong Browser name");
        }
        //Opening Browser version
        String baseUrl ="http://the-internet.herokuapp.com/login";

        //Launch the Chrome Browser
        //WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);

        //Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //Print the current url
        driver.getCurrentUrl();
        System.out.println("Current URL:" + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page Source:"+ driver.getPageSource());

        //Find the email field element
        driver.findElement(By.id("username")).sendKeys("dhara123@gmail.com");

        //Find the password field element
        driver.findElement(By.name("password")).sendKeys("Aimhigh123");

        //Close the Browser
        driver.close();
    }


    }
