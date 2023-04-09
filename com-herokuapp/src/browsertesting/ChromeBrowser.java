package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
        //Opening Browser version
        String baseUrl ="http://the-internet.herokuapp.com/login";

        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
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

