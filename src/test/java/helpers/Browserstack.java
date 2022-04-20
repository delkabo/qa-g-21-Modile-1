package helpers;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Browserstack {
    public static String videoUrl(String sessionId) {
        return given()
                .auth().basic("kamils_PeB4qo", "hmVhFnNy5QKLCChqVfCd")
                .when()
                .get("https://api-cloud.browserstack.com/app-automate/sessions/" + sessionId +".json")
                .then()
                .log().body()
                .statusCode(200)
                .extract()
                .path("automation_session.video_url");


    }
}
