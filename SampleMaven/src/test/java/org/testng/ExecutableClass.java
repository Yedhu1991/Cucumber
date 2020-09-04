package org.testng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

public class ExecutableClass extends FaceBookLog{
	FaceBookLog f=new FaceBookLog();
	BaseClass b=new BaseClass();
	@Test
	public void test1() {
		launch("https://www.facebook.com/");
		String title = driver.getTitle();
		assertTrue(title.contains("log in or sign up"));
		System.out.println("Launched the url");
	}
	@Test
	public void test2() {
		fill(f.getEmail(), "monyedhu@gmail.com");
		assertEquals("monyedhu@gmail.com", f.getEmail().getAttribute("value"));
		System.out.println("Correct email id");
		fill(f.getPass(), "465132");
		assertEquals("465132", f.getPass().getAttribute("value"));
	
	}

}
