package org.mycourse;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class CreateSheetmultilecell {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Yedhu\\eclipse-workspace\\SampleMaven\\excel\\createsheet.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet s = w.createSheet("Kunj");
		for(int i=0;i<4;i++) {
			Row r = s.createRow(i);
			for(int j=0;j<4;j++) {
				org.apache.poi.ss.usermodel.Cell c = r.createCell(j);
				c.setCellValue("Yedhu");
				FileOutputStream stream=new FileOutputStream(f);
				w.write(stream);
				
			}
		}

} 
}
