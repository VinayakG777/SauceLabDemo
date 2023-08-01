package com.saucedemo.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	//public  static HashMap<String, String>  readExcel() throws IOException
	{
		String path=System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\saucedemologin.xlsx";
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
	int row_count=sheet.getLastRowNum()+1;
	int cell_count=sheet.getRow(0).getLastCellNum();
	HashMap<String,String> hm=new HashMap<String,String>();
	for(int i=0;i<row_count;i++)
	{
		String key=sheet.getRow(i).getCell(0).getStringCellValue();
		String value=sheet.getRow(i).getCell(1).getStringCellValue();
		hm.put(key, value);
	}
	return hm;
	}
	public static void main(String[] args) throws IOException {
		HashMap<String, String> hm = ExcelReader.readExcel();
		for(Entry<String,String> gb:hm)
		{
			ok;
		}
	}//

}
