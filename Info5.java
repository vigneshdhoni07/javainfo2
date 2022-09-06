package infomat;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Consumer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Info5 {
	static public void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Infosel\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://www.rediff.com/");
		//String s = d.getWindowHandle();
		d.switchTo().newWindow(WindowType.TAB);
		d.get("https://www.google.com/");
		d.switchTo().newWindow(WindowType.WINDOW);
		d.get("https://www.amazon.in/");
		d.switchTo().newWindow(WindowType.TAB);
		d.get("https://www.flipkart.com/");
		Set<String> h = d.getWindowHandles();
		int q=h.size();
		ArrayList<String> a=new ArrayList<String>();
//		System.out.println("Enter Site Name");
//		Scanner r=new Scanner(System.in);
//		String w=r.nextLine();
		String w="AMAZON";
		
		for( String i:h)
		{
			a.add(i);
		}
		
		for(int i=0;i<a.size();i++)
		{
			if(d.switchTo().window(a.get(i)).getTitle().toUpperCase().contains(w))
			{
				d.switchTo().window(w);
				break;
			}
		}
	}

}
