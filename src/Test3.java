import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Test3 {

	public WebDriver driver;
	
	@BeforeClass()
	
	public void SetUp() throws MalformedURLException{
		DesiredCapabilities capibilities=new DesiredCapabilities();
		
		capibilities.setCapability("platformName", "Android");
		
		capibilities.setCapability("deviceName", "ZY222V3PLZ");
		
		capibilities.setCapability("CapabilityType.VERSION", "6.0.1");
		
		capibilities.setCapability("appPackage", "com.flipkart.android");
		
	    capibilities.setCapability("appActivity", "com.flipkart.android.SplashActivity");
	    
	    driver=new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capibilities);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	@Test()
	public void Test4(){
		
	}
	
}
