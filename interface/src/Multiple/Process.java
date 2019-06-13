package Multiple;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Process implements Multi1,Multi2,Multi3
{
	static final Logger logger=Logger.getLogger(Process.class);
  public void information()
	{
	  PropertyConfigurator.configure("log4j.properties");
	  final BufferedWriter bf;

		
			   File sr=new File("c:\\test.html");
			   String html="<html>\r\n" + 
			   		"<head>\r\n" + 
			   		"<title>Student Details</title>\r\n" + 
			   		"</head>\r\n" + 
			   		"<body>\r\n" + 
			   		"<form>\r\n" + 
			   		"<h1 align=\"center\">Registration</h1><br>\r\n" + 
			   		"<h3 align=\"center\">Student Details</h3>\r\n" + 
			   		"<table align=\"center\" cellpadding=\"10\">\r\n" + 
			   		"<tr>\r\n" + 
			   		"<td>First Name :</td>\r\n" + 
			   		"<td><input type=\"text\" id=\"name\" name=\"name\" placeholder=\"Enter your First name\" required></td>\r\n" + 
			   		"</tr>\r\n" + 
			   		"<tr>\r\n" + 
			   		"<td>Last Name :</td>\r\n" + 
			   		"<td><input type=\"text\" id=\"name\" name=\"name\" placeholder=\"Enter your Last name\"></td>\r\n" + 
			   		"</tr>\r\n" + 
			   		"<tr>\r\n" + 
			   		"<td>Email :</td>\r\n" + 
			   		"<td><input type=\"email\" id=\"email\" name=\"email\" placeholder=\"Enter your email id\" required></td>\r\n" + 
			   		"</tr>\r\n" + 
			   		"<tr>\r\n" + 
			   		"<td>Phone no :</td>\r\n" + 
			   		"<td><input type=\"number\" id=\"no\" name=\"number\" placeholder=\"Enter your password\" required></td>\r\n" + 
			   		"</tr>\r\n" + 
			   		"<tr>\r\n" + 
			   		"<td>School Name :</td>\r\n" + 
			   		"<td><input type=\"text\" id=\"name\" name=\"name\" placeholder=\"Enter your School name\" required></td>\r\n" + 
			   		"</tr>\r\n" + 
			   		"<tr>\r\n" + 
			   		"<td>12th mark:</td>\r\n" + 
			   		"<td><input type=\"number\" id=\"number\" name=\"number\" placeholder=\"Enter your 12th mark\" required></td>\r\n" + 
			   		"</tr>\r\n" + 
			   		"<tr>\r\n" + 
			   		"<td>Cut off :</td>\r\n" + 
			   		"<td><input type=\"number\" id=\"no\" name=\"number\" placeholder=\"cut off\" required></td>\r\n" + 
			   		"</tr>\r\n" + 
			   		"<tr>\r\n" + 
			   		"<td>Password :</td>\r\n" + 
			   		"<td><input type=\"submit\" value=\"submit\" ></td>\r\n" + 
			   		"</tr>\r\n" + 
			   		"</table>\r\n" + 
			   		"</body>\r\n" + 
			   		"</html>";
			   try {
				bf = new BufferedWriter(new FileWriter(sr));
				bf.write(html);
				bf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
  public static void main(String []args)
  {
	  Process re=new Process();
	  re.information();
	  
  }
}

