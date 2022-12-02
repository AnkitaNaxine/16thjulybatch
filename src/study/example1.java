package study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", 
			"D:\\study\\16thjulybatch-selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	//driver.findElement("locator")
	//driver.findElements(By.xpath("StringxpathExpression"))
	
	//enter UN
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ankita Naxine");
	
	//enter password
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("7218152305");
	
	//click on login button
    driver.findElement(By.xpath("//button[@type='submit']")).click();
}
}
