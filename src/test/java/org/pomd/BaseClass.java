package org.pomd;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class BaseClass {
	
public static 	WebDriver driver;
public static JavascriptExecutor js;
public static Actions a;

	  public static WebDriver launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\db programs\\Pom_ex\\src\\test\\java\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 return driver;

	}
	  
	  public static void url(String txt) {
		driver.get(txt);

	}
	  
	  public static void big() {
		driver.manage().window().maximize();

	}
	  
	  public static void down(WebElement e) {
       js=(JavascriptExecutor)driver;
       js.executeScript("arguments[0].scrollIntoView(true)", e);

	}
	 
 public static void up(WebElement e) {
	 js=(JavascriptExecutor)driver;
     js.executeScript("arguments[0].scrollIntoView(false)", e);


}
 public static void Print(WebElement e) {
	    String s = e.getText();
	    System.out.println(s);

}
 public static void navi(String txt) {
	driver.navigate().to(txt);

}
 public static void naviback()
 {
   driver.navigate().back();	 
 }
 
 public static void click(WebElement e) {
	e.click();

}
 public static void mouse(WebElement e)
 {
	a=new Actions(driver);
	a.moveToElement(e).perform();
 }
}

