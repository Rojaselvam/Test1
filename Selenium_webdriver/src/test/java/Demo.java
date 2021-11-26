import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

public class Demo {

@Test
public void login_page()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\roja.p\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 
	WebDriver driver= new ChromeDriver();
    
   driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
   driver.findElement(By.id("ap_email")).sendKeys("roja@gmail.com");
   driver.findElement(By.id("continue")).click();
   
    		
}
}


