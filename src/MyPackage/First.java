package MyPackage;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		System.out.println("TITLE" + driver.getTitle());
		System.out.println("URL" + driver.getCurrentUrl());
		WebElement u_name =driver.findElement(By.xpath("//input[@id='user-name']"));
		System.out.println("username displayed" +u_name.isDisplayed());
		System.out.println("username Enabled" +u_name.isEnabled());	
		System.out.println("username selected" +u_name.isSelected());
		System.out.println("window handle"+driver.getWindowHandle());
		System.out.println("tile of login age"+driver.getTitle());
		u_name.sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		String s1=driver.getWindowHandle();
		driver.switchTo().window(s1);
		driver.findElement(By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]")).click();
		//driver.close();
		//	System.out.println("window handle of age 2"+driver.getWindowHandle());
		//System.out.println("number of window oened"+driver.getWindowHandle());
		System.out.println("title of age 2"+driver.getTitle());
		driver.close();
		System.out.println("title of login age"+driver.getTitle());

	}}
