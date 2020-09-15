import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Notification {

	public static void main(String[] args) throws InterruptedException {

		BaseClass BaseClass = new BaseClass();
		WebDriver driver = BaseClass.BaseFunction();

		//Click Notification
		driver.findElement(By.xpath("//span[contains(text(),'Notifications')]")).click();
		Thread.sleep(15000);

		// get title in List Product
		String titleNotification = driver.getTitle();
		System.out.println(titleNotification);
		Thread.sleep(5000);
		if (titleNotification.equals("Mail")) {
			System.out.println("You are in Notificatio Screen");
		} else {
			System.out.println("You Are not in Notification Screen");
		}
		
		//Click Compose Button
		driver.findElement(By.xpath("//span[contains(text(),'Compose')]")).click();
		
		
		
		Thread.sleep(10000);
		// Close the Browser
		driver.close();
		System.out.println("Success Your Project");

	}

}
