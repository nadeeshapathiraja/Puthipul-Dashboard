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

//------------------------Check After Create Project--------------------
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
//----------------------------------------------------------------------------------------
		// Click Puthipul Admin
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[2]/button/h6")).click();

		// Go to the Account Screen(Can't Change)
		driver.findElement(By.xpath(
				"//a[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button']"))
				.click();
		Thread.sleep(5000);

		// Click Again Puthipul Admin for hide menu
		driver.findElement(By.xpath("//div[@class='MuiPopover-root']//div[1]")).click();
		Thread.sleep(5000);

		// get title in Lead Engine
		String AccountPage = driver.getTitle();
		Thread.sleep(5000);
		if (AccountPage.equals("Settings")) {
			System.out.println("Correctly Go to the Account Settings Screen");
		} else {
			System.out.println("Can't Go to the Account Settings Screen");
		}
		Thread.sleep(15000);

		// Come Back to Dashboard again
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[2]/ul[1]/ul/li/a/span[1]/span"))
				.click();
		Thread.sleep(20000);

		// Come Back to Dashboard again
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[2]/ul[1]/ul/li/a/span[1]/span"))
				.click();
		Thread.sleep(20000);
		// Click UserManagement
		driver.findElement(By.xpath("//span[contains(text(),'User Management')]")).click();
		Thread.sleep(5000);

		// if press List active user
		driver.findElement(By.xpath("//span[contains(text(),'List Active Users')]")).click();
		Thread.sleep(15000);

		// Active UserScreen
		// get title in Active Users screen
		String titleActiveU = driver.getTitle();
		Thread.sleep(5000);
		if (titleActiveU.equals("Customer List")) {
			System.out.println("Correctly Go to the Active UserScreen");
		} else {
			System.out.println("Can't Go to the Active UserScreen");
		}
		Thread.sleep(5000);
		// Come Back to Dashboard again
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[2]/ul[1]/ul/li/a/span[1]/span"))
				.click();
		Thread.sleep(20000);

		// if press List Inactive user
		driver.findElement(By.xpath("//span[contains(text(),'List Inactive Users')]")).click();
		Thread.sleep(15000);

		// Inactive UserScreen
		// get title in Inactive Users screen
		String titleInactiveU = driver.getTitle();
		Thread.sleep(5000);
		if (titleInactiveU.equals("Customer List")) {
			System.out.println("Correctly Go to the InActive User Screen");
		} else {
			System.out.println("Can't Go to the InActive User Screen");
		}
		Thread.sleep(5000);
		// Come Back to Dashboard again
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[2]/ul[1]/ul/li/a/span[1]/span"))
				.click();
		Thread.sleep(20000);

		// Click Product Catalog
		driver.findElement(By.xpath("// span[contains(text(),'Product Catalog')]")).click();
		Thread.sleep(5000);
		// if press List Product
		driver.findElement(By.xpath("//span[contains(text(),'List Products')]")).click();
		Thread.sleep(15000);

		// get title in List Product
		String titleListProduct = driver.getTitle();
		Thread.sleep(5000);
		if (titleListProduct.equals("Product List")) {
			System.out.println("Correctly Go to the List Product Screen");
		} else {
			System.out.println("Can't Go to the List Product Screen");
		}
		// Come Back to Dashboard again
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[2]/ul[1]/ul/li/a/span[1]/span"))
				.click();
		Thread.sleep(20000);

		// if press Add Product
		driver.findElement(By.xpath("//span[contains(text(),'Add Product')]")).click();
		Thread.sleep(15000);
		// get title in Add Product
		String titleAddProduct = driver.getTitle();
		Thread.sleep(5000);
		if (titleAddProduct.equals("Product Create")) {
			System.out.println("Correctly Go to the Add Product Screen");
		} else {
			System.out.println("Can't Go to the Add Product Screen");
		}
		// Come Back to Dashboard again
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[2]/ul[1]/ul/li/a/span[1]/span"))
				.click();
		Thread.sleep(20000);

		// if press Notification
		driver.findElement(By.xpath("//span[contains(text(),'Notifications')]")).click();
		Thread.sleep(15000);
		// get title in Notification
		String NotificationScreen = driver.getTitle();
		Thread.sleep(5000);
		if (NotificationScreen.equals("Mail")) {
			System.out.println("Correctly Go to the Notification Screen");
		} else {
			System.out.println("Can't Go to the Notification Screen");
		}
		// Come Back to Dashboard again
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[2]/ul[1]/ul/li/a/span[1]/span"))
				.click();
		Thread.sleep(20000);

		// if press Lead Engine
		driver.findElement(By.xpath("//span[contains(text(),'Lead Engine')]")).click();
		Thread.sleep(15000);
		// get title in Lead Engine
		String LeadEngine = driver.getTitle();
		Thread.sleep(5000);
		if (LeadEngine.equals("Leads")) {
			System.out.println("Correctly Go to the Lead Engine Screen");
		} else {
			System.out.println("Can't Go to the Lead Engine Screen");
		}
		// Come Back to Dashboard again
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[2]/ul[1]/ul/li/a/span[1]/span"))
				.click();
		Thread.sleep(20000);

		// -----------No specil Report Screen------------
		// if press Report
//		driver.findElement(By.xpath("//span[contains(text(),'Reports')]")).click();
//		Thread.sleep(15000);
//		// get title in Report Screen
//		String Report = driver.getTitle();
//		System.out.println(Report);
//		Thread.sleep(5000);
//		if (Report.equals("Product Create")) {
//			System.out.println("Correctly Go to the Preport Screen");
//		} else {
//			System.out.println("Can't Go to the Report8 Screen");
//		}
//		// Come Back to Dashboard again
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[2]/ul[1]/ul/li/a/span[1]/span"))
//				.click();
//		Thread.sleep(20000);
		// -----------------------------------------------

		// Click Puthipul Admin
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[2]/button/h6")).click();
		Thread.sleep(1000);
		// Click Logout Button
		driver.findElement(By.xpath("//text()[.='Logout']/ancestor::li[1]")).click();
		Thread.sleep(5000);
		
		// get title in Login Screen
		String LoginScreen = driver.getTitle();
		System.out.println(LoginScreen);
		Thread.sleep(5000);
		if (LoginScreen.equals("Login")) {
			System.out.println("Correctly Go to the LogIn Screen After Press Logout");
		} else {
			System.out.println("Can't Go to the LogIn Screen After Press Logout");
		}

		Thread.sleep(10000);
		// Close the Browser
		driver.close();
		System.out.println("Success Your Project");

	}

}
