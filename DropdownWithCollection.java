
package day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownWithCollection {

	
	@Test
	public void Testcase2()  
	{
	System.setProperty("webdriver.chrome.driver","C:\\Project\\Study\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2019/01?_sm_au_=isVR43HrD1r3V7cQ1GNCfKt1q3J64");
		WebElement ele = driver.findElement(By.id("tools"));
		Select sel = new Select(ele);
		
		//Actual list from webpage 
		
		List list1 = new ArrayList();   
		List<WebElement> listele = sel.getOptions();		
		for(WebElement web: listele)
		{
			String data = ele.getText();
			list1.add(data);
			
		}
		
		// creating temp list
		
		List templist = new ArrayList();
		templist.addAll(list1);
		
		//sorting the temp list and comparing with actual list
		
		Collections.sort(templist);
		Assert.assertTrue(list1.equals(templist));
		
		
	}

}
