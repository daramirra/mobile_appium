package helpers;

public class SelenoidVideoUrlBuilder implements VideoUrlBuilder {
    @Override
    public String buildVideoUrl(String sessionId) {
        return "https://selenoid.autotests.cloud/video/" + sessionId + ".mp4";
    }
}
