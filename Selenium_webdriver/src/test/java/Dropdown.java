import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
//import org.junit.Test;

public class Dropdown{
	
		@Test
		public void dropdown_page() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\roja.p\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 
			WebDriver driver= new ChromeDriver();
			driver.get("http://www.leafground.com/pages/Dropdown.html");
			
		       	
			Select drop=new Select(driver.findElement(By.id("dropdown1")));
		    drop.selectByValue("4");
		     
		    Thread.sleep(3000);

		    		    
	        Select drop1=new Select(driver.findElement(By.name("dropdown2")));
	        drop1.selectByVisibleText("Appium");
		    
		    Select drop2=new Select(driver.findElement(By.id("dropdown3")));
		    drop2.selectByVisibleText("UFT/QTP");
		    
		    Select drop3=new Select(driver.findElement(By.className("dropdown")));
		    drop3.selectByIndex(1);
		    
		    Select drop4=new Select(driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/select")));
		    drop4.selectByIndex(4);
		    Thread.sleep(3000);
		    
		    
		       
		   Select drop5=new Select(driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[6]/select")));
		    drop5.selectByIndex(1);
		    drop5.selectByValue("4");
		  drop5.selectByVisibleText("UFT/QTP");
		   Thread.sleep(3000);
		    Boolean output= drop3.isMultiple();
		    System.out.println(output);

		    drop5.deselectByVisibleText("UFT/QTP");
		    Thread.sleep(3000);
		    drop5.deselectByValue("4");
		    Thread.sleep(3000);
		    drop5.deselectAll();
		    
		    
		    		   
			}
		
		}

