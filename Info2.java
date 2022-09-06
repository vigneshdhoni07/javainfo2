package infomat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Info2 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Infosel\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		String q="";


		d.navigate().to("https://www.amazon.in/ap/register?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_newcust");
		WebElement name = d.findElement(By.xpath("//*[@id='ap_customer_name']"));
//		//name.sendKeys("karthi");
		WebElement ph=d.findElement(By.xpath("//*[@id='ap_phone_number']"));
//		//ph.sendKeys("77896543798");
	WebElement Email=d.findElement(By.xpath("//*[@id='ap_email']"));
//		//Email.sendKeys("51298surya@gmail.com");
	WebElement pswd=d.findElement(By.xpath("//*[@id='ap_password']"));
//		pswd.sendKeys("sun23451");
//		
		FileInputStream op=new FileInputStream("F:\\vig\\edu\\infosel\\excel handling\\tc2.xlsx"); //we get the location of the file by using fileinput stream
		XSSFWorkbook WB=new XSSFWorkbook(op);    //we get the workbook by inputstream
	XSSFSheet S=WB.getSheetAt(0);            //we get the sheet in workbook either by get-index0 or by sheet name

			Row Row=S.getRow(1);  //get first row
			int cl = Row.getLastCellNum();
			for(int c=0;c<cl;c++)     //representing CELL loop in each row
			{
		
			
			try {
				 q=Row.getCell(c).getStringCellValue();
				//System.out.println(q);
				 }
				 catch(Exception b)
				 {
					 
						double x = Row.getCell(c).getNumericCellValue();
						
						BigInteger y=new BigDecimal(x).toBigInteger();
						 q=y.toString();
						//System.out.println(l);

				 }
				if(c==0) 
				{
			name.sendKeys(q);
				}
				else if(c==1) 
				{
					ph.sendKeys(q);
				}
				else if(c==2) 
				{
				Email.sendKeys(q);
			    }
			    else if(c==3) 
			    {
				pswd.sendKeys(q);
			    }
			}
	
				
		//Thread.sleep(1000);
		//d.quit();

	}

}
