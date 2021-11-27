import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;
import org.junit.Test;

public class AlertText {
	@Test
	public void AlertText_page() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\roja.p\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
	    driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
	    
	    Alert a1=driver.switchTo().alert();
	    a1.sendKeys("Rojaselvam");
	    String msg=a1.getText();
	    Thread.sleep(2000);
        a1.accept();
   	   System.out.println(msg);
}
}


