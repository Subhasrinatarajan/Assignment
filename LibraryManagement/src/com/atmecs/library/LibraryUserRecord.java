package com.atmecs.library;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryUserRecord {
	private static String memid;
	public static String name;
	private static String age;
	private static String gender;
	private static String email;
	private static String tot_bk_no;
	public static Scanner sc = new Scanner(System.in);
	public static File file = new File(
			"C:\\Users\\Subhasri.Natarajan\\eclipse-workspace\\LibraryManagement\\LibraryUserDetails.txt");

	public void createFile() {
		try {
			// Create the file
			if (file.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File already exists.");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void WriteFile() {
		try {
			System.out.println("Library User Membership Card Details :");
			System.out.println("Enter the Membership ID:");
			String memid = sc.next();
			System.out.println("Enter the Member Name:");
			String name = sc.next();
			System.out.println("Enter the Age:");
			String age = sc.next();
			System.out.println("Enter the Gender:");
			String gender = sc.next();
			System.out.println("Enter the Email Address:");
			String  email= sc.next();
			System.out.println("Enter the Membership book numbers:");
			String  tot_bk_no= sc.next();
			String textToAppend = memid + "," + name + "," + age + "," + gender +","+email+","+tot_bk_no+"\n";
			FileWriter f = new FileWriter(
					"C:\\Users\\Subhasri.Natarajan\\eclipse-workspace\\LibraryManagement\\LibraryUserDetails.txt", true);
			BufferedWriter bw = new BufferedWriter(f);

			bw.append(textToAppend);
			bw.flush();
			bw.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void adding() throws IOException {
		try {
			int s;
			FileReader reader = new FileReader(
					"C:\\Users\\Subhasri.Natarajan\\eclipse-workspace\\LibraryManagement\\LibraryUserDetails.txt");
			BufferedReader bw = new BufferedReader(reader);
			while ((s = bw.read()) != -1) {
				System.out.print((char) s);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	

}

