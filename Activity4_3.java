package javaActivity4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Activity4_3 {
	
	private static String FILE_NAME = "C:/SE-United/WP/OnlineStore/src/javaActivity4/resources/TestSheet.xlsx";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Datatypes in Java");
		
		Object[][] datatypes = {
			    {"Datatype", "Type", "Size(in bytes)"},
			    {"int", "Primitive", 2},
			    {"float", "Primitive", 4},
			    {"double", "Primitive", 8},
			    {"char", "Primitive", 1},
			    {"String", "Non-Primitive", "No fixed size"}
			};
		
		int rowNum = 0;

		for (Object[] datatype : datatypes) {
		    Row row = sheet.createRow(rowNum++);
		    int colNum = 0;
		    for (Object field : datatype) {
		        Cell cell = row.createCell(colNum++);
		        if (field instanceof String) {
		            cell.setCellValue((String) field);
		        } else if (field instanceof Integer) {
		            cell.setCellValue((Integer) field);
		        }
		    }
		}
		try {
			FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
			workbook.write(outputStream);
            workbook.close();
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}

}
