package com.atmecs.library;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.JSONException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class RegistrationForm 
{
    public static void registration()
    {
    	JSONObject obj = new JSONObject();
		System.out.println("Library Registration Form");
		obj.put("Name", "Kumar");
		obj.put("PhoneNumber", "9807645354");
		obj.put("EmailAddress", "kumar@gmail.com");

		JSONArray list = new JSONArray();
		list.add("Student");
		list.add("12th Standard");
		list.add("Government Higher Secondary School");
		obj.put("Occupation", list);
		FileWriter fw = null;
		try {
			fw = new FileWriter("myJSON.json");
			fw.write(obj.toString());
			fw.flush();
		} catch (IOException e) {
			System.out.println("please give the correct details" + e.getMessage());
		}

		System.out.println(obj);
    }
}
