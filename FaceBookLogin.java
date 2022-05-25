package Week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookLogin {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sumitha");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("V");
		
		driver.findElement(By.xpath("//input[contains(@name,'reg_')]")).sendKeys("9395734815");
		

		driver.findElement(By.xpath("//input[contains(@id,'password_')]")).sendKeys("Welcome123");
		
		
		WebElement selectBDate=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select selectBRDate = new Select(selectBDate);
		selectBRDate.selectByValue("11");
		
		WebElement elementBMonth=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select selectBMonth = new Select(elementBMonth);
		selectBMonth.selectByValue("5");
		
		WebElement elementBYear=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select selectBYear = new Select(elementBYear);
		selectBYear.selectByValue("1982");
		
		
		driver.findElement(By.xpath("//label[@class='_58mt']")).click();
		
		
		driver.close(); 
		
	}

}
//*[@id="u_0_2_La"]