package DatComs.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:/Iswariya/Eclipse Stuffs/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriver driver1= new ChromeDriver();
		driver1.get("https://accounts.datoms.io/login");
		WebElement email=driver1.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("xyz@gmail.com");
		WebElement password=driver1.findElement(By.xpath("//input[@id='password']"));
		email.sendKeys("xyz#246");
		driver1.findElement(By.xpath("//input[@id='form_submit_btn']")).click();
		WebElement errormessage=driver1.findElement(By.xpath("//input[@Value='Login']"));
		// If user face any kind of invalid/empty input field error message
		System.out.println(errormessage.getText());
		driver1.findElement(By.xpath("//div[@id='forgot_pswd']/a")).click();
		String actualUrl=" https://accounts.datoms.io/login ";
		String expectedUrl= driver1.getCurrentUrl();
		
		}
		
}
