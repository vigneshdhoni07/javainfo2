package infomat;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Info6 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Infosel\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.co.in/");
		WebElement x = d.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		x.sendKeys("filp");
		int i=0;
		List<WebElement> w =  d.findElements(By.xpath("//li[@role='presentation']"));
//		System.out.println(w.size());
//		System.out.println(w);
		for(WebElement p:w)
		{
		if(p.getText().equals("flip flop"))	
		{
			Thread.sleep(3000);
			p.click();
			
			
		}
		}
		
		
		
		d.quit();
	}

}
