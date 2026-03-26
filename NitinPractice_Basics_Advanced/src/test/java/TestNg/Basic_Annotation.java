package TestNg;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Basic_Annotation {
	
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("To get the connection of browser");
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("To launch the browser");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("To login to the browser");
	}
	
	@Test
	public void ConfigTest1() {
		System.out.println("test first-1 is executed");
	}
	
	@Test
	public void ConfigTest2() {
		System.out.println("test Second-2 is executed");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("After method is executing");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("After Class is executing");
	}
	@AfterSuite
	public void AfterSuite() {
		System.out.println("After Suite is executing");
	}
	
	
}
