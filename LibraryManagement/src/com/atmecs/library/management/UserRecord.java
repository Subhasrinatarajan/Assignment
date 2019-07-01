package com.atmecs.library.management;

import java.io.IOException;

import com.atmecs.library.LibraryUserRecord;

public class UserRecord
{
	public static void main(String[] args) throws IOException {
		LibraryUserRecord st = new LibraryUserRecord();
		st.createFile();
		st.WriteFile();

		st.adding();

	}
}
