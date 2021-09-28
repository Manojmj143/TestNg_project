package com.TestNg_project;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class My_Tranform implements IAnnotationTransformer {
	
	public void transfrom(ITestAnnotation annotation, Class testClass) {
		
		annotation.setRetryAnalyzer(Retry.class);
	}

}
