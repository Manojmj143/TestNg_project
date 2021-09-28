package Multiple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EveningDress {
 public WebDriver driver;

public EveningDress(WebDriver driver2) {
		this.driver= driver2;
 		PageFactory.initElements(driver, this);
	 
 }
        @FindBy(xpath="//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
        private WebElement hr;

		public WebElement getHr() {
			return hr;
		}
		@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]")
		private WebElement printed;

		public WebElement getPrinted() {
			return printed;
		}
		@FindBy(xpath ="//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]")
		private WebElement quickview;

		public WebElement getQuickview() {
			return quickview;
		}
	/*
	 * @FindBy(xpath="//i[@class='icon-plus']") private WebElement plusclick;
	 * 
	 * public WebElement getPlusclick() { return plusclick; }
	 */
		
}
