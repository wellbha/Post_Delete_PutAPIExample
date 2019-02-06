package restApiTesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostDeletePutAPIExp1 {

    @Test
    public void test1(){

        RequestSpecification request = RestAssured.given();
        request.header("Content-type","application/json");

//        JSONObject json = new JSONObject();
//        json.put("id","7");
//        json.put("title","Bhavin");
//        json.put("author","Learn API");
//        request.body(json.toJSONString());

        Response response = request.delete("http://localhost:3000/posts/6");

        int code = response.getStatusCode();
        Assert.assertEquals(code,200);
    }


}
