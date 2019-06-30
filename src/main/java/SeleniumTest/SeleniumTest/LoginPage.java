/**
 * 
 */
package SeleniumTest.SeleniumTest;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author smitra
 *
 */
public class LoginPage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
	//	public static void googlesearch() {
			
	//	String projectPath = System.getProperty("user.dir");
	//	System.setProperty("webdriver.chrome.driver", projectPath+"/driver/chromedriver.exe");
		
		
		/*Below is the code to open the Firefox Browser */
		
		File gecko = new File("C:\\Users\\smitra.EUROPE\\Documents\\driver\\geckodriver.exe"); 
	//	File chrome = new File("C:\\Users\\smitra.EUROPE\\Documents\\driver\\chromedriver.exe"); 
		
		/*Below is the code to open the Firefox Browser */
		
		System.setProperty("webdriver.gecko.driver", gecko.getAbsolutePath());
		//System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
				
		//System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		
		/*Below is the code to open the website */
		
		driver.get("http://www.google.de");
		
		driver.manage().window().maximize();
		
		/*Below is the code to find the search area */
		
		driver.findElement(By.xpath("//body[@id='gsr']")).sendKeys("Shreya Mitra is the best");
		
		/*Below is the code to click on the search button */
		
		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).click();
		
		/*Below is the code to close the Firefox Browser */
		
		driver.close();
		
	}

}
