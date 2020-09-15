import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProduct {

	public static void main(String[] args) throws InterruptedException {

		BaseClass BaseClass = new BaseClass();
		WebDriver driver = BaseClass.BaseFunction();

		// Click Product Catalog
		driver.findElement(By.xpath("// span[contains(text(),'Product Catalog')]")).click();
		Thread.sleep(5000);
		// Got to the add product screen
		driver.findElement(By.xpath("//span[contains(text(),'Add Product')]")).click();
		Thread.sleep(5000);
		// get title in Add Product
		String titleAddProduct = driver.getTitle();
		Thread.sleep(5000);
		if (titleAddProduct.equals("Product Create")) {
			System.out.println("You are in Add Product Screen");
		} else {
			System.out.println("You are not in Add Product Screen");
		}
		Thread.sleep(15000);
		
		//Cancle button Check
		driver.findElement(By.xpath("//span[contains(text(),'Cancel')]")).click();
		Thread.sleep(15000);
		// get title in List Product
		String titleListProduct = driver.getTitle();
		Thread.sleep(5000);
		if (titleListProduct.equals("Product List")) {
			System.out.println("Your Cancle button Working");
		} else {
			System.out.println("Your Cancle button Not Working");
		}
				
		// Got to the add product screen Again
		driver.findElement(By.xpath("//span[contains(text(),'Add Product')]")).click();
		Thread.sleep(5000);
		
		// Add Product Name
		WebElement product_name = driver.findElement(By.xpath("//input[@name='name']"));
		product_name.sendKeys("Test Autmaion 1");

		// Add Product Id
		WebElement productID = driver.findElement(By.xpath("//input[@name='productID']"));
		productID.sendKeys("Test2");

		// Add Product Description
		WebElement shortDescription = driver.findElement(By.xpath("//textarea[@name='shortDescription']"));
		shortDescription.sendKeys("Test Autmaion 3");

		// Add Product Details 1
		WebElement productDetails1 = driver.findElement(By.xpath("//input[@name='productDetails']"));
		productDetails1.sendKeys("Test Autmaion Details 1");
		driver.findElement(By.xpath("//span[contains(text(),'Add more features')]")).click();
		Thread.sleep(1000);
		
		// Add Product Details 2
		WebElement productDetails2 = driver.findElement(By.xpath("//input[@name='productDetails']"));
		productDetails2.sendKeys("Test Autmaion Details 2");
		driver.findElement(By.xpath("//span[contains(text(),'Add more features')]")).click();
		Thread.sleep(1000);
		
		// Add Product Details 3
		WebElement productDetails3 = driver.findElement(By.xpath("//input[@name='productDetails']"));
		productDetails3.sendKeys("Test Autmaion Details 3");
		driver.findElement(By.xpath("//span[contains(text(),'Add more features')]")).click();
		Thread.sleep(1000);
		
	
		
//		// Add Product Image
//		//Click "Click here" Button
//		WebElement ClickButton = driver.findElement(By.className("MuiTypography-root MuiLink-root MuiLink-underlineAlways MuiTypography-colorPrimary"));
//		Thread.sleep(15000);
//		//Change file and File Path
//		ClickButton.sendKeys("C:\\Users\\Nadeesha\\Downloads\\Card\\Icon-mastercard-cc-acleda-bank.png");
//		Thread.sleep(15000);
//			//Start Data Select
		//driver.findElement(By.xpath("//div[@class='MuiBox-root jss785']//div[1]//div[1]//div[1]//button[1]//span[1]")).click();
		
//		//End Date Select
//		String date = "01/22/2021";
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/form/div[1]/div[1]/div[3]/div/div[2]/div[4]/div/div[1]/div/div/button")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div[2]/div/div[2]/div[6]/button/span[1]"));
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[contains(text(),'OK')]")).click();
//		Thread.sleep(5000);
//		WebElement Start = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/form/div[1]/div[1]/div[3]/div/div[2]/div[4]/div/div[1]/div/input"));
//		String Start_date = Start.getText();
//		System.out.println(Start_date);
		
		//Second Type for Select Data
//		driver.findElement(By.cssSelector("span.MuiIconButton-label > svg.MuiSvgIcon-root > path")).click();
//		Thread.sleep(5000);
//	    driver.findElement(By.xpath("//div[4]/div[5]/button/span/p")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.xpath("//div[2]/button[2]/span")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.xpath("//div[5]/div[6]/button/span/p")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.xpath("//div[2]/button[2]/span")).click();
//	    Thread.sleep(5000);

		//Promotion code Check
		String PromosionCode="Yes";
		if(PromosionCode.equals("Yes")) {
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/form/div[1]/div[1]/div[3]/div/div[2]/div[5]/span/span[1]/input")).click();
			Thread.sleep(5000);
		}else {
			System.out.println("You Havent Promotion Code");
		}
		
//		//Press Save Button After Fill all
//		driver.findElement(By.xpath("//span[contains(text(),'Save product')]")).click();
//		// get title in List Product
//		String titleListProduct = driver.getTitle();
//		Thread.sleep(5000);
//		if (titleListProduct.equals("Product List")) {
//			System.out.println("Correcly Go to the List Product Screen");
//		} else {
//			System.out.println("Save Process Have error");
//		}
//		
//		//Confirm Data submit successFull
//		// To find third row of table and its 4th Column
//		// Confirm Phone verify is true
//		WebElement baseTable = driver.findElement(By.tagName("table"));
//				
//		WebElement tableRow1 = baseTable.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]"));
//		Thread.sleep(5000);
//		WebElement cellIneed1 = tableRow1.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]/td[2]"));
//		String Value = cellIneed1.getText();
//		System.out.println(Value);
		
		
		Thread.sleep(10000);
		// Close the Browser
		driver.close();
		System.out.println("Success Your Project");

	}

}
