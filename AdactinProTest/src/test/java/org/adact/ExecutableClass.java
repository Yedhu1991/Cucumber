package org.adact;
import org.testng.annotations.Test;
public class ExecutableClass extends BaseClass {
	@Test(dataProviderClass=DataProvider.class,dataProvider="data")
	public void test(String s1,String s2,String s3,String s4,String s5,String s6,String s7) {
		launch("http://adactinhotelapp.com/");
		Login e=new Login();
		fill(e.getUsnm(), s1);
		fill(e.getPass(), s2);
		klik(e.getLog());
		SearchHotel sh=new SearchHotel();
		selClass(sh.getLoc(), 3);
		selClass(sh.getHot(), 2);
		selClass(sh.getType(), 1);
		selClass(sh.getRono(), 2);
		selClass(sh.getAdlroom(), 2);
		selClass(sh.getChroom(), 1);
		klik(sh.getSubmt());
		SelectHotel se=new SelectHotel();
		klik(se.getRdobtn());
		klik(se.getBtn());
		BookHotelPojo b=new BookHotelPojo();
		fill(b.getFnam(), s3);
		fill(b.getLstnam(), s4);
		fill(b.getAddr(), s5);
		fill(b.getCrdnum(), s6);
		selClass(b.getCrdtype(), 1);
		selClass(b.getCrdmon(), 3);
		selClass(b.getCrdyr(), 5);
		fill(b.getCvv(), s7);
		klik(b.getBook());
		
	}
}


