package com.seleniumkd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathpath {
	
	public static void main(String[] args) {
		
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.amazon.in/?tag=googmantxtmob170-21&ascsubtag=_k_CjwKCAjw7s20BhBFEiwABVIMrc2W1CjvtTPd1h5sGrn7hB14A5Sw0VxUQY4Ntyml6T2Hyaksiul1ZRoCgU0QAvD_BwE_k_");
		driver.manage().window().maximize();
		
		
		
		WebElement search = driver.findElement(By.id("twotabsearchtextboxl"));
		search.sendKeys("iphone 15 pro max");
		
		WebElement click = driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[1]"));
		click.click();
		
	}

}
