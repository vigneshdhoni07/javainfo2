package infomat;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.apache.poi.sl.draw.DrawBackground;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Info7 {
	 
    public static void main(String[] args) throws InterruptedException, AWTException {
    	System.setProperty("webdriver.chrome.driver", "F:\\Infosel\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		d.get("https://www.grammarly.com/plagiarism-checker"); 
		JavascriptExecutor executor = (JavascriptExecutor)d;
		executor.executeScript("window.scrollBy(0,300)");

		WebElement wb = d.findElement(By.xpath("//div[@class='_3255a-uploadButton']"));
		wb.click(); 
		Thread.sleep(2000); 
		//JavascriptExecutor executor = (JavascriptExecutor)d;
		//executor.executeScript("window.scrollBy(0,300)");
		//executor.executeScript("arguments[0].click();", wb);
 		// creating object of Robot class
		Thread.sleep(2000);
		/*Actions a=new Actions(d);
		int x=wb.getLocation().getX();
		int y=wb.getLocation().getY();
		a.moveByOffset(x, y);
		a.click().build().perform();*/
		Robot rb = new Robot();
 
		// copying File path to Clipboard
	    StringSelection str = new StringSelection("F:\\vig\\edu\\infosel\\4_Radio and Check box.docx");
	 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//	 
//	     // press Contol+V for pasting
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
//	 
//	    // release Contol+V for pasting
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
//	 
//	    // for pressing and releasing Enter
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	   }

}
