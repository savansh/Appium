import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Test1 {

	
	public WebDriver driver;
	
	@BeforeClass
	public void SetUp() throws MalformedURLException {
		//Create Object for Capibilities
		DesiredCapabilities capibility=new DesiredCapabilities();
		//set capibility for OS
		capibility.setCapability("platformName", "Android");
		//set capibility for Device Name
		capibility.setCapability("deviceName", "ZY222V3PLZ");
		//set Version of the OS
		capibility.setCapability("CapabilityType.VERSION","6.0.1");
	   //set capibility for app Package
		capibility.setCapability("appPackage", "com.flipkart.android");
		//Set Capibility for App Activity
		capibility.setCapability("appActivity", "com.flipkart.android.SplashActivity");
		
		//create Remote Webdriver Object
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capibility);
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test()
	public void TestFlipkart(){
		
	}
}
