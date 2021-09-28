package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Reader {
	
	public static Properties p;
	
	public Reader() throws Throwable {
		
		File f = new File("G:\\workspace\\Automation_practise_2021\\src\\main\\java\\configration\\configration.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p =new Properties();
		
		p.load(fis);
		}
	public String getBrowser() {
		String browser= p.getProperty("browser");
		return browser;
	}
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
		
		
	}
	public String getEmail() {
		String email = p.getProperty("db_Email");
		return email;
	}
	public String getpassword() {
		String password = p.getProperty("db_password");
		return password;
		
	}
	public int getsize() {
		String size = p.getProperty("db_size");
		return 2;
	}
	public String getorder3() {
		String order =p.getProperty("db_order");
		return order;
	}
	
}
