import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Portal implements Serializable
{
       public String name;
       public String id;
       public transient String password;
   public static void main(String [] args) 
   {
      Portal port=new Portal();
	     port.name="Kumar";
         port.id="CC001";
         port.password="kumar@123";
      
      
      try {
         FileOutputStream fileOut =new FileOutputStream("C:\\Users\\Subhasri.Natarajan\\Documents\\process\\memportal.txt");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(port);
         out.close();
         fileOut.close();
         System.out.println("Your Serialized data is securely saved in memportal.txt");
         }
      catch(FileNotFoundException e1)
      {
    	  e1.printStackTrace();
      }
      catch (IOException i) {
         i.printStackTrace();
      }
   }
}