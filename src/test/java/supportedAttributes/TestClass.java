package supportedAttributes;

import org.testng.annotations.Test;

public class TestClass {
	@Test  (priority=9)
	public void firstTest() 
	{ 
	  System.out.println("First Test Method 1"); 
	} 
	@Test (priority=11)
	public void secondTest() 
	{ 
	   System.out.println("Second Test Method 1"); 
	  }
	
	@Test (priority=12)
	public void gitTest() 
	{ 
	   System.out.println("GitProject"); 
	   System.out.println("1");
	   System.out.println(3);
	   System.out.println();
	  }
	
	@Test (priority=12)
	public void gitTestBranch() 
	{ 
	   System.out.println("GitProject Branch created"); 
	
	  }
	
	@Test (priority=12)
	public void gitTestBranch2() 
	{ 
	   System.out.println("GitProject Branch 2 is created"); 
	
	  }
}
