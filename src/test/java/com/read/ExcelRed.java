package com.read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRed {
	public static void main(String[] args) throws Exception {
		File f = new File("D:\\Ecllipse\\Ec_test\\MavenEmployee\\target\\Sample.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(f1);
		Sheet s = w.getSheet("Sample");
		Row r = s.getRow(1);
		Cell c = r.getCell(0);
		System.out.println(c);
	
		//update
		String d = c.getStringCellValue();
		if (d.equals("ganesh")) {
			c.setCellValue("jaiganesh");
		}
		FileOutputStream o = new FileOutputStream(f);
		w.write(o);
		System.out.println("updated");
		w.close();
	}
}
