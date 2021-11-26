	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Action;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.Test;

	public class draggable {
		@Test

		public void Drap_page() throws InterruptedException
		{

			System.setProperty("webdriver.chrome.driver","C:\\Users\\roja.p\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 
			WebDriver driver= new ChromeDriver();
			
			driver.get("http://www.leafground.com/pages/drag.html");
			WebElement W1=driver.findElement(By.id("draggable"));
			
			
			Actions act1=new Actions(driver);
			Thread.sleep(2000);
		    act1.dragAndDropBy(W1,250, 350).build().perform();
			
		
				
			
			
		}
	

}
