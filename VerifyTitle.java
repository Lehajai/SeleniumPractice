package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {

	@Test
    public void verifytitle() 


	{
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Project\\Study\\Selenium\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://itera-qa.azurewebsites.net/home/automation");
				driver.manage().window().maximize();
				String mytitle = driver.getTitle();
				System.out.println("The tite is "+mytitle);
				Assert.assertEquals(mytitle, "- Testautomation practice page");
				
				System.out.println("Test Completed");
				driver.close();
	}

}
