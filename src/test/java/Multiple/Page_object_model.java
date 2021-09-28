package Multiple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.Return;

public class Page_object_model {
	
public WebDriver driver;
	
	private  Home_page hp;
	
	private Singin_page  sp;
	
	private DressLogin dl;
	
	private EveningDress ED;
	
	private Addtocard AD;
	
	private Proceed1 P1;
	
	private Summary SY;
	
	private Address_page Ap;
	
	private  Shipping Sg;
	
	private Payment Pt;
	
	public Page_object_model(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	 public Home_page getInstanceHP () {
    	hp = new Home_page(driver);
		return hp;
    }
    public Singin_page getInstanceSP() {
    	sp = new Singin_page(driver);
		return sp;
    	
     
	
 }
    public DressLogin getInstanceDL() {
    	dl = new DressLogin(driver);
		return dl;
    	
    }
    public EveningDress getInstanceED() {
    	ED = new EveningDress(driver);
		return ED;
    	
    }
    public Addtocard getInstanceAD() {
    	AD = new Addtocard(driver);
		return AD;
    	
    }
    public Proceed1 getInstanceP1() {
    	P1 = new Proceed1(driver);
		return P1;
    	
    }
    public Summary getInstanceSY() {
    	SY = new Summary(driver);
		return SY;
    	
    }
    public Address_page getInstanceAP() {
    	Ap = new Address_page(driver);
    	return Ap;
    	
    }
    public Shipping getInstanceSG() {
    	Sg = new Shipping(driver);
		return Sg;
    	
    }
    public Payment getInstancePT() {
    	Pt = new Payment(driver);
		return Pt;
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
 