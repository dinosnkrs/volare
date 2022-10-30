/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Andrew
 */
public class Mavenproject1 {

    public static void main(String[] args) throws IOException, InterruptedException {
        // create a client
        var client = HttpClient.newHttpClient();

        // create a request
        var request = HttpRequest.newBuilder(
               URI.create("https://api.yelp.com/v3/businesses/search?location=Irvine"))
           .header("Authorization", "Bearer 3o_u2bBsT1eqZpcWyXieioztYe6xRgdamijaAMBDml7lW_FV02L7-d_62VvdsraFQFB2wYKnp94K6NvC7g461b-qG_-bk9qZH9X5Xbz0jXbam6FwxiU8vBP8QqFVY3Yx")
           .build();
            

        // use the client to send the request
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        JSONObject obj = new JSONObject(response.body());
        // the response:
        System.out.println(obj);

    }
}
