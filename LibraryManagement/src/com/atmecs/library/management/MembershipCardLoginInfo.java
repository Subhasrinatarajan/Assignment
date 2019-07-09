package com.atmecs.library.management;

import java.lang.reflect.Modifier;

import com.atmecs.library.MembershipCardLoginCrediential;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MembershipCardLoginInfo {
	public static void main(String[] args) {
		GsonBuilder builder = new GsonBuilder();
		builder.excludeFieldsWithModifiers(Modifier.TRANSIENT);
		Gson gson = builder.create();
		MembershipCardLoginCrediential mcc = new MembershipCardLoginCrediential();
		mcc.setname("Divya");
		mcc.setid("CC001");
		mcc.setpassword("sdsfj23jb");
		//Serialization 
		String jsonString = gson.toJson(mcc);
		System.out.println(jsonString);
		//Deserialization
		mcc = gson.fromJson(jsonString, MembershipCardLoginCrediential.class);
		System.out.println(mcc.getname() + "\n" + mcc.getid() + "\n" + mcc.getpassword());
	}
}
