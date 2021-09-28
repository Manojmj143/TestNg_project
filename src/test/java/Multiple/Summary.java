package Multiple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary {
	public WebDriver driver;

	public Summary(WebDriver driver2) {
		 this.driver= driver2;
			PageFactory.initElements(driver, this);
	}
       @FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]")
       private WebElement order2;

	public WebElement getOrder2() {
		return order2;
	}	
}
