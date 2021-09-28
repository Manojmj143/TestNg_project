package Multiple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed1 {
	public WebDriver driver;

	public Proceed1(WebDriver driver2) {
		 this.driver= driver2;
			PageFactory.initElements(driver, this);
		 
	}
	@FindBy(xpath ="//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]")
	private WebElement proceedcheck;

	public WebElement getProceedcheck() {
		return proceedcheck;
	}

}
