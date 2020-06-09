package com.read;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelRead {
public static void main(String[] args) throws Exception {
	File f = new File("D:\\Ecllipse\\Ec_test\\MavenEmployee\\target\\Sample.xlsx");
	FileInputStream f1 = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(f1);
	Sheet s = w.getSheet("Sample");
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row row = s.getRow(i);
	for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
		Cell c = row.getCell(j);
		System.out.println(c);
		w.close();
	}}
}
}

	
	
	
	