package com.TestNGFramework.DataReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DataFromPropertiesFile {
  @Test
  public void dataReadFromFile() throws IOException
  {
	  //path of file
	  File f1=new File(System.getProperty("user.dir")+"//ConfigData//config.properties");
	  
	  //read in stream
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //declare object of Properties class
	  Properties prop=new Properties();
	  
	  //load the file 
	  prop.load(fs);
	  
	  //read the file data using getProperty(key)--->value
	  System.out.println("Browser Name: "+prop.getProperty("bname"));
	  System.out.println(prop.getProperty("url"));
	  System.out.println(prop.getProperty("un"));
	  System.out.println(prop.getProperty("psw"));
	  
  }
}
