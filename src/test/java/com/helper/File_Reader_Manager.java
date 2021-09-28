package com.helper;


public class File_Reader_Manager {
	private  File_Reader_Manager() {
	}
	public static File_Reader_Manager getInstance() {
		File_Reader_Manager reader = new File_Reader_Manager();
		return reader;
		
	}
	public  Reader getInstanceC() throws Throwable {
		Reader rd1= new Reader();
		return rd1;
		
		
	}

}
