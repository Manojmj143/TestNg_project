package Multiple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	public WebDriver driver;

	public Payment(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]")
	private WebElement finish;

	public WebElement getFinish() {
		return finish;
	}

}
