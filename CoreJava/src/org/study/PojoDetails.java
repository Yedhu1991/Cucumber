package org.study;

import java.util.LinkedList;
import java.util.List;

public class PojoDetails {
	public static void main(String[] args) {
		List<PojoEmployee> li=new LinkedList<PojoEmployee>();
		PojoEmployee e=new PojoEmployee();
		e.setId(10);
		e.setName("yehdu");
		e.setNum(13254l);
		PojoEmployee e1=new PojoEmployee();
		e1.setId(20);
		e1.setName("Maneesh");
		e1.setNum(1564l);
		PojoEmployee e2=new PojoEmployee();
		e2.setId(30);
		e2.setName("mani");
		e2.setNum(1324654l);
		li.add(e1);
		li.add(e);
		li.add(e2);
		for(PojoEmployee x:li) {
			System.out.println(x.getId());
			System.out.println(x.getName());
			System.out.println(x.getNum());
		}
	
	
	
	}

}
