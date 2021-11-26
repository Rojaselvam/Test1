import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll_within_page {
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\roja.p\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");

		WebElement element=driver.findElement(By.xpath("/html/body/div[2]/section/div[3]/div[1]/div/p[9]/textarea"));
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		jse.executeScript("arguments[0].scrollIntoView(true);",element);
		 
		
		element.sendKeys("Roja");

}
}