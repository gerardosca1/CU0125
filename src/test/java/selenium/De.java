package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class De {
  @Test
  public void f() {
	  WebDriver driver =new ChromeDriver ();
		driver.get("https://google.com");
  }
}
