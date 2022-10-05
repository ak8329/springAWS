package com;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;

	public class Registration {
		
		public static void main(String[] args) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Atla Venkat\\eclipse-workspace\\ak\\src\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.shine.com/registration/");
			
			
		
			WebElement name= driver.findElement(By.id("id_name"));
			name.sendKeys("Kittu");
					
			
			
			//email
			WebElement email= driver.findElement(By.id("id_email"));
			email.sendKeys("ak8329@gmail.com");
			
			//mobile
			WebElement mobile= driver.findElement(By.id("id_cell_phone"));
			mobile.sendKeys("777777777");
			
			
			//password
			WebElement password= driver.findElement(By.id("id_password"));
			password.sendKeys("99999");
			
			//button
			WebElement register= driver.findElement(By.cssSelector("#registerButton"));
			//register.click();
			register.click();
	}
	}


