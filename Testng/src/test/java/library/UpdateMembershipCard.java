package library;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Test
public class UpdateMembershipCard {
	// Rest Assured Automate
	public void membershipcard() throws JSONException {
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");

		JSONObject jmem = new JSONObject();
		jmem.put("email", "priya@gmail.com");
		jmem.put("membershipBookNo", "2");
		jmem.put("memName", "priya");
		jmem.put("phoneNo", "7890654312");
		jmem.put("memCardId", "1004");
	


		request.body(jmem.toString());

		Response response = request.put("http://localhost:4020/MembershipCard");
		int code = response.getStatusCode();
		System.out.println(response.asString());

		Assert.assertEquals(code, 201);
	}

}
