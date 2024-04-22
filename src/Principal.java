import com.google.gson.Gson;
import modelos.Cotizacion;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) throws IOException, InterruptedException {
        String apiKey = "no voy a subir la clave a gitHub en un repo publico";
        String direccion = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/USD";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new Gson();

        Cotizacion cotizacion = gson.fromJson(json, Cotizacion.class);


        /*
        * """
        *       ***************************
                Seleccione la moneda de origen:
                1.  ARS: Peso argentino
                2.  BOB: Boliviano boliviano
                3.  BRL: Real brasileño
                4.  COP: Peso colombiano
                5.  CNY: Yuan chino
                6.  EGP: Libra egipcia
                7.  AUD: Dólar australiano
                8.  PEN: Sol peruano
                9.  MXN: Peso mexicano
                10. USD: Dólar estadounidense
                0.  Salir
                ***************************
                """;*/


    }
}
