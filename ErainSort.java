package week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErainSort {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement fromstation = driver.findElement(By.id("txtStationFrom")); 
		fromstation.clear(); 
		fromstation.sendKeys("CTO",Keys.TAB); 
		WebElement tostation = driver.findElement(By.id("txtStationTo")); 
		tostation.clear(); 
		tostation.sendKeys("KCG",Keys.TAB); 

		driver.findElement(By.xpath("//label[text()='Sort on Date']")).click(); 
		driver.findElement(By.id("buttonFromTo")).click(); 
		Thread.sleep(1000); 
		List<String> stationname=new ArrayList<String>(); 
		List<WebElement> table = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr/td[2]")); 

		for (WebElement column : table) { 
			String text = column.getText(); 
			System.out.println(text); 
			stationname.add(text); 
	}	     
		Collections.sort(stationname); 
		System.out.println(stationname); 
	}

}
