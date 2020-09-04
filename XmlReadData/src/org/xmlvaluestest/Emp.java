package org.xmlvaluestest;

import java.io.File;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Emp {
	public static void main(String[] args) throws JAXBException {
		JAXBContext js=JAXBContext.newInstance(Pojoclass.class);
		Unmarshaller unma = js.createUnmarshaller();
		File f=new File("C:\\Users\\Yedhu\\eclipse-workspace\\XmlReadData\\data.xml");
		Object o = unma.unmarshal(f);
		Pojoclass e=(Pojoclass)o;
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getMob());
	}

}
