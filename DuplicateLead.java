package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		WebElement eleUserName= driver.findElement(By.id("username"));
		
		eleUserName.sendKeys("DemoSalesManager");
		
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//driver.findElement(By.xpath("//a[contains(test(),'CRM/SFA')]")).click();
		
		driver.findElement(By.id("label")).click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();

		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("nmsumitha82@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
													
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String value = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).getText();	
		String firstName = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
		
		System.out.println("First Name: "+firstName);
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		
		String title = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		
		if (title.equalsIgnoreCase("Duplicate Lead")) {
			driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
			String duplicateLeadName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
			if(duplicateLeadName.equalsIgnoreCase(firstName)) {
				System.out.println("Yes, its same name....");
			}
		}
		//driver.close(); 
	}
}
