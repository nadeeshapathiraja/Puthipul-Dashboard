import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InactiveUserList {

	public static void main(String[] args) throws InterruptedException {
		
		BaseClass BaseClass = new BaseClass();
		WebDriver driver = BaseClass.BaseFunction();
		
		
		// Click UserManagement
		driver.findElement(By.xpath("//span[contains(text(),'User Management')]")).click();
		Thread.sleep(5000);

		// if press List active user
		driver.findElement(By.xpath("//span[text()='List Inactive Users']")).click();
		Thread.sleep(15000);

		// Active UserScreen
		// get title in Active Users screen
		String titleActiveU = driver.getTitle();
		if (titleActiveU.equals("Customer List")) {
			System.out.println("You Are In Correct Page");
		} else {
			System.out.println("You Are In InCorrect Page");
		}
		Thread.sleep(10000);

		// Confirm Phone verify is true
		WebElement baseTable = driver.findElement(By.tagName("table"));

		// To find 3rd row of table and its 4th Column
		WebElement tableRow3 = baseTable.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/table/tbody/tr[3]"));
		Thread.sleep(5000);
		WebElement cellIneed3 = tableRow3.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/table/tbody/tr[3]/td[4]"));
		String valueIneed3 = cellIneed3.getText();
		
		// To find 6th row of table and its 4th Column
		WebElement tableRow6 = baseTable.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/table/tbody/tr[6]"));
		Thread.sleep(5000);
		WebElement cellIneed6 = tableRow6.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/table/tbody/tr[6]/td[4]"));
		String valueIneed6 = cellIneed6.getText();
		
		// To find 1st row of table and its 1st Column for get the phone number
		WebElement tableRow1 = baseTable.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]"));
		Thread.sleep(5000);
		WebElement cellIneed1 = tableRow1.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]/td[2]"));
		String valueIneed1 = cellIneed1.getText();
		Thread.sleep(5000);
		System.out.println(valueIneed1);
		//Confirm User in COrrect Page     .size();
		if(valueIneed3.equals("Yes") && valueIneed6.equals("Yes")) {
			System.out.println("You are In Active User Page");
		}else if(valueIneed3.equals("No") && valueIneed3.equals("No")) {
			System.out.println("You are In Inactive User Page");
		} else {
			System.out.println("You are in Wrong Page");
		}
		Thread.sleep(5000);
		//Press Edit button and go to the Edit user Page
		driver.findElement(By.xpath("//tr[1]//td[6]//button[1]//span[1]//*[local-name()='svg']")).click();
		Thread.sleep(15000);
		
		//Validate User in Correct Edit Page
		WebElement edit_page = driver.findElement(By.xpath("//h3[text()='Edit Customer']"));
		String textEditPage = edit_page.getText();
		if(textEditPage.equals("Edit Customer")) {
			System.out.println("User In Edit Customer Page");
		}else {
			System.out.println("User In Not in Edit Customer Page");
		}
		Thread.sleep(10000);

		//##################################Can't Check###############################################
		
		//Get Input field Value
		WebElement inputBox = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div[1]/div[1]/div/div/input"));
		String textInsideInputBox = inputBox.getAttribute("value");
		System.out.println(textInsideInputBox);
		System.out.println(valueIneed1);
		Thread.sleep(10000);

		//Phone Number Field not empty and equal to first one
		if(!textInsideInputBox.equals("")) {
			if(textInsideInputBox.equals(valueIneed1)) {
				System.out.println("You are In Correct Edit Page");
			}else {
				System.out.println("You are In Incorrect Edit Page");
			}
		}else {
			System.out.println("Somting Wrong");
		}
		Thread.sleep(5000);
		
		
		//Clear All Input Fields //Set Values For Text Fields
		WebElement email = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div[1]/div[2]/div/div/input"));
		if(email.equals("")) {
			email.sendKeys("pqr@gmail.com");
		}else {
			email.clear();
			email.sendKeys("pqr@gmail.com");
			email.sendKeys(Keys.SPACE, Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		
		WebElement fname = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div[1]/div[3]/div/div/input"));
		if(fname.equals("")) {
			fname.sendKeys("Nadeesha");
		}else {
			fname.clear();
			fname.sendKeys("Nadeesha");
			fname.sendKeys(Keys.SPACE, Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		
		WebElement lname = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div[1]/div[4]/div/div/input"));
		if(lname.equals("")) {
			lname.sendKeys("Nadeesha");
		}else {
			lname.clear();
			lname.sendKeys("Pathiraja");
			fname.sendKeys(Keys.SPACE, Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		
		//Click Update Button
		driver.findElement(By.xpath("//span[text()='Update Customer']")).click();
		Thread.sleep(15000);
	
//		//Check Is it Updated Successful 
//		WebElement tableRowEdit2 = baseTable.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]"));
//		Thread.sleep(5000);
//		WebElement cellIneedEdit2 = tableRowEdit2.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]/td[3]"));
//		String valueIneedEdit2 = cellIneedEdit2.getText();
//		Thread.sleep(10000);
//		if(valueIneedEdit2.equals("Nadeesha Pathiraja")) {
//			System.out.println("Update Successfull");
//		}else {
//			System.out.println("Update Unsuccessfull");
//		}
		
		
		
//		//Delete Row 1   
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]/td[6]/button[2]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[text()='Yes']")).click();
//		
//		//After Delete Row 1
//		WebElement tableRowD1 = baseTable.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]"));
//		Thread.sleep(5000);
//		WebElement cellIneedD1 = tableRowD1.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]/td[1]"));
//		String valueIneedD1 = cellIneedD1.getText();
//		Thread.sleep(15000);
//		//Compare Before and After Values
//		if(!valueIneed1.equals(valueIneedD1)) {
//			System.out.println("Delete Successfull");
//		}else {
//			System.out.println("Delete Unsuccessfull");
//		}
	
		//Get value Before press sort
		WebElement valueIneedold1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]/td[2]/div"));
		String valueIneedold = valueIneedold1.getText();
		Thread.sleep(5000);
		
				
		//Click Sort Button for test SORT
		driver.findElement(By.xpath("//select[@name='sort']")).click();
		Thread.sleep(5000);
		
		//You Can Change New Or Old Lists
		String value = "Old List"; 
		if(value.equals("New List")) {
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[1]/div[3]/div/select/option[1]")).click();
					
		}else {
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[1]/div[3]/div/select/option[2]")).click();
		}
		
		//Get value after press sort
		WebElement cellIneedN1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]/td[2]/div"));
		String valueIneedNew1 = cellIneedN1.getText();
		Thread.sleep(5000);
				
		if(valueIneedold.equals(valueIneedNew1)) {
			System.out.println("Sort Use Newest List button");
		}else{
			System.out.println("Sort Use Oldest List button");
		}
		
		//Get value after press sort
		WebElement PagignationOld = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]/td[2]/div"));
		String PagignationValueOld = PagignationOld.getText();
		System.out.println(PagignationValueOld);
		Thread.sleep(5000);
		
		//Press Next Button
		driver.findElement(By.xpath("//div[@class='MuiTablePagination-actions']//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorInherit']//span[@class='MuiIconButton-label']//*[local-name()='svg']")).click(); 
	
		//Get value after press sort
		WebElement PagignationNew = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]/td[2]"));
		String PagignationValueNew = PagignationNew.getText();
		System.out.println(PagignationValueNew);
		Thread.sleep(5000);
		
		if(!PagignationValueOld.equals(PagignationValueNew)) {
			System.out.println("Next Button Working Correctly");
		}else{
			System.out.println("Next Button Not Working");
		}
		Thread.sleep(15000);
		//Take Old Record Count
		List<WebElement> OldRows = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/table/tbody/tr"));
		int OldCount = OldRows.size();
		System.out.println(OldCount);
		
		
		if(OldCount>=10) {
			//Press Record number
			driver.findElement(By.xpath("//div[@class='MuiSelect-root MuiSelect-select MuiTablePagination-select MuiSelect-selectMenu MuiInputBase-input']")).click();
			//Select Record Count
			driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[3]")).click();
			Thread.sleep(5000);
			//Take New Record Count
			List<WebElement> NewRows = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/table/tbody/tr"));
			int NewCount = NewRows.size();
			System.out.println(NewCount);
			////if you want to check old count should grater than 10
			
			if(OldCount!=NewCount) {
				System.out.println("Record Number Change Button Press Success");
			}else{
				System.out.println("Record Number Change Button Press Unsuccess");
			}
		}else {
			//Press Record number
			driver.findElement(By.xpath("//div[@class='MuiSelect-root MuiSelect-select MuiTablePagination-select MuiSelect-selectMenu MuiInputBase-input']")).click();
			//Select Record Count
			driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]")).click();
			Thread.sleep(5000);
			//Take New Record Count
			List<WebElement> NewRows = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/table/tbody/tr"));
			int NewCount = NewRows.size();
			System.out.println(NewCount);
			////if you want to check old count should grater than 10
			
			if(OldCount!=NewCount) {
				System.out.println("Record Number Change Button Press Success");
			}else{
				System.out.println("Record Number Change Button Press Unsuccess");
			}
		}
		
		
		// Close Driver
		Thread.sleep(10000);
		// Close the Browser  
		driver.close();
		System.out.println("Success Your Project");
	}
	
}