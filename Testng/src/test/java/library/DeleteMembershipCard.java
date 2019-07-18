package library;

import org.json.JSONException;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Test
public class DeleteMembershipCard {
	// Rest Assured Automate
	public void membershipcard() throws JSONException {
		RequestSpecification request = RestAssured.given();
		Response response = request.delete("http://localhost:4020/MembershipCards");
		int code = response.getStatusCode();
		System.out.println(response.asString());

		Assert.assertEquals(code, 200);
	}

}
