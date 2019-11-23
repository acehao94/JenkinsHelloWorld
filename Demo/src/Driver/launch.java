package Driver;
import org..openqa.selenium.WebDriver;

public class launch {
	public static void main(String arg[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	}

}
