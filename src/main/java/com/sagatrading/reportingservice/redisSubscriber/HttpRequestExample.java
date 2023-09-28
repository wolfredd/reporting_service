package com.sagatrading.reportingservice.redisSubscriber;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class HttpRequestExample {
    public void makeRequest() {
        // Create an instance of HttpClient
        HttpClient httpClient = HttpClient.newHttpClient();

        // Create the request body
        String requestBody = "Hello, World!";

        // Create an instance of HttpRequest with the desired URL and request body
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.example.com/data"))
                .header("Content-Type", "text/plain")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody, StandardCharsets.UTF_8))
                .build();

        try {
            // Send the HTTP request and get the response
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            // Retrieve the response body
            String responseBody = response.body();

            // Process the response
            System.out.println("Response Code: " + response.statusCode());
            System.out.println("Response Body: " + responseBody);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

