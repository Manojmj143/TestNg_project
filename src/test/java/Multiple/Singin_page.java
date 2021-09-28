package Multiple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Singin_page {
	public Singin_page(WebDriver driver2) {
		
		this.driver= driver2;
		PageFactory.initElements(driver, this);
		
	}


	public WebDriver driver;
	
	@FindBy(xpath ="//input[@id='email']")
    private WebElement email;

	public WebElement getEmail() {
		return email;
	}
	@FindBy(xpath ="//input[@id='passwd']")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	@FindBy(xpath ="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")
	private WebElement singin_btn;

	public WebElement getSingin_btn() {
		return singin_btn;
	
	}
	
   
	}

	

	
	
	
	

