package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class lianxi {
@Test
public void openchrome() {
	System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.baidu.com");
}
}
