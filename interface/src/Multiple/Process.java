package Multiple;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
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
      final BufferedReader br;
		
			   File sr=new File("c:\\test.html");
			   String txt;
			   try {
				bf = new BufferedWriter(new FileWriter(sr));
				br =new BufferedReader(new FileReader(sr));
				bf.write(txt);
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

