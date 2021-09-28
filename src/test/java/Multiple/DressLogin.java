package Multiple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressLogin {
	 public WebDriver driver;

	 	
	 	public DressLogin(WebDriver driver2) {
	 		this.driver= driver2;
	 		PageFactory.initElements(driver, this);
	}

		@FindBy(xpath="//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
	 	private WebElement women;


		public WebElement getWomen() {
			return women;
		}

	 

}
