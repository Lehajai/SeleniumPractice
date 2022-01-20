package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dropdown01 {

	@Test
    public void selectDvalues() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Project\\Study\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		WebElement country = driver.findElement(By.xpath("//select[@class='custom-select']")); // Selecting the Element from Web
		Select con = new Select(country); // to access dropdown list 
		
	// To get the count of elements in dropdown
		
		List<WebElement> ele = con.getOptions();
		int con_size = ele.size();
		
	// Adding Assertion  to check the expected count
		
		Assert.assertEquals(con_size, 11);
		System.out.println("Total country "+con_size);
		
		for(WebElement element:ele)
		{
			String countryName = element.getText();
			System.out.println("List of Countries are "+countryName);
		}
		

	}

}
