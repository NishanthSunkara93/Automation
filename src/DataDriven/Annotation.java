package DataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Annotation {

	//@BeforeMethod
	public void UserIdGeneration(){
		System.out.println("UserID Generation");
	}
	
	@Test(dataProvider = "getData")
	public void UserId(String username,String password){
		System.out.println("Data Provider Test");
		System.out.println(username);
		System.out.println(password);
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
	}
	
	
	//@BeforeTest
	public void Cookies(){
		System.out.println("Delete Cookies");
	}
	//@AfterTest
	public void CookiesClose(){
		System.out.println("Delete cookies after all test");
	}
	
	
	//@Test
	public void AopeningBrowser(){
		System.out.println("Openins Browser");
	}
    
	//@Test
	public void FlightBooking(){
		System.out.println("FlightBooking");
	}

	@DataProvider
	public Object[][] getData(){
		
		Object [][] data = new Object[3][2];
		data[0][0] = "abcd1";
		data[0][1] = "xyz1";
		
		data[1][0] = "Nishanth2";
		data[1][1] = "Madhu2";
		
		data[2][0] = "Nikith3";
		data[2][1] = "Jeevana3";
		return data;
	}
}
