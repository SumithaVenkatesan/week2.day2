package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		WebElement eleUserName= driver.findElement(By.id("username"));
		
		eleUserName.sendKeys("DemoSalesManager");
		
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.id("label")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Sumi");
		driver.findElement(By.id("lastNameField")).sendKeys("Venkat");
		
		driver.findElement(By.xpath("//input[contains(@id,'_firstNameLocal')]")).sendKeys("Jai");
		driver.findElement(By.xpath("//input[contains(@id,'_lastNameLocal')]")).sendKeys("sai");
		
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		driver.findElement(By.name("description")).sendKeys("Please complete the form");
		
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("nmsumitha.82@gmail.com");
		
		
		WebElement StateProvincedd=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select statedd= new Select(StateProvincedd);
		statedd.selectByVisibleText("New York");
		
	
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		
		driver.findElement(By.name("importantNote")).sendKeys("This is an important note");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

	
		
			
		
		
		
	}

}
