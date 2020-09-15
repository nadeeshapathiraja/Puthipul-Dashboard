import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse Workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://admin.puthipul.com/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		// Get Title
		String title = driver.getTitle();
		System.out.println(title);
		// Get Version
		WebElement versionElement = driver
				.findElement(By.xpath("//p[text()='Administration Dashboard Version 1.0.0']"));
		String version = versionElement.getText();
		System.out.println(version);

//				Check Correct Page
		if (title.equals("Login") && version.equals("Administration Dashboard Version 1.0.0")) {

			// Add username
			WebElement email_field = driver.findElement(By.name("email"));
			email_field.sendKeys("admin");

			// Add Password
			WebElement password_field = driver.findElement(By.name("password"));
			password_field.sendKeys("Admin123");
			Thread.sleep(5000);

			// Clicking on the login button to login to the application
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[3]/form/div[3]/button/span[1]"))
					.click();

			// Check LogIn Success
			Thread.sleep(10000);
			WebElement ConfirmDashboard = driver.findElement(By.xpath("//a[text()='Puthipul Admin']"));
			String ConfirmUser = ConfirmDashboard.getText();
			if (ConfirmUser.equals("Puthipul Admin")) {
				System.out.println("LogIn Success");
			} else {
				System.out.println("LogIn Fail");
			}

			driver.findElement(By.xpath("//h6[text()='Puthipul Admin']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//text()[.='Logout']/ancestor::li[1]")).click();
			Thread.sleep(10000);

			// Confirm for Go back the Correct Site after press Logout
			if (title.equals("Login") && version.equals("Administration Dashboard Version 1.0.0")) {
				System.out.println("LogOut Success");
			} else {
				System.out.println("LogOut Fail");
			}
		} else {
			System.out.println("Incorrect Page");
		}

		Thread.sleep(10000);
		// Close the Browser
		driver.close();
		System.out.println("Success Your Project"); 

	}

}
