import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Set;
import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Addcookies {

	@Test
	public void Hcl_page() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\roja.p\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.findElement(By.id("ap_email")).sendKeys("roja@gmail.com");
		driver.findElement(By.id("continue")).click();
		
		File f1=new File("C:\\Users\\roja.p\\OneDrive - HCL Technologies Ltd\\Pictures\\cookies.data");
		try {
			f1.createNewFile();
			FileWriter fw= new FileWriter(f1);
		    BufferedWriter bw=new BufferedWriter(fw);
	     	Set<Cookie> cookies = driver.manage().getCookies();
            System.out.println("Size of cookies in amazon:"+ cookies.size());
       
       for(Cookie ck:driver.manage().getCookies())
       {
    	   
				bw.write((ck.getDomain()+";"+ck.getName()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.getValue()+";"+ck.isSecure()));
			
       
       bw.newLine();
       }
    	   
          Cookie cookiess=new Cookie("addcookies","1234");
          driver.manage().addCookie(cookiess);
           Set<Cookie> cookies1 = driver.manage().getCookies();
          System.out.println("Size of cookies after adding: "+ cookies1.size());
         
         driver.manage().deleteCookie(cookiess);
         Set<Cookie> afterdel=driver.manage().getCookies();
         System.out.println("count of cookies  :"+ afterdel.size()); 
          
         driver.manage().deleteAllCookies();
         Set<Cookie> afterdelete=driver.manage().getCookies();
         System.out.println("count of cookies  :"+ afterdelete.size()); 
       
       bw.close();
       fw.close();
	}
	
				
	catch(Exception e){
		 System.out.println(e);
	}
	}
}

