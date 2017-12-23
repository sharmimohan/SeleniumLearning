package basicjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SelBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new InternetExplorerDriver();
		System.setProperty("webdriver.ie.exe", "D:\\Eclipse\\IE driver\\IEDriverServer.exe");
		

	}

}
