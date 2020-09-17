import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeadEngine {

	public static void main(String[] args) throws InterruptedException {

		BaseClass BaseClass = new BaseClass();
		WebDriver driver = BaseClass.BaseFunction();

		
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
		
		
		Thread.sleep(10000);
		// Close the Browser
		driver.close();
		System.out.println("Success Your Project");
		

	}

}
