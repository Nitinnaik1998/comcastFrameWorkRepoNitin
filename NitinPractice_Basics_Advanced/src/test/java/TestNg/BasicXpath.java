package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicXpath {
	public static void main(String[] args) {
	

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/");
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone"+Keys.ENTER);
	
	WebElement price=driver.findElement(By.xpath("//span[text()='iPhone 15 (128 GB) - Black']/ancestor::div[@class=\"puisg-col-inner\"]/descendant::span[@class=\"a-price-whole\"]"));
	System.out.println("Product Price is:"+price.getText());
	driver.quit();
}
}