package org.mycourse;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateSheetSinglevalue {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Yedhu\\eclipse-workspace\\SampleMaven\\excel\\createsheet.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet s = w.createSheet("Yedhu");
		Row r = s.createRow(0);
		Cell c= r.createCell(0);
			 c.setCellValue("Anjuty");
			 FileOutputStream stream=new FileOutputStream(f);
			 w.write(stream);
			 System.out.println("Done");
			 
			 
	}
}
