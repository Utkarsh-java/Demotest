package MyPackage;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver .get("https://demoblaze.com/");
driver.findElement(By.xpath("//div[@class='col-lg-3']//a[1]")).click();
System.out.println(driver.getTitle());;
//System.out.println(driver.getWindowHandle());;
Set<String> windoids = driver.getWindowHandles();
for(String windoid : windoids)
{
System.out.println("windowif"+windoid);	

}




	}

}
