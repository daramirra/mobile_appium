package helpers;

import config.Project;

import static io.restassured.RestAssured.given;

public class BrowserstackVideoUrlBuilder implements VideoUrlBuilder {
    @Override
    public String buildVideoUrl(String sessionId) {
        return given()
                .auth().basic(Project.browserstackConfig.browserstackUser(), Project.browserstackConfig.browserstackKey())
                .when()
                .get("https://api-cloud.browserstack.com/app-automate/sessions/" + sessionId + ".json")
                .then()
                .statusCode(200)
                .extract()
                .response()
                .path("automation_session.video_url");
    }
}
