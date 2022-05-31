package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinks {

	
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Link.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		String homelink = driver.findElement(By.linkText("Go to Home Page")).getAttribute("href"); 
		driver.findElement(By.linkText("Go to Home Page")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h5[text()='HyperLink']/parent::a")).click();
		
		String attribute=driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println(attribute);
		
		Thread.sleep(2000);
		
		String broken=driver.findElement(By.linkText("Verify am I broken?")).getAttribute("href");
		
		if(broken.contains("error"))
		{
			System.out.println("yes i am broken:" +broken);	
			driver.findElement(By.linkText("Verify am I broken?")).click();
		}
		else {
			System.out.println("No i am not broken");
		}
		Thread.sleep(2000);		
		driver.get("http://www.leafground.com/pages/Link.html");
	}

}
