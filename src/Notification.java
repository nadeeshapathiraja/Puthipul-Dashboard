import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Notification {

	public static void main(String[] args) throws InterruptedException {

		BaseClass BaseClass = new BaseClass();
		WebDriver driver = BaseClass.BaseFunction();

		// Click Notification
		driver.findElement(By.xpath("//span[contains(text(),'Notifications')]")).click();
		Thread.sleep(15000);

		// get title in List Product
		String titleNotification = driver.getTitle();
		Thread.sleep(5000);
		if (titleNotification.equals("Mail")) {
			System.out.println("You are in Notificatio Screen");
		} else {
			System.out.println("You Are not in Notification Screen");
		}

		// Click Compose Button
		driver.findElement(By.xpath("//span[contains(text(),'Compose')]")).click();

//		WebElement Notification = findElement(By.xpath("/html/body/div[4]/div[1]/h5"));
//		String NotificationTitle = Notification.getText();
//		System.out.println(NotificationTitle);

		// Add Notification Title & Content After One test Change this Content and Title
		String Title = "This is Delete Test Notification Title";
		String Content = "This is Delete Test Notification Content.";

		WebElement AddNotificationTitle = driver.findElement(By.xpath("//input[@placeholder='Notification title']"));
		AddNotificationTitle.sendKeys(Title);
		WebElement AddNotificationContent = driver
				.findElement(By.xpath("//textarea[@placeholder='Notification content']"));
		AddNotificationContent.sendKeys(Content);

		// Click Send Button
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/button")).click();
		Thread.sleep(15000);

		// Check Notification Send Success
		// Confirm Phone verify is true
		WebElement BaseLine = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]"));

		WebElement GetTitle = BaseLine
				.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/div/a"));
		Thread.sleep(5000);
		String TitleValue = GetTitle.getText();

		WebElement GetContent = BaseLine
				.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/div/p[1]"));
		Thread.sleep(5000);
		String ContentValue = GetContent.getText();

		// Check
		if (TitleValue.equals(Title)) {
			if (ContentValue.equals("-" + Content)) {
				System.out.println("Your Notification Send Success");
			} else {
				System.out.println("Your Notification Content Not Working");
			}

		} else {
			System.out.println("Your Notification Send Unsuccess");
		}

		// Check Delete button Function
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/div/p[2]/button[2]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[3]/button[2]/span[1]")).click();
		Thread.sleep(10000);

		//
		WebElement NewBaseLine = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]"));

		//Get New Title Value and Content Value
		WebElement NewGetTitle = NewBaseLine
				.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/div/a"));
		Thread.sleep(5000);
		String NewTitleValue = NewGetTitle.getText();

		WebElement NewGetContent = NewBaseLine
				.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/div/p[1]"));
		Thread.sleep(5000);
		String NewContentValue = NewGetContent.getText();
		Thread.sleep(10000);
		// Check Old and New Are 
		if (!NewTitleValue.equals(Title)) {
			if (!NewContentValue.equals("-" + Content)) {
				System.out.println("Your Notification Delete Function Working Correct");
			} 

		} else {
			System.out.println("Your Notification Delete Function Not working");
		}

		Thread.sleep(10000);
		// Close the Browser
		driver.close();
		System.out.println("Success Your Project");

	}

}
