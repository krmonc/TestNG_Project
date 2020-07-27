import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;


public class Test2 {
	
	// regres.in  -- post method
		 	@Test 	
		public void test1a()  {
			baseURI = "https://reqres.in";
			JSONObject request = new JSONObject();
			users obj = new users();
			
			obj.setName("ali");
			
	   		request.put("name", obj.getName());
			given().
			contentType(ContentType.JSON).
			body(request.toJSONString()).
			when().post("/api/users").
			then().statusCode(201).log().all(); }	

}