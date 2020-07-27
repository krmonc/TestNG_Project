import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class Test1 {
	
	// regres.in  -- get method
			@Test
		public void Test1 () {
			baseURI = "https://reqres.in";
			given().get("/api/users/2").
			then().statusCode(200).log().all();	}

	}