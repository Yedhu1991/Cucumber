package org.testmaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenExcelRead {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Yedhu\\eclipse-workspace\\SampleMaven\\excel\\DataDrivenExcel.xlsx");
		FileInputStream stream=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(stream);
		Sheet st = w.getSheet("Sheet1");
		Row rw = st.getRow(1);
		Cell cl = rw.getCell(0);
		System.out.println("2nd row 0th cell data is");
		System.out.println(cl);
		
		//to print 
		
		System.out.println("to print entire data from excel file");
		for(int i=0;i<st.getPhysicalNumberOfRows();i++) {
			Row eachrow = st.getRow(i);
			for(int j=0;j<eachrow.getPhysicalNumberOfCells();j++) {
				Cell cll = eachrow.getCell(j);
				System.out.println(cll);
			}
		}
	}

}
