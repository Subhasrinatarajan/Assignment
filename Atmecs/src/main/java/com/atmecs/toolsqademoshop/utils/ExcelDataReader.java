package com.atmecs.toolsqademoshop.utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {

	static XSSFWorkbook wb;

	static XSSFSheet productNameSheet;

	public ExcelDataReader(String excelPath) {

		try {
			File src = new File(excelPath);
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public  String getKeyValue(int sheetNumber, int row, int column) {

		productNameSheet = wb.getSheetAt(sheetNumber);
		String data = productNameSheet.getRow(row).getCell(column).getStringCellValue();
		return data;
	}

	public int getRowCount(int sheetIndex) {

		int row = wb.getSheetAt(sheetIndex).getLastRowNum();
		row = row + 1;
		return row;

	}

}
