package com.training.utilities;

import static com.training.utilities.Contants.APPLICATION_PROPERTIES;
import static com.training.utilities.Contants.USER_DIR;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CommonUtilities {

	
	public String getApplicationProperty(String key) throws IOException{
		
		
		String sPath = USER_DIR + File.separator + APPLICATION_PROPERTIES;
		System.out.println(sPath);
		Properties property = new Properties();
		String value="";
		FileInputStream fileInput = new FileInputStream(sPath);
		
		property.load(fileInput);
		value = property.getProperty(key);
		System.out.println("Value recieved " + value);
		fileInput.close();
		return value;
	}
	
}
