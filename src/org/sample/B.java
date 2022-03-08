package org.sample;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class B {
	
	public static class Propertie {
		public static void main(String[] args) throws IOException {
			 Properties properties=new Properties();
			 //FileReader read=new FileReader(new File("C:\\Users\\welcome\\eclipse-workspace\\FrameWork2\\config.properties"));
			 FileReader read=new FileReader(new File(System.getProperty("user.dir")+"\\config.properties"));

			 properties.load(read);
			 
			 String s = properties.get("url").toString();
			 System.out.println(s);
			 
			 String d = System.getProperty("user.dir");
			 System.out.println(d);
			 

		System.out.println("hello perf");
		
		}
		
		


	}}
