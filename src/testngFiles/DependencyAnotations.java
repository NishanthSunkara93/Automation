package testngFiles;

import org.testng.annotations.Test;

public class DependencyAnotations {

	@Test
	public void openingBrowser(){
		System.out.println("Opening Browser");
	}
    
	@Test (dependsOnMethods ={"openingBrowser"},alwaysRun = true)
	public void FlightBooking(){
		System.out.println("FlightBooking");
	}	
	@Test(enabled = false)
	public void payment(){
		System.out.println("New Testcase");
	}
	@Test(timeOut = 45000)
	public void timeRelated(){
		System.out.println("Time");
	}

}
