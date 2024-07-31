package com.srienath.restapp;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Dimension;

public class SeleniumTestingBoutique {
	private WebDriver driver;

	  @BeforeEach
	  public void setUp() {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://localhost:3000/home");   
	  }
	  
	  @AfterEach
	  public void tearDown() {
	    driver.quit();
	  }
	  
	  @Test
	  public void testCase001AddBoutique() {
	    driver.get("http://localhost:3000/home");
	    driver.manage().window().setSize(new Dimension(1528, 816));
	    driver.findElement(By.linkText("Boutique")).click();
	    driver.findElement(By.xpath("(//button[@id=\'homebutton\'])[2]")).click();
	    driver.findElement(By.name("boutiqueName")).click();
	    driver.findElement(By.name("boutiqueName")).sendKeys("BabyJean");
	    driver.findElement(By.name("email")).click();
	    driver.findElement(By.name("email")).sendKeys("BabyJean@gmail.com");
	    driver.findElement(By.name("address")).click();
	    driver.findElement(By.name("address")).sendKeys("Therkuvaasal, Madurai");
	    driver.findElement(By.xpath("//input[@name=\'description\']")).click();
	    driver.findElement(By.xpath("//input[@name=\'description\']")).sendKeys("Baby Jeans for Next Gen of Fashion.");
	    driver.findElement(By.cssSelector(".btn")).click();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		alert.accept();
		assertEquals("Boutique Data added Successfully !!!", txt);
		
	  }
	  
	  @Test
	  public void testCase002UpdateBoutique() {
	    driver.get("http://localhost:3000/viewboutique");
	    driver.manage().window().setSize(new Dimension(1528, 816));
	    driver.findElement(By.xpath("//table[@id=\'addemp\']/tbody/tr[4]/td[6]/a")).click();
	    driver.findElement(By.name("boutiqueName")).click();
	    driver.findElement(By.name("boutiqueName")).clear();	    
	    driver.findElement(By.name("boutiqueName")).sendKeys("Dandelion Land");
	    driver.findElement(By.name("email")).click();
	    driver.findElement(By.name("email")).clear();
	    driver.findElement(By.name("email")).sendKeys("Dandelion@gmail.com");
	    driver.findElement(By.name("address")).click();
	    driver.findElement(By.name("address")).clear();
	    driver.findElement(By.name("address")).sendKeys("Thirunagar, Madurai");
	    driver.findElement(By.xpath("//input[@name=\'description\']")).click();
	    driver.findElement(By.xpath("//input[@name=\'description\']")).clear();
	    driver.findElement(By.xpath("//input[@name=\'description\']")).sendKeys("Dandelion brings calm into your outfit.");
	    driver.findElement(By.cssSelector(".btn")).click();	    

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		alert.accept();
		assertEquals("Boutique Data Updated Successfully !!!", txt);
	  }
	  
//	  @Test
//	  public void testCase003DeleteBoutique() {
//	    driver.get("http://localhost:3000/viewboutique");
//	    driver.manage().window().setSize(new Dimension(1528, 816));
//	    driver.findElement(By.xpath("//table[@id=\'addemp\']/tbody/tr[2]/td[6]/button")).click();
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.alertIsPresent());
//	    Alert alert =driver.switchTo().alert();
//	    String txt = alert.getText();
//		alert.accept();
//		assertEquals("Do you want to delete", txt);
//
//	  }
	  
	  @Test
	  public void testCase004ViewBoutique() {
	    driver.get("http://localhost:3000/home");
	    driver.manage().window().setSize(new Dimension(1528, 816));
	    driver.findElement(By.linkText("Boutique")).click();
	    {
	      WebElement element = driver.findElement(By.linkText("Boutique"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.id("homebutton")).click();
	  }
	
}
