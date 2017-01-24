package testngFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotation2 {

	public WebDriver driver = null;
	
@Test
public void login() throws IOException{
	
	
	
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\nisha\\workspace\\Test\\src\\testngFiles\\datadriven.properties");
	prop.load(fis);
	
	System.out.println(prop.getProperty("Username"));
	System.out.println(prop.getProperty("Password"));
	
	if(prop.getProperty("Browser").equals("firefox")){
	
		driver = new FirefoxDriver();
	}
	
	else if(prop.getProperty("Browser").equals("chrome")){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nisha\\workspace\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
	}
  
	driver.get(prop.getProperty("URL"));
}

/*
@Test
public void instalSoftware(){
	System.out.println("I'm Test");
}

@AfterSuite
public void end(){
	System.out.println("I'm late");

}*/

}
