package org.mycourse;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AddingData {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Yedhu\\eclipse-workspace\\SampleMaven\\excel\\AddingData.xlsx");
		Workbook w= new XSSFWorkbook();
		Sheet s = w.createSheet("Data");
		Row r = s.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue("KUNJAVA");
		FileOutputStream stream=new FileOutputStream(f);
		w.write(stream);
		System.out.println("Updated");
		
	}

}
