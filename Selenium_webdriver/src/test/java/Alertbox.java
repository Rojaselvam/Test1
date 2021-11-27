import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
//import org.junit.Test;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class Alertbox {


	
		@Test
		public void Alert_page() throws InterruptedException, AWTException, IOException
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\roja.p\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 
			WebDriver driver= new ChromeDriver();
			//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("http://demo.automationtesting.in/Alerts.html");
			
			driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
			
			Alert a1=driver.switchTo().alert();
		    Robot r1=new Robot();
		    Dimension Var1=Toolkit.getDefaultToolkit().getScreenSize();
		    Rectangle rec=new Rectangle(Var1);
		    BufferedImage src=r1.createScreenCapture(rec);
		    File dest=new File("C:\\Users\\roja.p\\Downloads\\Screenshot\\s1");
		    ImageIO.write(src,"png",dest);
		   
								
			String msg=a1.getText();
	
			a1.accept();
			
			System.out.println(msg);
}
}