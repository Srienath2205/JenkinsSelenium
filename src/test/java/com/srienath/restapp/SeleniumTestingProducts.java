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

public class SeleniumTestingProducts {

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
	  public void testCase001AddProduct() {
	    driver.get("http://localhost:3000/home");
	    driver.manage().window().setSize(new Dimension(1528, 816));
	    driver.findElement(By.id("basic-nav-dropdown")).click();
	    driver.findElement(By.xpath("(//button[@id=\'homebutton\'])[2]")).click();
	    driver.findElement(By.name("productName")).click();
	    driver.findElement(By.name("productName")).sendKeys("Loui Philippe Brown Belt");
	    driver.findElement(By.name("productType")).click();
	    driver.findElement(By.name("productType")).sendKeys("accessories");
	    driver.findElement(By.name("stockLeft")).click();
	    driver.findElement(By.name("stockLeft")).sendKeys("9");
	    driver.findElement(By.name("price")).click();
	    driver.findElement(By.name("price")).sendKeys("899");
	    driver.findElement(By.name("boutiqueID")).click();
	    {
	      WebElement dropdown = driver.findElement(By.name("boutiqueID"));
	      dropdown.findElement(By.xpath("//option[. = '5']")).click();
	    }
	    driver.findElement(By.cssSelector(".btn")).click();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		alert.accept();
		assertEquals("Product Data added Successfully !!!", txt);
	  }
	  
	  @Test
	  public void testCase002UpdateProduct() {
	    driver.get("http://localhost:3000/viewproducts");
	    driver.manage().window().setSize(new Dimension(1528, 816));
	    driver.findElement(By.cssSelector("tr:nth-child(2) .btn-success")).click();
	    driver.findElement(By.name("productName")).click();
	    driver.findElement(By.name("productName")).clear();
	    driver.findElement(By.name("productName")).sendKeys("Gucci White Handbag");
	    driver.findElement(By.cssSelector(".w-50")).click();
	    driver.findElement(By.name("productType")).clear();
	    driver.findElement(By.name("productType")).sendKeys("bags");
	    driver.findElement(By.name("stockLeft")).click();
	    driver.findElement(By.name("stockLeft")).clear();
	    driver.findElement(By.name("stockLeft")).sendKeys("3");
	    driver.findElement(By.name("price")).click();
	    driver.findElement(By.name("price")).clear();
	    driver.findElement(By.name("price")).sendKeys("36000");
	    driver.findElement(By.name("boutiqueID")).click();
	    {
	      WebElement dropdown = driver.findElement(By.name("boutiqueID"));
	      dropdown.findElement(By.xpath("//option[. = '4']")).click();
	    }
	    driver.findElement(By.cssSelector(".btn")).click();
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		alert.accept();
		assertEquals("Product Data Updated Successfully !!!", txt);
	  }
	  @Test
	  public void testCase003DeleteProduct() {
	    driver.get("http://localhost:3000/viewproducts");
	    driver.manage().window().setSize(new Dimension(1528, 816));
	    driver.findElement(By.xpath("//table[@id=\'addemp\']/tbody/tr[1]/td[7]/button")).click();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
	    Alert alert =driver.switchTo().alert();
	    String txt = alert.getText();
		alert.accept();
		assertEquals("Do you want to delete", txt);
	  }
	  @Test
	  public void testCase004ViewProducts() {
	    driver.get("http://localhost:3000/home");
	    driver.manage().window().setSize(new Dimension(1528, 816));
	    driver.findElement(By.id("basic-nav-dropdown")).click();
	    {
	      WebElement element = driver.findElement(By.id("basic-nav-dropdown"));
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
