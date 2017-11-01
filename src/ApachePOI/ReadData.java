package ApachePOI;
			

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

		public class ReadData 
		{
			public static void main(String[] args) throws IOException 
			{
				String Username;
				String Password;
				
				File f1 = new File("D:\\HRM.xlsx");
				FileInputStream inputstream = new FileInputStream(f1);
				XSSFWorkbook wb1 = new XSSFWorkbook(inputstream);
				XSSFSheet ws1 = wb1.getSheet("Sheet1");
				
				int rowcount = ws1.getLastRowNum();
				for(int i=1;i<rowcount;i++)
				{
					Row r1 = ws1.getRow(i);
					Username = r1.getCell(0).getStringCellValue();
					Password = r1.getCell(1).getStringCellValue();
					System.out.println(Username + " ; " + Password);
				}
				inputstream.close();
				wb1.close();			
			}
	}


