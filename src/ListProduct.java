import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

		// Close Driver
		Thread.sleep(10000);
		// Close the Browser
		driver.close();
		System.out.println("Success Your Project");

	}

}
