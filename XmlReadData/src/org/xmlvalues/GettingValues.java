package org.xmlvalues;

import java.io.File;
import java.nio.file.FileVisitResult;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class GettingValues {
	public static void main(String[] args) throws JAXBException {
		JAXBContext js = JAXBContext.newInstance(Employee.class);
		Unmarshaller um=js.createUnmarshaller();
		File f=new File("C:\\Users\\Yedhu\\eclipse-workspace\\XmlReadData\\value.xml");
		Object obj = um.unmarshal(f);
		Employee e=(Employee)obj;
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getMob());
		System.out.println(e.getEmail());
		
	}

}
