package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {

	@Test
    public void selectDvalues() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Project\\Study\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		WebElement country = driver.findElement(By.xpath("//select[@class='custom-select']"));
		Select con = new Select(country);
	
		con.selectByIndex(2);
		Thread.sleep(3000);
		
		con.selectByValue("4");
		Thread.sleep(3000);
		
		con.selectByVisibleText("Denmark");
		Thread.sleep(2000);
		
		con.selectByValue("5");
		
		WebElement cont = con.getFirstSelectedOption();
		System.out.println("The entered values is "+cont.getText());
		
		

	}

}
