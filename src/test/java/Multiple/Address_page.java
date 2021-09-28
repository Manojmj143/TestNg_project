package Multiple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_page {
	public WebDriver driver;

	public Address_page(WebDriver driver2) {
		
		this.driver= driver2;
			PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/textarea[1]")
	private WebElement order3;

	public WebElement getOrder3() {
		return order3;
	}	
	@FindBy(xpath ="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")
	private WebElement click;

	public WebElement getClick() {
		return click;
	}

}
