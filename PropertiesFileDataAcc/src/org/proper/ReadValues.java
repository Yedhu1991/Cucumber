package org.proper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadValues {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\Yedhu\\eclipse-workspace\\PropertiesFileDataAcc\\Properties\\data.properties");
	FileInputStream stream=new FileInputStream(f);
	Properties p=new Properties();
	p.load(stream);
	
	System.out.println("password : "+p.getProperty("username"));
	System.out.println("username : "+p.get("pass"));
	
	
}
}
