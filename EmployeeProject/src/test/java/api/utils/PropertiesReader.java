package api.utils;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import jdk.nashorn.internal.parser.JSONParser;

public class PropertiesReader {

	
		 public static Properties readValues(String filePath) throws IOException
		 {			
			  FileInputStream stream;
			  Properties properties = new Properties();			 
		      stream = new FileInputStream(filePath);
		      properties.load(stream);		 
		      return properties;
		 }	
		 
		
	
}
