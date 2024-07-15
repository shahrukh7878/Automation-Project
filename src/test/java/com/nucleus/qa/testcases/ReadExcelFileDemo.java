package com.nucleus.qa.testcases;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;  
import java.io.FileInputStream;  
import java.util.Iterator;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFileDemo {
		    public static void main(String[] args) {
		        try {
		            // Load the Excel file
		            File file = new File("C:\\Users\\ShahrukhAatar\\Documents\\student.xls");
		            FileInputStream fis = new FileInputStream(file);
		            HSSFWorkbook workbook = new HSSFWorkbook(fis);   
		            HSSFSheet sheet = workbook.getSheetAt(0); 

		            for (int rowNum = 0; rowNum <= sheet.getLastRowNum(); rowNum++) {
		            	HSSFRow row = sheet.getRow(rowNum);
		                if (row != null) {
		                    for (int cellNum = 0; cellNum < row.getLastCellNum(); cellNum++) {
		                    	HSSFCell cell = row.getCell(cellNum);
		                        if (cell != null) {
		                            System.out.print(cell.toString() + "\t");
		                        }
		                    }
		                    System.out.println(); // Move to the next row
		                }
		            }

		            // Close the workbook and input stream
		            workbook.close();
		            fis.close();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
		}


		
		

	
