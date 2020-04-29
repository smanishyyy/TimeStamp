package com.snow.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataHelper {
public static HashMap<String, String> storeValues = new HashMap<>();
public static FileInputStream fs ;
public static XSSFWorkbook wb;
public static XSSFSheet sheet;
public static String filePathS;
@SuppressWarnings("incomplete-switch")
public static List<HashMap<String, String>> readExcelDatafromFile(String filePath, String sheetName) {
	filePathS=filePath;
	System.out.println("filePathS : "+filePathS);
// create Java List to store Hashmaps
List<HashMap<String, String>> excelData = new ArrayList<>();

try {
 fs = new FileInputStream(filePathS);
 wb= new XSSFWorkbook(fs);
 sheet= wb.getSheet(sheetName);

// catch header row, so that you can use it as Key for your hashmap
Row HeaderRow = sheet.getRow(0);

for (int r = 1; r <= sheet.getPhysicalNumberOfRows(); r++) {
Row CurrentRow = sheet.getRow(r);
// each row of data is stored in new hashmap
HashMap<String, String> currentRowMap = new HashMap<>();

for (int c = 0; c < CurrentRow.getLastCellNum(); c++) {

Cell CurrentCell = CurrentRow.getCell(c);
if (CurrentCell == null) {

currentRowMap.put(HeaderRow.getCell(c).getStringCellValue(), " " + "\n");

}
else
{
	switch(CurrentCell.getCellType())
    {
    case STRING:
    	String c3 = CurrentCell.getStringCellValue().toString();
    	currentRowMap.put(HeaderRow.getCell(c).getStringCellValue(), c3 + "\n");
        break;
    case NUMERIC:
    String c4 = NumberToTextConverter.toText(CurrentCell.getNumericCellValue());
    currentRowMap.put(HeaderRow.getCell(c).getStringCellValue(), c4 + "\n");
        break;
    case BOOLEAN:
    	 Boolean b= CurrentCell.getBooleanCellValue();
    	String c5= b.toString();
    	 currentRowMap.put(HeaderRow.getCell(c).getStringCellValue(), c5 + "\n");
        break;
    }
}


}
excelData.add(currentRowMap);

}
wb.close();
fs.close();

} catch (Exception e) {
// e.printStackTrace();

}
return excelData;

}

public static void setCellData(String SetData,int RowNum, int ColNum, String excelpath,String tabName) throws IOException
{
	fs=new FileInputStream(excelpath);
	wb=new XSSFWorkbook(fs);
	sheet=wb.getSheet(tabName);
	
	
	XSSFRow row;
	XSSFCell cell;
	
	try
	{
	row=sheet.getRow(RowNum);
	cell=sheet.getRow(RowNum).getCell(ColNum);
	if(cell==null)
	{
		cell=row.createCell(ColNum);
		cell.setCellValue(SetData);
	}
	else
	{
		cell.setCellValue(SetData);	
	}
	
	
	FileOutputStream fileOut=new FileOutputStream(excelpath);
	wb.write(fileOut);
	fileOut.flush();
	fileOut.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}
{
	
}
}
