package com.servicenow.readxml;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class getOrVal {
	public String getORvalue(String data)
	{
		try {
	File inputFile = new File("C:\\Users\\chaurma\\eclipse-workspace\\SnowNowPageObjectFramework\\ObjectRepository.xml");									
    SAXReader saxReader = new SAXReader();					
    Document document;
	
		document = saxReader.read(inputFile);
							
    String GoogleSearch =document.selectSingleNode("//menu/"+data).getText();
   
    data=GoogleSearch;
	}
    catch (DocumentException e) {
		
		e.printStackTrace();
	}
		return data;
		
	}

	
}
