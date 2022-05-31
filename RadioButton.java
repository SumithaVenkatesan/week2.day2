package Week2.day2;

import java.util.*;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/radio.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
				
		//Are you enjoying the classes?
		System.out.println("The title is :" + driver.getTitle());
		String strTitle=driver.getTitle();
		if(strTitle.contains("TestLeaf"))
		{
			System.out.println("The page contains:Testleaf");
		}
		else
		{
			System.out.println("The page does not contains TestLeaf");
		}
		driver.findElement(By.xpath("//input [@id='yes']")).click();
		boolean selected=driver.findElement(By.xpath("//label[text()='Are you enjoying the classes?']/following-sibling::input[@id=\"yes\"]")).isSelected();
		System.out.println(selected);
		
		if(selected==true) {
			System.out.println("The default selected value is yes");
			
			} else {
				System.out.println("The value is No");
			}
		
		driver.findElement(By.xpath("//input[@name='news']")).click();
		boolean selected1=driver.findElement(By.xpath("//label[text()='Find default selected radio button']/following-sibling::input")).isSelected();
		System.out.println(selected1);
		
		if(selected1==true) {
			System.out.println("The default selected value is unchecked");
			
			} else {
				System.out.println("The value is checked");
			}
		
		//Age
		driver.findElement(By.xpath("//label[contains(text(),'Select your age group')]/following-sibling::input[@value='1']")).click();
		boolean selected2=driver.findElement(By.xpath("//label[contains(text(),'Select your age group')]/following-sibling::input[@value='1']")).isSelected();
		System.out.println(selected2);
	
	if(selected2==true) {
		System.out.println("selected age is between 21 to 40");
	}
	else {
		System.out.println("selected age is greater than 40" );
	
	}
	/*
	 * driver.findElement(By.
	 * xpath("//label[contains(text(),'Select your age group')]/following-sibling::input[@value='0']"
	 * )).click(); boolean selected3=driver.findElement(By.
	 * xpath("//label[contains(text(),'Select your age group')]/following-sibling::input[@value='1']"
	 * )).isSelected(); System.out.println(selected3); if(selected3==true) {
	 * System.out.println("selected age is between 1 to 20"); } else {
	 * System.out.println("selected age is between 21 to 40" );
	 * 
	 * }
	 */
	
	}	
}








