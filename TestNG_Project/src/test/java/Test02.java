import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class Test02 {
	
	// regres.in  -- post method
		 	@Test 	
		public void test1a()  {
			baseURI = "https://reqres.in";
			JSONObject request = new JSONObject();
	   		request.put("job", "yilmaz");
			given().
			contentType(ContentType.JSON).
			body(request.toJSONString()).
			when().post("/api/users").
			then().statusCode(201).log().all(); }	

}