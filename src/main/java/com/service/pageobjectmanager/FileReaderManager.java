package com.service.pageobjectmanager;

import java.io.FileNotFoundException;

import com.snow.config.ConfigFileReader;

public class FileReaderManager {
	private  static ConfigFileReader configFileReader;
	 
	private static FileReaderManager fileReaderManager = new FileReaderManager();


	private FileReaderManager() {
	}

	 public static FileReaderManager getInstance( ) {
	      return fileReaderManager;
	 }

	 public ConfigFileReader getConfigReader() {
		
			
			
				try {
					//fileReaderManager=null;
					return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
				} catch (FileNotFoundException e) {
				
					e.printStackTrace();
				}
				return configFileReader;
			
		
		
	 
}
}