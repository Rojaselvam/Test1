import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
//import org.junit.Test;

public class Checkbox {

	
		@Test
		public void login_page() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\roja.p\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 
			WebDriver driver= new ChromeDriver();
			driver.get("http://www.leafground.com/");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			Thread.sleep(3000);
			  WebElement d=driver.findElement(By.xpath("//img[contains(@alt,'Checkbox')]"));
			//driver.get("http://www.leafground.com/pages/checkbox.html");
			d.click();
			Thread.sleep(3000);
			WebElement d1=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[5]/input"));
			  d1.click();
			  Thread.sleep(3000);
			  WebElement d2=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div[3]/input"));
			  d2.click();
			  //WebElement d3=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/input"));
			  //d3.click();
			  Thread.sleep(3000);
			  WebElement d4=driver.findElement(By.xpath(" //*[@id='contentblock']/section/div[3]/div[1]/input"));
			  d4.click();
			  Thread.sleep(3000);
			  WebElement d5=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div[5]/input"));
	        		  
			  d5.click();
			  WebElement d6=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div[3]/input"));
			  d6.click();
			  WebElement d7=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[1]/input"));
			  d7.click();
			  Thread.sleep(3000);
			
	        driver.close();
		}
		}
	