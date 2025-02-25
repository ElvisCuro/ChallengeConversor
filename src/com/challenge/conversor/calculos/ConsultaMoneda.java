package com.challenge.conversor.calculos;

import com.challenge.conversor.modelos.Moneda;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    Moneda buscaMoneda(String monedaBase , String monedaTarget) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/3f3aa3002e5b3b532bf2334c/pair/" + monedaBase + "/" + monedaTarget);
        //System.out.println(direccion);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response= null;
        try {
            response = client.
                    send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return new Gson().fromJson(response.body(), Moneda.class);

    }
}

