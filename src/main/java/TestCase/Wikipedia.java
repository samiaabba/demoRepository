package TestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wikipedia {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\samia\\Downloads\\chromedriver_win32\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();//C:\Users\samia\Downloads\chromedriver_win32\chromedriver_win32
        driver.get("https://www.wikipedia.org/");
      /*  Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("English")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("searchInput")).sendKeys("software testing");
        Thread.sleep(5000);
        driver.findElement(By.id("searchButton")).click();
        Thread.sleep(5000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("scrollBy(0,2500)");
        driver.findElement(By.linkText("Cookie statement")).click();
        Thread.sleep(5000);
        driver.close();*/
       //webelents(list of elements)
        
      /* List<WebElement> links= driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        for(WebElement e:links)
        {
        System.out.println(e.getText());	
        	
        }*/
        
        driver.get("https://www.google.com/");
        
        driver.navigate().back();
        driver.navigate().forward();
	}

}
