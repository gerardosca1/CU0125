package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DemoSelenium {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver ();
		driver.get("https://www.saucedemo.com/");
		
		//obteniendo objetos/webelements de la pagina
		
		WebElement userName= driver.findElement(By.id("user-name")); 
		WebElement password = driver.findElement(By.name("password"));
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		
		userName.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		loginBtn.click();
		
		//metodos del explorador
		
		String title= driver.getTitle();
		System.out.println("titulo de la pagina es : " + title);
		
		String url= driver.getCurrentUrl();
		System.out.println("la url de la pagina es : " + url);
		
		// Metodos de navegacion
		

		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();

		
		// verificar elemento en pantalla 
		
		boolean itemDisplayed = driver.findElement(By.className("inventory_item_name")).isDisplayed();
		
		if (itemDisplayed) {
			System.out.println("El item es desplehgado");
		}
		
		// obtener texto de un web element
		
		String prodName = driver.findElement(By.className("inventory_item_name")).getText();
		boolean prod= prodName.contains("Sauce Labs Backpack");
		
		if (prod) {
			System.out.println("esta correcto");
		}else {
			System.out.println("error: producto incorrecto");
			
			
		}
		
		//dropdown
		
		Select dropDownFilter= new Select(driver.findElement(By.className("product_sort_container")));
		dropDownFilter.selectByVisibleText("Price (low to high)");
		
		
		
		
		//cerrar el navegador web
		
		driver.close(); //cierra la pestña/ventana actual que el webdriver esta usando
		driver.quit(); //cierra todas las ventanas creadas por el web driver
		
		// DUDA MIERCOLES PARA DROPDOWS ¿HAY CASOS DONDE SE DEBA MANEJAR MEDIANTE LISTA CON JAVA?
			
		
	}

}
