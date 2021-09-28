package Multiple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {
	public WebDriver driver;

	public Shipping (WebDriver driver2){
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='cgv']")
	private WebElement click1;

	public WebElement getClick1() {
		return click1;
	}

}
