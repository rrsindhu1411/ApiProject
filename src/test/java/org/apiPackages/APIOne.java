package org.apiPackages;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import gherkin.deps.com.google.gson.JsonParser;

public class APIOne {
	public static  void main(String[] args) throws FileNotFoundException  {
		
			FileReader read=new FileReader("C:\\Users\\Windows\\eclipse-workspace\\MySqlProj\\src\\test\\resources\\DemoApi\\Sample.json");
			JSONParser jp=new JSONParser();
			
			
				Object obj=new JsonParser();
				JSONObject jobj=(JSONObject)obj;
				String name=(String) jobj.get("Name");
				System.out.println(name);
				String course=(String) jobj.get("course");
				System.out.println(course);
				
//				JSONArray jarr=(JSONArray) jobj.get("subject");
//				for(Object x:jarr) {
//					System.out.println(x);
					
				//}
	}	
}
