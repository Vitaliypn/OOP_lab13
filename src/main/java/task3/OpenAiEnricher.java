package task3;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Scanner;

public class OpenAiEnricher {
    public static Map<String, String> extract(String domain) throws IOException {

        String API_KEY = "";
        URL url = new URL(domain);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("X-Api-Key", API_KEY);
        connection.connect();
        String text = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
        System.out.println(text);
        return null;
    }
}
