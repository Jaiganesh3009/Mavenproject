package com.fileoperatioms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileOperations {
public static void main(String[] args) throws IOException {
	
	//to create a folder
	File f = new File("C:\\Users\\ELCOT\\Desktop\\jai");
	boolean a = f.mkdir();
	System.out.println("Folder Created           : " +a);

	//to create multiple folder
	File f1 = new File("C:\\Users\\ELCOT\\Desktop\\jai1\\jai2\\jai3");
	boolean b = f1.mkdirs();
	System.out.println("Multiple Folders Created : " +b);

	//to create a file
	File f2 = new File("C:\\Users\\ELCOT\\Desktop\\jai\\jai");
	boolean c = f2.createNewFile();
	System.out.println("File Created             : "+c);
	
	//to check whether its a file or not
	boolean d = f1.isFile();
	System.out.println("This is a File           : " +d);
	
	boolean e = f2.isFile();
	System.out.println("This is a File           : " +e);
	
	//to check  whether is directory or not
	boolean g = f1.isDirectory();
	System.out.println("This is a Folder         : " +g);
	
	//to get list of files
	File[] h = f.listFiles();
	for (File i : h) {
	System.out.println("List Of Files            : " +i);
	}
	
	//to delete the file
	boolean j = f1.delete();
	System.out.println("File Deleted             : " +j);
	
	//to copy the directory from source to destination
	File f3 = new File ("C:\\Users\\ELCOT\\Desktop\\jai1");
	File f4 = new File("C:\\Users\\ELCOT\\Desktop\\jai");
	FileUtils.copyDirectory(f3,f4);
	
  }
}
