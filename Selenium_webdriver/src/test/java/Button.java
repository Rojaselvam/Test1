import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;

public class Button  {
	@Test
	public void button_page()
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\roja.p\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
				 
		WebDriverWait W1=new WebDriverWait(driver,10);
		W1.until(ExpectedConditions.elementToBeClickable(By.id("home")));
		driver.findElement(By.id("home")).click();
		
		
		//WebDriverWait d1=new WebDriverWait(driver,10);
		 
	    //d1.until(ExpectedConditions.elementToBeClickable(By.id("position")));
		 		 
		//driver.findElement(By.id("position")).click();


}
}
