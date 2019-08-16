
import java.lang.reflect.Modifier;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class jjhk {
	public static void main(String[] args) {
		GsonBuilder builder = new GsonBuilder();
		builder.excludeFieldsWithModifiers(Modifier.TRANSIENT);
		Gson gson = builder.create();
		mhjknm emp = new mhjknm();
		emp.setname(24);
		emp.setid("raj");
		emp.setpassword(1020);
		//Serialization 
		String jsonString = gson.toJson(emp);
		System.out.println(jsonString);
		//Deserialization
		emp = gson.fromJson(jsonString, mhjknm.class);
		System.out.println(emp.getname() + "\n" + emp.getid() + "\n" + emp.getpassword());
	}
}
