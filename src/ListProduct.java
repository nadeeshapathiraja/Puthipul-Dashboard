import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListProduct {

	public static void main(String[] args) throws InterruptedException {

		BaseClass BaseClass = new BaseClass();
		WebDriver driver = BaseClass.BaseFunction();

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
			System.out.println("You are in List Product Screen");
		} else {
			System.out.println("You Are not in List Product Screen");
		}

		// Press Add Product Button
		driver.findElement(By.xpath("//span[@class='MuiButton-label'][contains(text(),'Add Product')]")).click();
		Thread.sleep(15000);

		// get title in List Product
		// get title in Add Product Screen
		String titleAddProduct = driver.getTitle();
		Thread.sleep(5000);
		if (titleAddProduct.equals("Product Create")) {
			System.out.println("Add Product button working Correctly");
		} else {
			System.out.println("Add Product button Not working");
		}
		Thread.sleep(15000);

		// Press Cancel Button
		driver.findElement(By.xpath("//span[contains(text(),'Cancel')]")).click();
		Thread.sleep(5000);

		// Confirm Phone verify is true
		WebElement baseTable = driver.findElement(By.tagName("table"));

		// To find third row of table and its 4th Column
		WebElement tableRowValue = baseTable.findElement(
				By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]"));
		Thread.sleep(5000);
		WebElement cellIneedValue = tableRowValue.findElement(By.xpath(
				"//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]/td[2]"));
		String valueOld = cellIneedValue.getText();
		System.out.println(valueOld);

		// Click Sort Button for test SORT
		driver.findElement(By.xpath("//select[@name='sort']")).click();
		Thread.sleep(5000);

		// You Can Change New Or Old Lists
		String value = "Old List";
		if (value.equals("New List")) {
			driver.findElement(By.xpath("//option[contains(text(),'Newest first')]")).click();

		} else {
			driver.findElement(By.xpath("//option[contains(text(),'Oldest first')]")).click();
		}

		// Get value after press sort
		// To find third row of table and its 4th Column
		WebElement tableRowValueNew = baseTable.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]"));
		Thread.sleep(5000);
		WebElement cellIneedValueNew = tableRowValueNew.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]/td[2]"));
		String valueNew = cellIneedValueNew.getText();
		System.out.println(valueOld);

		if (valueOld.equals(valueNew)) {
			System.out.println("Sort Use Newest List button");
		} else {
			System.out.println("Sort Use Oldest List button"); 
		}

		// Close Driver
		Thread.sleep(10000);
		// Close the Browser
		driver.close();
		System.out.println("Success Your Project");

	}

}
