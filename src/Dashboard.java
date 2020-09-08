import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboard {

	public static void main(String[] args) throws InterruptedException {

		BaseClass BaseClass = new BaseClass();
		WebDriver driver = BaseClass.BaseFunction();

//		// Click Bell icon
//		driver.findElement(By.xpath("//button[2]//span[1]//*[local-name()='svg']")).click();
//		Thread.sleep(15000);	
//		//Confirm Open Notification Panel
//		Boolean ConfirmNotifictionPenal = driver.findElement(By.xpath("//h5[text()='Notifications']	")).isDisplayed();	
//		System.out.println(ConfirmNotifictionPenal);
//		String NotificationPenal = ConfirmNotifictionPenal.getText();
//		if (ConfirmUser.equals("Notifications")) {
//			System.out.println("You Are Click Bell Icon");
//		} else {
//			System.out.println("You Are not Click Bell Icon");
//		}

//		//Click Search Icon
//		driver.findElement(By.xpath("//body/div[@id='root']/div[@class='jss27']/header[@class='MuiPaper-root MuiAppBar-root MuiAppBar-positionFixed MuiAppBar-colorPrimary jss31 mui-fixed MuiPaper-elevation4']/div[@class='MuiToolbar-root MuiToolbar-regular jss32 MuiToolbar-gutters']/button[1]")).click();
//		Thread.sleep(5000);

		// Click UserManagement
		driver.findElement(By.xpath("//span[contains(text(),'User Management')]")).click();
		Thread.sleep(5000);
		// if press List active user
		driver.findElement(By.xpath("//span[contains(text(),'List Active Users')]")).click();
		Thread.sleep(15000);
				
		//Active UserScreen
		// get title in Active Users screen
		String titleActiveU = driver.getTitle();
		Thread.sleep(5000);
		if (titleActiveU.equals("Customer List")) {
			System.out.println("You Are In Active UserScreen");
		} else {
			System.out.println("You Are not In Active UserScreen");
		}
		Thread.sleep(15000);

	
		// Close the Browser
		driver.close();
		System.out.println("Success Your Project");

	}

}
