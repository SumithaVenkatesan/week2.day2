package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {

	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
				
		driver.findElement(By.xpath("//label[text()='Select the languages that you know?']/following-sibling::input[1]")).click();
		driver.findElement(By.xpath("//label[text()='Select the languages that you know?']/following-sibling::input[2]")).click();
		driver.findElement(By.xpath("//label[text()='Select the languages that you know?']/following-sibling::input[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following-sibling::input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following-sibling::input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following-sibling::input[3]")).click();
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following-sibling::input[4]")).click();
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following-sibling::input[5]")).click();
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following-sibling::input[6]")).click();
		
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
