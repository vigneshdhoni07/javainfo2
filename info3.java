package infomat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import java.math.BigDecimal;
import java.math.BigInteger;

//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;

public class info3 {
	//private static Logger logger=LogManager.getLogger(info3.class);

	public static void main(String[] args) throws IOException
	{
		FileInputStream f=new FileInputStream("F:\\vig\\edu\\infosel\\excel handling\\tc2.xlsx");
		Workbook wb=new XSSFWorkbook(f);
		Sheet s = wb.getSheetAt(0);
		for(int i=0;i<=s.getLastRowNum();i++) 
		{
		
			Row row=s.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++)
			{
		
				try {
					String q=row.getCell(j).getStringCellValue();
					System.out.println(q);
					 }
					 catch(Exception b)
					 {
						 
							double x = row.getCell(1).getNumericCellValue();
							
							BigInteger y=new BigDecimal(x).toBigInteger();
							String l=y.toString();
							System.out.println(l);

					 }
		
			}
		}
//		int e = s.getLastRowNum();
//		System.out.println(e);
//		Row r= s.getRow(0);
//		System.out.println(r.getLastCellNum());
//		System.out.println(r.getCell(0).getStringCellValue());
//		 r= s.getRow(1);
//		 System.out.println(r.getLastCellNum());
		 
		
		

		
		
	

}
	}
