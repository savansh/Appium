import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Flipkart {

 WebDriver driver;

 @BeforeClass
 public void setUp() throws MalformedURLException {
  // Created object of DesiredCapabilities class.
  DesiredCapabilities capabilities = new DesiredCapabilities();

  // Set android deviceName desired capability. Set your device name.
  capabilities.setCapability("deviceName", "ZY222V3PLZ");

  // Set BROWSER_NAME desired capability. It's Android in our case here.
  capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");

  // Set android VERSION desired capability. Set your mobile device's OS version.
  capabilities.setCapability(CapabilityType.VERSION, "6.0.1");

  // Set android platformName desired capability. It's Android in our case here.
  capabilities.setCapability("platformName", "Android");

  // Set android appPackage desired capability. It is
  // com.android.calculator2 for calculator application.
  // Set your application's appPackage if you are using any other app.
  capabilities.setCapability("appPackage", "com.flipkart.android");

  // Set android appActivity desired capability. It is
  // com.android.calculator2.Calculator for calculator application.
  // Set your application's appPackage if you are using any other app.
  capabilities.setCapability("appActivity", "com.flipkart.android.SplashActivity");

  // Created object of RemoteWebDriver will all set capabilities.
  // Set appium server address and port number in URL string.
  // It will launch calculator app in android device.
  driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  
  
 }
//test is not working
 @Test
 public void testFirstCalculator() throws InterruptedException {
  
 /*
  //Click on Search
  driver.findElements(By.id("com.flipkart.android:id/search_widget_textbox")).get(0).clear();
  Thread.sleep(5000);
  driver.findElements(By.id("com.flipkart.android:id/back_icon")).get(1).click();
*/
	 
	 //tap on Electronics
	 //driver.findElement(By.id("com.flipkart.android:id/mobilesTile")).click();
	 driver.findElement(By.name("Electronics")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.name("Audio & Video")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.name("All Audio & Video")).click();
     Thread.sleep(5000);
     driver.findElement(By.name("JBL T250SI Wired Headphone #OnlyOnFlipkart")).click();
    
 }
}