package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ErrorMessage {

	@Test
    public void verifytitle() throws InterruptedException 


	{
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Project\\Study\\Selenium\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://itera-qa.azurewebsites.net/home/automation");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//a[@class=\"nav-link\"][@href=\"/Login\"]")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
				String msg = driver.findElement(By.xpath("//label[@class=\"alert-danger\"]")).getText();
				
				//Type1
				Assert.assertEquals(msg, "Wrong username or password");
				
				//Type2
				Assert.assertTrue(msg.contains("Wrong username or password"));
				
				
				driver.close();
	}

}
