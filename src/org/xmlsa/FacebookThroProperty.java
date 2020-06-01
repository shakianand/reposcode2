package org.xmlsa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookThroProperty {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace30\\SamplexmlProject\\div\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://ww.facebook.com/");
		//driver.manage().window().maximize();
	
		File f = new File("C:\\Users\\admin\\eclipse-workspace30\\SamplexmlProject\\prop\\fb.properties");
		FileInputStream in = new FileInputStream(f);
		Properties p = new Properties();
		p.load(in);
		
		driver.get(p.getProperty("url"));
		driver.findElement(By.id(p.getProperty("userref"))).sendKeys(p.getProperty("username"));;
		driver.findElement(By.id(p.getProperty("pwdref"))).sendKeys(p.getProperty("password"));;
		driver.findElement(By.id(p.getProperty("loginref"))).click();
		

		
		
	}

	
	
}
