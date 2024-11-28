package auto;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
       driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("saranya");
       Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("saranya6664u@gmail.com");
	   driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("test");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9845678767");
	   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[4]/div[2]/div[1]/div[2]/p")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[5]/div[1]/div[1]/button")).click();
	   Runtime.getRuntime().exec("C:\\Users\\FRAMEIT\\Desktop\\Software Testing\\Selenium Automation\\fileupload.exe");
	   
	}

}
