package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javafx.util.converter.BigDecimalStringConverter;

public class Student {
	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\babin\\eclipse\\StudentDetails\\Excel\\Bibin.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook Workbook = new XSSFWorkbook(stream);
		Sheet sheet = Workbook.getSheet("BIBIN");	
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				//				System.out.println(cell);
				CellType type = cell.getCellType();
				//				System.out.println(type);

				switch (type) {
				case STRING:
					String string = cell.getStringCellValue();
					System.out.println(string);

					break;
				case NUMERIC:
					if (DateUtil.isCellDateFormatted(cell)) {
						Date date = cell.getDateCellValue();
						SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMMM/yyy");
						String format = dateFormat.format(date);
						System.out.println(format);

					} else {
						double value = cell.getNumericCellValue();
						BigDecimal decimal = BigDecimal.valueOf(value);
						String number = decimal.toString();
						System.out.println(number);
					}

					break;

				default:
					break;
				}



//								switch (type) {
//								case STRING:
//									String text = cell.getStringCellValue();
//									System.out.println(text);
//									
//									break;
//								case NUMERIC:
//									double value = cell.getNumericCellValue();
//							      BigDecimal decimal = BigDecimal.valueOf(value);
//							      String number = decimal.toString();
//									System.out.println(number);
//									break;
//									
//				
//								default:
//									break;
//								}






















			}

		}

	}
}