package com.atmecs.library;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class RegistrationConversion 
{
   public static void conversion()
   {
	   JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("myJSON.json"));
			JSONObject jsonobj = (JSONObject) obj;
			String name = (String) jsonobj.get("Name");
			System.out.println("Name :" + name);
			String pno = (String) jsonobj.get("PhoneNumber");
			System.out.println("Phone Number :" + pno);
			String email = (String) jsonobj.get("EmailAddressEmail");
			System.out.println("EmailAddress :" + email);

			JSONArray jaobj = (JSONArray) jsonobj.get("Occupation");
			Iterator<String> iterator = jaobj.iterator();
			System.out.println("   Occupation  ");
			while (iterator.hasNext()) {

				System.out.println(iterator.next());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
   }
}
