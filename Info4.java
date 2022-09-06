package infomat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class Info4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Infosel\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://demo.guru99.com/test/radio.html");
		WebElement w = d.findElement(By.xpath("//input[@value='Option 1']"));
		//WebElement v=d.findElement(By.xpath("//div[@id='droppable']"));
		int x=w.getLocation().getX();
		int y=w.getLocation().getY();
		Actions a=new Actions(d);
		a.moveByOffset(x, y).click().build().perform();
		
		//w.click();
		if(w.isSelected())
		{
			System.out.println("Selected");
		}
		else
		{
			System.out.println("Notselected");
		}
		
//		a.dragAndDropBy(w, 240, 413);
//		a.build().perform();
		
//		System.out.println("x="+x);
//		System.out.println("y="+y);
//		String t=d.getTitle();
//		System.out.println(t);
//		d.findElement(RelativeLocator.with(By.xpath("//a[.='Mobiles']")).toRightOf(w)).click();
//		RelativeBy r = RelativeLocator.with(By.xpath(""));
		//a.moveByOffset(x, y);
		
	
	}

}
