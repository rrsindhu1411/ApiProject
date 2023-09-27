package org.apiPackages;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class APINew {
	public static void main(String[] args) {
		try {
			FileReader read=new FileReader("C:\\Users\\Windows\\eclipse-workspace\\ApiProject\\src\\test\\resources\\DemoApi\\Sample.json");
			JSONParser jp=new JSONParser();
			try {
				Object obj=jp.parse(read);
				JSONObject job=(JSONObject) obj;
				String name=(String) job.get("Name");
				System.out.println(name);
				String course=(String) job.get("course");
				System.out.println(course);
				JSONArray jarr=(JSONArray) job.get("subject");
				for(Object x: jarr) {
					System.out.println(x);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
