package com.write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void main(String[] args) throws Exception {
		File f = new File("D:\\Ecllipse\\Ec_test\\MavenEmployee\\target\\Sample.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(f1);
		Sheet s = w.createSheet("Sample1");
		Row r = s.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue("Hello");
		FileOutputStream l =  new FileOutputStream(f);
		w.write(l);
		System.out.println("written");
		w.close();
	}
	
}
