package week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailUnique {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		WebElement fromstation = driver.findElement(By.id("txtStationFrom")); 
		fromstation.clear(); 
		fromstation.sendKeys("CTO",Keys.TAB); 
		WebElement tostation = driver.findElement(By.id("txtStationTo")); 
		tostation.clear(); 
		tostation.sendKeys("KCG",Keys.TAB); 

		driver.findElement(By.xpath("//label[text()='Sort on Date']")).click(); 
		driver.findElement(By.id("buttonFromTo")).click(); 
		Thread.sleep(500); 
		List<String> trainname=new ArrayList<String>(); 
		List<WebElement> table = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr/td[2]")); 

		for (WebElement column : table) { 
			String text = column.getText(); 
			System.out.println(text); 
			trainname.add(text); 
	}	     

		System.out.println(trainname);
		int size = trainname.size();
		System.out.println(size);
		
		Set<String> trainnameset = new HashSet<String>();
		int size1 = trainnameset.size();
		System.out.println(size1);
		
	}

}
