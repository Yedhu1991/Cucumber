package org.task;

import java.awt.Window;

public class ExecutableClass extends LoginPojo 
{
	public static void main(String[] args)
	{
		launch("https://adactin.com/HotelApp/");
		LoginPojo l=new LoginPojo();
		fill(l.getUser(), "Yedhumon");
		fill(l.getPass(), "Yedhu@123");
		klik(l.getLog());
		
		SearchRoomPojo sr=new SearchRoomPojo();
		selClass(sr.getLoc(), 1);
		selClass(sr.getHot(), 2);
		selClass(sr.getType(), 3);
		selClass(sr.getRono(), 2);
		clear(sr.getDatein());
		fill(sr.getDatein(), "27/04/2020");
		clear(sr.getDateout());
		fill(sr.getDateout(), "28/04/2020");
		selClass(sr.getAdlroom(), 2);
		selClass(sr.getChroom(), 2);
		klik(sr.getSubmt());
		
		HotelSelPojo h=new HotelSelPojo();
		klik(h.getRadbtn());
		klik(h.getConti());
		
		BookHotelPojo b=new BookHotelPojo();
		fill(b.getFnam(), "Yedhu");
		fill(b.getLstnam(), "Kunju");
		fill(b.getAddr(), "Kanikudiyil house");
		fill(b.getCrdnum(),"4532562345784562");
		selClass(b.getCrdtype(), 2);
		selClass(b.getCrdmon(), 5);
		selClass(b.getCrdyr(), 4);
		fill(b.getCvv(), "968");
		klik(b.getBook());
		
		BookConfirmPojo bc=new BookConfirmPojo();
		table(bc.getTabl());
		}
	}


