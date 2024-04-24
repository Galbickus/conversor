import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Lista {
    String apiKey = "copie aquí su apiKey";
    String direccion = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/USD";

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(direccion))
            .build();

    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

    String json = response.body();

    public Lista() throws IOException, InterruptedException {
    }

    public void imprimirLista(){
        System.out.println(json);
        String leyendaLista = """
                 Se imprimieron las tasas de conversión
                respecto al dólar estadounidense.
                 Tenga en cuenta que los códigos
                corresponden a las normas ISO 4217

                """;
        System.out.println(leyendaLista);
    }

}