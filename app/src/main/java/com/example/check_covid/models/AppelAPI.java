package com.example.check_covid.models;


import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class AppelAPI {

    public static Response appelerApi() throws IOException {
        Response response = null ;
        URL url = new URL("https://api.covid19api.com/summary");
        HttpsURLConnection httpURLConnection = (HttpsURLConnection) url.openConnection();
        if(httpURLConnection.getResponseCode() == 200) {
            StringBuilder sb = new StringBuilder(1000000);
            InputStream is = httpURLConnection.getInputStream();
            BufferedReader reader = new BufferedReader((new InputStreamReader(is)));
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                sb.append(line);
            }
            is.close();
            httpURLConnection.disconnect();
            Gson gson = new Gson();
            String json = sb.toString();
            response = gson.fromJson(json, Response.class);
        }
        return response != null ?  response : null;
    }
}
