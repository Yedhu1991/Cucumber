package org.adact;

public class DataProvider {
	@org.testng.annotations.DataProvider(name="data")
	public Object [][] userDetils(){
		return new Object[][] {{"kalidass","12345@","Yedhu","Mon","kanikudiyil","1234423145624562","456"}};
	}

}
