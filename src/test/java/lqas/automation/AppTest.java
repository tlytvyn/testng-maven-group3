package lqas.automation;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {
   
	@Test
	public void firstTest(){
		int a = 2;
		int b = 4;
		System.out.println("test 1");
		Assert.assertTrue(a + b == 6);
	}
	
	@Test
	public void secondTest(){
		int a = 2;
		int b = 4;
		System.out.println("test 2");
		Assert.assertTrue(b - a == 2);
	}
	
}
