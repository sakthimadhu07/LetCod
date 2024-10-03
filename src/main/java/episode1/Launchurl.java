package episode1;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchurl {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		System.out.println("LEtCode");
		System.out.println("LEtCode");
		System.out.println("LEtCode - Remote");
		System.out.println("LEtCode - Remote");
		System.out.println("LEtCode - Remote");
		System.out.println("LEtCode - Remote");
	}

}
