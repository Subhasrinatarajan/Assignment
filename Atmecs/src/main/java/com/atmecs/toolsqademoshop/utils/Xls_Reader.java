package com.atmecs.toolsqademoshop.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader 
{
  public String path;
  public FileInputStream fis=null;
  public FileOutputStream fileOut=null;
  private XSSFWorkbook workbook=null;
  private XSSFSheet sheet=null;
  private XSSFRow row=null;
  private XSSFCell cell=null;
  
  public Xls_Reader(String path)
  {
	  this.path=path;
	  try {
		  fis=new FileInputStream(path);
		  workbook=new XSSFWorkbook(fis);
		  sheet=workbook.getSheetAt(0);
		  fis.close();
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
  }
	  public int getRowCount(String sheetName)
	  {
		  int index = workbook.getSheetIndex(sheetName);
		  if(index==-1)
		     return 0;
		  else {
			  sheet =workbook.getSheetAt(index);
			  int number=sheet.getLastRowNum()+1;
		      return number;
		  	  }
  }

     /**
      * returns the data from a cell
      */

  public String getCellData(String sheetName,String colName,int rowNum)
  {
	  try
	  {
		  if(rowNum<=0)
			  return "";
		  int index= workbook.getSheetIndex(sheetName);
		  int col_Num=-1;
		  if(index==-1)
		     return "";
		  
		  sheet =workbook.getSheetAt(index);
		  row=sheet.getRow(0);
		  for(int i=0;i<row.getLastCellNum();i++)
		  {
			  if(row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
			  {
				  col_Num=i;
			  }
			  if(col_Num==-1)
			  {
				  return "";
			  }
			  
			  sheet =workbook.getSheetAt(index);
			  row=sheet.getRow(rowNum-1);
			  if(row==null)
			  {
				  return "";
			  }
			  cell=row.getCell(col_Num);
			  if(cell==null)
			  {
				  return "";
			  }
			  if(cell.getCellType()==Cell.CELL_TYPE_STRING)
		  }
	  
  }	    		 
}		  
	  
  
  
