package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_webTable {

	public static void main(String[] args) 
	{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.blazedemo.com/");
	driver.findElement(By.xpath("//select[@name='fromPort']")).click();
	driver.findElement(By.xpath("//option[@value='Boston']")).click();
	driver.findElement(By.xpath("//select[@name='toPort']")).click();
	driver.findElement(By.xpath("//option[@value='London']")).click();
	driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
	String s1=driver.getWindowHandle();
	driver.switchTo().window(s1);
	//List<WebElement> prices = driver.findElements(By.xpath("//table[@class='table']//td[6]"));
	//System.out.println(prices);
	driver.findElement(By.xpath("//tbody/tr[3]/td[1]/input[1]")).click();
}

}
