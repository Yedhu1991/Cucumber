package org.junitclass;



public class ExecutabaleClasse extends LoginPojo {
	LoginPojo l=new LoginPojo();
	

	public void test1() {
		l.launch("https://adactin.com/HotelApp/");
		//Assert.assertTrue(driver.getTitle().contains("Hotel Reser"));
		System.out.println("Expected result");
	}

	public void test2() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"//div//chromedriver.exe");
		driver.get("https://adactin.com/HotelApp/");
		driver.manage().window().maximize();
		fill(l.getUser(), "Yedhumon");
		//Assert.assertEquals("Yedhumon", l.getUser().getAttribute("value"));
		fill(l.getPass(), "Yedhu@123");
		//Assert.assertEquals( "Yedhu@123", l.getPass().getAttribute("value"));
		klick(l.getBtn());
	}
	

}
