package org.tstnggroup;

public class ExtenDataPro {
	@org.testng.annotations.DataProvider(name="data")
	public Object[][] dataPro()
		{
		return new Object[][]{{"monyedhu@gmail.com","9020465722"},
								{"clanyedhu@gmail.com","461324"},
								{"manu@gmail.com","564654646"}
							   };
			
		}

}
