package ptwGitHub;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MathCalculation 
{
	 @BeforeTest
	 public void Header()
	 {
		 System.out.println("Welcom to PTW");
		 System.out.println("------------------------");
	 }
	
	
	@Test
	public void Addition()
	{
		System.out.println("Addition is " + 0);
	}
	
	@AfterTest
	 public void Footer()
	 {
		 System.out.println("Thank for using our app");
		 System.out.println("------------------------");
		
	 }
}
