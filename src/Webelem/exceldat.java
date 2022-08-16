package Webelem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exceldat {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\ssingh\\IT\\New Microsoft Excel Worksheet.xlsx");
		  Sheet s = WorkbookFactory.create(file).getSheet("Sheet1");
		  int as = s.getLastRowNum();
		  for(int i=0;i<=as;i++)
		  {
			 int aw = s.getRow(i).getLastCellNum()-1;
			  for(int j = 0;j<=aw;j++)
			  {
			  String ad = s.getRow(i).getCell(j).getStringCellValue();
			  System.out.print(ad+" ");
			  
			  }
			  
			  System.out.println();
			  
			  
		  }
		 
	
		
	}

}
