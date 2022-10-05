package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demotest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atla Venkat\\eclipse-workspace\\ak\\src\\spring\\springboot\\AngularFramework\\chromedriver.exe");
		
		WebDriver wd=new ChromeDriver();
		wd.get(" ");
		String titleTagContext=wd.getTitle();
		String url=wd.getCurrentUrl();
		String pageContent=wd.getPageSource();
		System.out.println(titleTagContext);
		System.out.println(url);
		
    wd.close();
	}

}
