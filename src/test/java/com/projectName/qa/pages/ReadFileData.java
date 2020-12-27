package com.projectName.qa.pages;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFileData {
	public static void main(String[] args)  {
		  File file = new File("\\src\\test\\java\\com\\projectName\\qa\\pages\\config.properties");
		  
			FileInputStream fileInput = null;
			try {
				fileInput = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			Properties prop = new Properties();
			
			//load properties file
			try {
				prop.load(fileInput);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			WebDriver driver = new ChromeDriver();

			driver.get(prop.getProperty("url"));
			driver.findElement(By.id("email")).sendKeys(prop.getProperty("username"));
			driver.findElement(By.id("passwd")).sendKeys(prop.getProperty("password"));
			driver.findElement(By.id("SubmitLogin")).click();
			
			System.out.println("URL ::" + prop.getProperty("url"));
			System.out.println("User name::" +prop.getProperty("username"));
		    System.out.println("Password::" +prop.getProperty("password"));
	  }
}
