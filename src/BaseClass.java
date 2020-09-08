import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	public static String browserName = null;
	public static String website = null;

	public WebDriver BaseFunction() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse Workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://admin.puthipul.com/login");
		driver.manage().window().maximize();
		// Add username
		WebElement email_field = driver.findElement(By.name("email"));
		email_field.sendKeys("admin");

		// Add Password
		WebElement password_field = driver.findElement(By.name("password"));
		password_field.sendKeys("Admin123");
		Thread.sleep(1000);

		// Clicking on the login button to login to the application
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[3]/form/div[3]/button/span[1]")).click();
		
		return driver;
		
		
	}

}
