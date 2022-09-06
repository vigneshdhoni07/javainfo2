package infomat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datapro2 {

public static String[][] b;


public static String[][] out() 
{	
	FileInputStream excel;
	XSSFWorkbook WB = null;
	try {
		excel = new FileInputStream("F:\\vig\\edu\\infosel\\excel handling\\tc3.xlsx");
		WB=new XSSFWorkbook(excel);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	XSSFSheet S= WB.getSheetAt(0);
	int lr=S.getLastRowNum();
		int lc = S.getRow(0).getLastCellNum();
		System.out.println(lr);
		
		b=new String[lr+1][lc];
	
	for(int i=0;i<=lr;i++)
	{	
		XSSFRow r = S.getRow(i);
		for(int j=0;j<lc;j++)
		{
			b[i][j]=r.getCell(j).toString();
		}
	}
		
	return b;
}
	public static void main(String[] args) {
		out();
		
		}

}
