package com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Atla Venkat\\eclipse-workspace\\ak\\src\\msedgedriver.exe");

		WebDriver wd=new EdgeDriver();
		wd.get("https://www.shine.com/login/");
		WebElement email= wd.findElement(By.id("id_email_login"));
		email.sendKeys("ak83@gmail.com");
		
		
		//password
		WebElement password= wd.findElement(By.id("id_password"));
		password.sendKeys("12345");
		
		//button
		WebElement login= wd.findElement(By.cssSelector("#cndidate_login_widget"));
		login.click();

		
//		Submit button 
//		WebElement submitButtonRef = wd.findElement(By.id("b1"));
//		submitButtonRef.click();
//		String targetCurrentPagepath=wd.getCurrentUrl();
//		System.out.println(targetCurrentPagepath);
//		String targetCurrentPagePath = wd.getCurrentUrl();
//	System.out.println(targetCurrentPagePath);
//		WebElement h2TagRef = wd.findElement(By.tagName("h2"));
//		System.out.println(h2TagRef.getText());
	}
}
		// Reset button 
		//WebElement resetButtonRef = wd.findElement(By.id("b2"));
		//resetButtonRef.click();
		
		// email validation 
//		WebElement emailIdRef = wd.findElement(By.id("n1"));
//		WebElement passwordRef = wd.findElement(By.id("n2"));
//		WebElement submitButtonRef = wd.findElement(By.id("b1"));
//		submitButtonRef.click();
//		Alert alertRef	= wd.switchTo().alert();		// give the alert box reference 
//		System.out.println(alertRef.getText());		// alert box content 
//		alertRef.accept();							// click ok bututon of alert box 
//		wd.close();									// close the application. 
		
		// password validation 
//		WebElement emailIdRef = wd.findElement(By.id("n1"));
//		WebElement passwordRef = wd.findElement(By.id("n2"));
//		emailIdRef.sendKeys("raj@gmail.com");
//		WebElement submitButtonRef = wd.findElement(By.id("b1"));
//		submitButtonRef.click();
//		Alert alertRef	= wd.switchTo().alert();		// give the alert box reference 
//		System.out.println(alertRef.getText());		// alert box content 
//		alertRef.accept();							// click ok bututon of alert box 
//		wd.close();			
//	}

