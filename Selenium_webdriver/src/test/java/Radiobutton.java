//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Radiobutton {

	@Test
	public void login_page() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\roja.p\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver= new ChromeDriver();
	    
	   driver.get("http://www.leafground.com/pages/radio.html");
	   Thread.sleep(3000);
	   driver.findElement(By.id("no")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/label[2]/input")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/input[3]")).click();
	   Thread.sleep(3000);
       driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/input[1]")).click();
    	Thread.sleep(3000);
	   driver.close();
	}
	

		
}
