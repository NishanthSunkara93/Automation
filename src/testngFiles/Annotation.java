package testngFiles;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {

	@BeforeMethod
	public void UserIdGeneration(){
		System.out.println("UserID Generation");
	}
	
	@BeforeTest
	public void Cookies(){
		System.out.println("Delete Cookies");
	}
	@AfterTest
	public void CookiesClose(){
		System.out.println("Delete cookies after all test");
	}
	
	
	@Test
	public void AopeningBrowser(){
		System.out.println("Openins Browser");
	}
    
	@Test
	public void FlightBooking(){
		System.out.println("FlightBooking");
	}


}
