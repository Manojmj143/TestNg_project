package Multiple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocard {
 public WebDriver driver;

public Addtocard(WebDriver driver2) {
	 this.driver= driver2;
		PageFactory.initElements(driver, this);
	 
 }
      @FindBy(xpath = "//i[@class='icon-plus']")
      private WebElement Quantity;

	public WebElement getQuantity() {
		return Quantity;
	}
	@FindBy(xpath = "//select[@name='group_1']")
	private WebElement size;

	public WebElement getSize() {
		return size;
	}
	@FindBy (xpath ="//a[@id='color_24']")
    private WebElement color;

	public WebElement getColor() {
		return color;
	}
	@FindBy (xpath ="//span[contains(text(),'Add to cart')]")
	private WebElement order1;

	public WebElement getOrder1() {
		return order1;
	}
}
