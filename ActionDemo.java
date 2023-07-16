package SeleniumAll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		
		WebElement doubclick=driver.findElement(By.id("doubleClickBtn"));
		
		WebElement rightclick=driver.findElement(By.id("rightClickBtn"));
		
		WebElement clickme=driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		Actions act=new Actions(driver);
		act.doubleClick(doubclick).perform();
		act.contextClick(rightclick).perform();
		act.click(clickme).perform();
		

	}

}
