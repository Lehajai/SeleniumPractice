package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Project\\Study\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Admin");
		WebElement radio = driver.findElement(By.xpath("//input[@class='form-check-input'][@id='male']"));
		String names = radio.getAttribute("id");
		System.out.println(names);
		if(names.equalsIgnoreCase("Male"))
		{
		radio.click();
		}

		System.out.println(driver.findElement(By.tagName("img")).getSize());
		//driver.close();


	}

}
